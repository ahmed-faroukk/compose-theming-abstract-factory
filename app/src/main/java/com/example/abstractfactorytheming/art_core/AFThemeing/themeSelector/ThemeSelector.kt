package com.example.abstractfactorytheming.art_core.AFThemeing.ui

import CustomAppText
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactory
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactoryProvider
import com.example.abstractfactorytheming.art_core.AFThemeing.themes.AFDarkTheme
import com.example.abstractfactorytheming.art_core.AFThemeing.themes.AFGalaxyTheme
import com.example.abstractfactorytheming.art_core.AFThemeing.themes.AFLightTheme

enum class AppTheme {
    Dark, Light, Galaxy
}

@Composable
fun ThemeSelectorUI() {
    var selectedTheme by remember { mutableStateOf(AppTheme.Dark) }

    // Apply theme based on the selected one
    setTheme(selectedTheme)

    // Main container for the UI
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(ColorFactoryProvider.colorFactory.appBackgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Title text
        CustomAppText(
            text = "Select Theme",
            fontWeight = FontWeight.Bold,
            color = ColorFactoryProvider.colorFactory.textColor
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Theme selection buttons
        ThemeSelectionRow(selectedTheme) { newTheme -> selectedTheme = newTheme }
    }
}

@Composable
fun ThemeSelectionRow(selectedTheme: AppTheme, onThemeSelected: (AppTheme) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(ColorFactoryProvider.colorFactory.appBackgroundColor)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // Create theme selection buttons for each theme
        ThemeButton(AFLightTheme(), selectedTheme == AppTheme.Light) { onThemeSelected(AppTheme.Light) }
        Spacer(modifier = Modifier.width(10.dp))
        ThemeButton(AFDarkTheme(), selectedTheme == AppTheme.Dark) { onThemeSelected(AppTheme.Dark) }
        Spacer(modifier = Modifier.width(10.dp))
        ThemeButton(AFGalaxyTheme(), selectedTheme == AppTheme.Galaxy) { onThemeSelected(AppTheme.Galaxy) }
    }
}

@Composable
fun ThemeButton(theme: ColorFactory, isSelected: Boolean, onClick: () -> Unit) {
    val borderColor = if (isSelected) theme.buttonBackgroundColor.copy(alpha = 0.8f) else Color.DarkGray

    Box(
        modifier = Modifier
            .size(40.dp) // Dot size
            .border(10.dp, borderColor, CircleShape)
            .background(borderColor, CircleShape)
            .padding(8.dp)
            .clickable { onClick() }
        , // Padding for circle border

    )
}


fun setTheme(selectedTheme: AppTheme) {
    ColorFactoryProvider.colorFactory = when (selectedTheme) {
        AppTheme.Dark -> AFDarkTheme()
        AppTheme.Light -> AFLightTheme()
        AppTheme.Galaxy -> AFGalaxyTheme()
    }
}
