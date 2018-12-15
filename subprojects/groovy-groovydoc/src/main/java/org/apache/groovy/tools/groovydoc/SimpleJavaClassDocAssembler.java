/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.groovy.tools.groovydoc;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.AnnotationDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.codehaus.groovy.groovydoc.GroovyClassDoc;
import org.codehaus.groovy.tools.groovydoc.LinkArgument;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

public class SimpleJavaClassDocAssembler {
    private final String packagePath;
    private final String javaSourceContent;
    private final String className;
    private final List<LinkArgument> links;
    private final Properties properties;
    private final Map<String, GroovyClassDoc> classDocs = new LinkedHashMap<>();

    public SimpleJavaClassDocAssembler(String packagePath, String file, String javaSourceContent, List<LinkArgument> links, Properties properties) {
        this.packagePath = packagePath;
        this.javaSourceContent = javaSourceContent;
        this.links = links;
        this.properties = properties;

        if (file != null && file.contains(".")) {
            // todo: replace this simple idea of default class name
            int idx = file.lastIndexOf(".");
            className = file.substring(0, idx);
        } else {
            className = file;
        }
    }

    private Map<String, GroovyClassDoc> parse() {
        new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(JavadocComment comment, Object arg) {
                super.visit(comment, arg);

                System.out.println(collect(comment));
//
//                String title = String.format("%s (%s)", comment.getName(), packagePath);
//                System.out.println(title);
//                System.out.println(comment.get());
//                System.out.println("--------------------------");
//                Javadoc javadoc = comment.get().asJavadocComment().parse();
//                System.out.println(javadoc.getDescription().toText());
//                javadoc.getBlockTags().forEach(e -> System.out.println(e.getName() + ":" + e.getContent()));
//                System.out.println("===========================");
            }
        }.visit(JavaParser.parse(javaSourceContent), null);

        return classDocs;
    }

    private static String collect(JavadocComment comment) {
        Optional<Node> commentedNode = comment.getCommentedNode();

        if (!commentedNode.isPresent()) {
            return null;
        }

        Node node = commentedNode.get();

        if (node instanceof MethodDeclaration) {
            MethodDeclaration methodDeclaration = (MethodDeclaration) node;
            return "Method " + methodDeclaration.getDeclarationAsString();
        }
        if (node instanceof ConstructorDeclaration) {
            ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration) node;
            return "Constructor " + constructorDeclaration.getDeclarationAsString();
        }
        if (node instanceof FieldDeclaration) {
            FieldDeclaration fieldDeclaration = (FieldDeclaration) node;
            List<String> varNames = fieldDeclaration.getVariables().stream().map(v -> v.getName().getId()).collect(Collectors.toList());
            return "Field " + String.join(", ", varNames);
        }
        if (node instanceof EnumConstantDeclaration) {
            EnumConstantDeclaration enumConstantDeclaration = (EnumConstantDeclaration) node;
            return "Enum Constant" + enumConstantDeclaration.getName();
        }
        if (node instanceof ClassOrInterfaceDeclaration) {
            ClassOrInterfaceDeclaration classOrInterfaceDeclaration = (ClassOrInterfaceDeclaration) node;

            if (classOrInterfaceDeclaration.isInterface()) {
                return "Interface " + classOrInterfaceDeclaration.getName() + ": " + comment.parse().getDescription().toText();
            } else {
                return "Class " + classOrInterfaceDeclaration.getName() + ": " + comment.parse().getDescription().toText();
            }
        }
        if (node instanceof EnumDeclaration) {
            EnumDeclaration enumDeclaration = (EnumDeclaration) node;
            return "Enum " + enumDeclaration.getName();
        }
        if (node instanceof AnnotationDeclaration) {
            AnnotationDeclaration annotationDeclaration = (AnnotationDeclaration) node;
            return "Annotation " + annotationDeclaration.getName();
        }

        return node.toString();
    }
}