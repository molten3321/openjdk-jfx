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

package javafx.scene.control;

/**
Builder class for javafx.scene.control.ProgressBar
@see javafx.scene.control.ProgressBar
@deprecated This class is deprecated and will be removed in the next version
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class ProgressBarBuilder<B extends javafx.scene.control.ProgressBarBuilder<B>> extends javafx.scene.control.ProgressIndicatorBuilder<B> {
    protected ProgressBarBuilder() {
    }
    
    /** Creates a new instance of ProgressBarBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.control.ProgressBarBuilder<?> create() {
        return new javafx.scene.control.ProgressBarBuilder();
    }
    
    /**
    Make an instance of {@link javafx.scene.control.ProgressBar} based on the properties set on this builder.
    */
    public javafx.scene.control.ProgressBar build() {
        javafx.scene.control.ProgressBar x = new javafx.scene.control.ProgressBar();
        applyTo(x);
        return x;
    }
}
