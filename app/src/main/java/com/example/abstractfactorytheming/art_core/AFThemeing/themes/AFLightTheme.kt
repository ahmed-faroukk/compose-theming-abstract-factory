package com.example.abstractfactorytheming.art_core.AFThemeing.themes

import androidx.compose.ui.graphics.Color
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactory

class AFLightTheme : ColorFactory {
    /************************ Buttons ************************/
    override val buttonBackgroundColor = Color(0xFF2196F3) // Purple
    override val buttonTextColor = Color(0xFFFFFFFF) // White

    /************************ Text Inputs ************************/
    override val textBoxTextColor = Color(0xFF000000) // Black
    override val textBoxBackgroundColor = Color(0xFFF1F1F1) // Light Gray

    /************************ Main App Background ************************/
    override val appBackgroundColor = Color(0xFFFFFFFF) // White

    /************************ App Bottom Navigation Bar ************************/
    override val bottomNavBackgroundColor = Color(0xFFBB86FC) // Light Purple

    /************************ App Bar ************************/
    override val appBarBackgroundColor = Color(0xFF6200EE) // Purple
    override val appBarTextColor = Color(0xFFFFFFFF) // White

    /************************ Status Bar ************************/
    override val statusBarBackgroundColor = Color(0xFF3700B3) // Dark Purple

    /************************ Card/Container Backgrounds ************************/
    override val cardBackgroundColor = Color(0xFFF5F5F5) // Very Light Gray

    /************************ Divider/Separator Lines ************************/
    override val dividerColor = Color(0xFFBDBDBD) // Light Gray

    /************************ Loading/Progress Indicators ************************/
    override val loadingSpinnerColor = Color(0xFF6200EE) // Purple

    /************************ Normal Text ************************/
    override val textColor = Color(0xFF000000) // Black
    override val textBgColor = Color(0xFFFFFFFF) // White
}
