package com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory
import androidx.compose.ui.graphics.Color

interface ColorFactory {

    /************************ Main App Background ************************/
    val appBackgroundColor: Color

    /************************ App Bottom Navigation Bar ************************/
    val bottomNavBackgroundColor: Color

    /************************ Buttons ************************/
    val buttonBackgroundColor: Color
    val buttonTextColor: Color

    /************************ Text Inputs ************************/
    val textBoxTextColor: Color
    val textBoxBackgroundColor: Color

    /************************ App Bar ************************/
    val appBarBackgroundColor: Color
    val appBarTextColor: Color

    /************************ Status Bar ************************/
    val statusBarBackgroundColor: Color

    /************************ Card/Container Backgrounds ************************/
    val cardBackgroundColor: Color

    /************************ Divider/Separator Lines ************************/
    val dividerColor: Color

    /************************ Loading/Progress Indicators ************************/
    val loadingSpinnerColor: Color

    /************************ Normal Text ************************/
    val textColor: Color
    val textBgColor: Color
}
