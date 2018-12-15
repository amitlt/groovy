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

import org.codehaus.groovy.groovydoc.GroovyAnnotationRef;
import org.codehaus.groovy.groovydoc.GroovyClassDoc;
import org.codehaus.groovy.groovydoc.GroovyConstructorDoc;
import org.codehaus.groovy.groovydoc.GroovyFieldDoc;
import org.codehaus.groovy.groovydoc.GroovyMethodDoc;
import org.codehaus.groovy.groovydoc.GroovyPackageDoc;
import org.codehaus.groovy.groovydoc.GroovyType;

public class SimpleGroovyClassDoc implements GroovyClassDoc {
    @Override
    public GroovyConstructorDoc[] constructors() {
        return new GroovyConstructorDoc[0];
    }

    @Override
    public GroovyConstructorDoc[] constructors(boolean filter) {
        return new GroovyConstructorDoc[0];
    }

    @Override
    public boolean definesSerializableFields() {
        return false;
    }

    @Override
    public GroovyFieldDoc[] enumConstants() {
        return new GroovyFieldDoc[0];
    }

    @Override
    public GroovyFieldDoc[] fields() {
        return new GroovyFieldDoc[0];
    }

    @Override
    public GroovyFieldDoc[] properties() {
        return new GroovyFieldDoc[0];
    }

    @Override
    public GroovyFieldDoc[] fields(boolean filter) {
        return new GroovyFieldDoc[0];
    }

    @Override
    public GroovyClassDoc findClass(String className) {
        return null;
    }

    @Override
    public GroovyClassDoc[] importedClasses() {
        return new GroovyClassDoc[0];
    }

    @Override
    public GroovyPackageDoc[] importedPackages() {
        return new GroovyPackageDoc[0];
    }

    @Override
    public GroovyClassDoc[] innerClasses() {
        return new GroovyClassDoc[0];
    }

    @Override
    public GroovyClassDoc[] innerClasses(boolean filter) {
        return new GroovyClassDoc[0];
    }

    @Override
    public GroovyClassDoc[] interfaces() {
        return new GroovyClassDoc[0];
    }

    @Override
    public GroovyType[] interfaceTypes() {
        return new GroovyType[0];
    }

    @Override
    public boolean isAbstract() {
        return false;
    }

    @Override
    public boolean isExternalizable() {
        return false;
    }

    @Override
    public boolean isSerializable() {
        return false;
    }

    @Override
    public GroovyMethodDoc[] methods() {
        return new GroovyMethodDoc[0];
    }

    @Override
    public GroovyMethodDoc[] methods(boolean filter) {
        return new GroovyMethodDoc[0];
    }

    @Override
    public GroovyFieldDoc[] serializableFields() {
        return new GroovyFieldDoc[0];
    }

    @Override
    public GroovyMethodDoc[] serializationMethods() {
        return new GroovyMethodDoc[0];
    }

    @Override
    public boolean subclassOf(GroovyClassDoc gcd) {
        return false;
    }

    @Override
    public GroovyClassDoc superclass() {
        return null;
    }

    @Override
    public GroovyType superclassType() {
        return null;
    }

    @Override
    public String getFullPathName() {
        return null;
    }

    @Override
    public String getRelativeRootPath() {
        return null;
    }

    @Override
    public GroovyAnnotationRef[] annotations() {
        return new GroovyAnnotationRef[0];
    }

    @Override
    public GroovyClassDoc containingClass() {
        return null;
    }

    @Override
    public GroovyPackageDoc containingPackage() {
        return null;
    }

    @Override
    public boolean isFinal() {
        return false;
    }

    @Override
    public boolean isPackagePrivate() {
        return false;
    }

    @Override
    public boolean isPrivate() {
        return false;
    }

    @Override
    public boolean isProtected() {
        return false;
    }

    @Override
    public boolean isPublic() {
        return false;
    }

    @Override
    public boolean isStatic() {
        return false;
    }

    @Override
    public String modifiers() {
        return null;
    }

    @Override
    public int modifierSpecifier() {
        return 0;
    }

    @Override
    public String qualifiedName() {
        return null;
    }

    @Override
    public String commentText() {
        return null;
    }

    @Override
    public String getRawCommentText() {
        return null;
    }

    @Override
    public boolean isAnnotationType() {
        return false;
    }

    @Override
    public boolean isAnnotationTypeElement() {
        return false;
    }

    @Override
    public boolean isClass() {
        return false;
    }

    @Override
    public boolean isConstructor() {
        return false;
    }

    @Override
    public boolean isDeprecated() {
        return false;
    }

    @Override
    public boolean isEnum() {
        return false;
    }

    @Override
    public boolean isEnumConstant() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public boolean isException() {
        return false;
    }

    @Override
    public boolean isField() {
        return false;
    }

    @Override
    public boolean isIncluded() {
        return false;
    }

    @Override
    public boolean isInterface() {
        return false;
    }

    @Override
    public boolean isMethod() {
        return false;
    }

    @Override
    public boolean isOrdinaryClass() {
        return false;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void setRawCommentText(String arg0) {

    }

    @Override
    public String firstSentenceCommentText() {
        return null;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }

    /**
     * The qualified name of this type excluding any dimension information.
     * For example, a two dimensional array of String returns "<code>java.lang.String</code>".
     */
    @Override
    public String qualifiedTypeName() {
        return null;
    }

    /**
     * The unqualified name of this type excluding any dimension or nesting information.
     * For example, the class <code>Outer.Inner</code> returns "<code>Inner</code>".
     */
    @Override
    public String simpleTypeName() {
        return null;
    }

    /**
     * The unqualified name of this type excluding any dimension information.
     * For example, a two dimensional array of String returns "<code>String</code>".
     */
    @Override
    public String typeName() {
        return null;
    }
}
