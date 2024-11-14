package com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.abstractfactorytheming.art_core.AFThemeing.themes.AFDarkTheme

object ColorFactoryProvider {
    var colorFactory by mutableStateOf<ColorFactory>(AFDarkTheme())
}

