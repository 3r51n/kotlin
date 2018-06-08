/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.presentation

import com.intellij.ide.util.PsiElementListCellRenderer
import com.intellij.psi.presentation.java.SymbolPresentationUtil
import org.jetbrains.kotlin.idea.util.module
import org.jetbrains.kotlin.psi.KtDeclaration

class KtActualDeclarationListCellRenderer : PsiElementListCellRenderer<KtDeclaration>() {
    override fun getContainerText(element: KtDeclaration, name: String?) = ""

    override fun getIconFlags() = 0

    override fun getElementText(element: KtDeclaration): String =
        SymbolPresentationUtil.getSymbolPresentableText(element) + " from " + (element.module?.name ?: "<unknown module>")
}