package com.example.abstractfactorytheming.art_core.AFThemeing.themes

import androidx.compose.ui.graphics.Color
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactory

    class AFDarkTheme : ColorFactory {
        /************************ Main App Background ************************/
        override val appBackgroundColor = Color.Black

        /************************ App Bottom Navigation Bar ************************/
        override val bottomNavBackgroundColor = Color.DarkGray

        /************************ Buttons ************************/
        override val buttonBackgroundColor = Color.White
        override val buttonTextColor = Color.Black

        /************************ Text Inputs ************************/
        override val textBoxTextColor = Color.White
        override val textBoxBackgroundColor = Color.Black

        /************************ App Bar ************************/
        override val appBarBackgroundColor = Color.Gray
        override val appBarTextColor = Color.White

        /************************ Status Bar ************************/
        override val statusBarBackgroundColor = Color.Black

        /************************ Card/Container Backgrounds ************************/
        override val cardBackgroundColor = Color.DarkGray

        /************************ Divider/Separator Lines ************************/
        override val dividerColor = Color.Gray

        /************************ Loading/Progress Indicators ************************/
        override val loadingSpinnerColor = Color.White

        /************************ Normal Text ************************/
        override val textColor = Color.White
        override val textBgColor = Color.Black
    }

