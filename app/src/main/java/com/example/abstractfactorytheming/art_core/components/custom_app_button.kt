package com.farouk.androidtask.art_core.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import com.example.abstractfactorytheming.art_core.AFThemeing.abstractFactory.ColorFactoryProvider

@Composable
fun CustomAppButton(
    text: String,
    fontSize: TextUnit = 16.sp,
    paddingVertical: Float = 14f,
    width: Float = 0f,
    height: Float = 48f,
    fontWeight: FontWeight = FontWeight.Normal,
    colorText: Color = ColorFactoryProvider.colorFactory.buttonTextColor,
    borderColor: Color = ColorFactoryProvider.colorFactory.buttonBackgroundColor, // Use theme primary color
    borderWidth: Float = 1f,
    unActive: Boolean = false,
    loading: Boolean = false,
    backGroundColor: Color = ColorFactoryProvider.colorFactory.buttonBackgroundColor, // Use theme primary color
    isTransparentColor: Boolean = false,
    onTap: () -> Unit = {},
    loadingColor: Color = MaterialTheme.colorScheme.onPrimary // Use theme onPrimary color for loading
) {
    val bgColor = when {
        unActive -> backGroundColor.copy(alpha = 0.5f)
        isTransparentColor -> backGroundColor.copy(alpha = 0.1f)
        else -> backGroundColor
    }

    Box(
        modifier = Modifier
            .let { if (width > 0) it.width(width.dp) else it.fillMaxWidth() }
            .height(height.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(bgColor)
            .border(
                border = BorderStroke(borderWidth.dp, borderColor),
                shape = RoundedCornerShape(8.dp)
            )
            .clickable(enabled = !unActive && !loading) { onTap() }
            .padding(vertical = paddingVertical.dp),
        contentAlignment = Alignment.Center
    ) {
        if (loading) {
            CircularProgressIndicator(color = loadingColor)
        } else {
            Text(
                text = text,
                color = colorText,
                fontSize = fontSize,
                fontWeight = fontWeight,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}
