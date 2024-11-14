/*
package com.farouk.androidtask.art_core.components
import CustomAppText
import android.os.Vibrator
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farouk.androidtask.core.enums.PinViewType
import com.farouk.androidtask.core.extentions.getType
import kotlinx.coroutines.delay

*/
/*
* usage example
*   var (pinValue, onPinValueChange) = remember { mutableStateOf("") }
*   PinView(pinText = pinValue, onPinTextChange ={newText ->   onPinValueChange(newText)  })
* *//*


@Composable
fun PinView(
    pinText: String,
    onPinTextChange: (String) -> Unit,
    digitColor: Color = colorScheme.primary,
    digitSize: TextUnit = 20.sp,
    containerSize: Dp = digitSize.value.dp * 2,
    digitCount: Int = 4,
    type: PinViewType = PinViewType.UNDER_LINE,
    unFocusUnderLineColor: Color = Color.Gray,
    focusUnderLineColor: Color =  colorScheme.primary,


    ) {
    BasicTextField(value = pinText,
        onValueChange = onPinTextChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        decorationBox = {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(digitCount) { index ->
                    DigitView(
                        index,
                        pinText,
                        digitColor,
                        digitSize,
                        containerSize,
                        type = type,
                        unFocusUnderLineColor = unFocusUnderLineColor,
                        focusUnderLineColor = focusUnderLineColor
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        })
}
@Composable
private fun DigitView(
    index: Int,
    pinText: String,
    digitColor: Color,
    digitSize: TextUnit,
    containerSize: Dp,
    type: PinViewType = PinViewType.UNDER_LINE,
    unFocusUnderLineColor: Color = colorScheme.surface,
    focusUnderLineColor: Color =  colorScheme.primary,

    ) {
    val modifier = if (type.getType() == 1) {
        Modifier
            .size(containerSize)
            .border(
                width = 1.dp,
                color = digitColor,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(bottom = 3.dp)
    } else Modifier.width(containerSize)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomAppText(
            text = if (index >= pinText.length) "" else pinText[index].toString(),
            color = digitColor,
            modifier = modifier,
            textAlign = TextAlign.Center,
            fontSize = 25f
        )
        if (type.getType() == 0) {
            Spacer(modifier = Modifier.height(2.dp))
            Box(
                modifier = Modifier
                    .background(if (index >= pinText.length) unFocusUnderLineColor else focusUnderLineColor)
                    .height(2.dp)
                    .width(containerSize)
            )
        }
    }
}

*/
