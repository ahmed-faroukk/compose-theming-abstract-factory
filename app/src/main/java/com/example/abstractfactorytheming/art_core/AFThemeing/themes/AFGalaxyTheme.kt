package com.example.abstractfactorytheming.art_core.AFThemeing.themes
import androidx.compose.ui.graphics.Color
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactory

class AFGalaxyTheme : ColorFactory {
    /************************ Buttons ************************/
    override val buttonBackgroundColor: Color = Color(0xFF800080) // Purple
    override val buttonTextColor: Color = Color(0xFFFFFFFF) // White

    /************************ Text Inputs ************************/
    override val textBoxTextColor: Color = Color(0xFFE8A1FF) // Lavender
    override val textBoxBackgroundColor: Color = Color(0xFF4B0082) // Indigo

    /************************ Main App Background ************************/
    override val appBackgroundColor: Color = Color(0xFF2E2A47) // Dark Galactic Blue

    /************************ App Bottom Navigation Bar ************************/
    override val bottomNavBackgroundColor: Color = Color(0xFF4C148C) // Dark Violet

    /************************ App Bar ************************/
    override val appBarBackgroundColor: Color = Color(0xFF6A0DAD) // Bright Purple
    override val appBarTextColor: Color = Color(0xFFFFFFFF) // White

    /************************ Status Bar ************************/
    override val statusBarBackgroundColor: Color = Color(0xFF2C1B6B) // Dark Purple

    /************************ Card/Container Backgrounds ************************/
    override val cardBackgroundColor: Color = Color(0xFF4B0082) // Indigo

    /************************ Divider/Separator Lines ************************/
    override val dividerColor: Color = Color(0xFFAA99FF) // Light Purple

    /************************ Loading/Progress Indicators ************************/
    override val loadingSpinnerColor: Color = Color(0xFF9B4DFF) // Electric Purple

    /************************ Normal Text ************************/
    override val textColor: Color = Color(0xFFE6E6FA) // Lavender
    override val textBgColor: Color = Color(0xFF1A0A56) // Deep Space Purple
}
