/* 
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.control.cell;

/**
Builder class for javafx.scene.control.cell.TextFieldTreeCell
@see javafx.scene.control.cell.TextFieldTreeCell
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.2
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class TextFieldTreeCellBuilder<T, B extends javafx.scene.control.cell.TextFieldTreeCellBuilder<T, B>> extends javafx.scene.control.TreeCellBuilder<T, B> {
    protected TextFieldTreeCellBuilder() {
    }
    
    /** Creates a new instance of TextFieldTreeCellBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.cell.TextFieldTreeCellBuilder<T, ?> create() {
        return new javafx.scene.control.cell.TextFieldTreeCellBuilder();
    }
    
    private boolean __set;
    public void applyTo(javafx.scene.control.cell.TextFieldTreeCell<T> x) {
        super.applyTo(x);
        if (__set) x.setConverter(this.converter);
    }
    
    private javafx.util.StringConverter<T> converter;
    /**
    Set the value of the {@link javafx.scene.control.cell.TextFieldTreeCell#getConverter() converter} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B converter(javafx.util.StringConverter<T> x) {
        this.converter = x;
        __set = true;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.control.cell.TextFieldTreeCell} based on the properties set on this builder.
    */
    public javafx.scene.control.cell.TextFieldTreeCell<T> build() {
        javafx.scene.control.cell.TextFieldTreeCell<T> x = new javafx.scene.control.cell.TextFieldTreeCell<T>();
        applyTo(x);
        return x;
    }
}
