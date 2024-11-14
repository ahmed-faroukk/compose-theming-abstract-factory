package com.farouk.androidtask.art_core.components
import CustomAppText
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearchField(
    modifier: Modifier = Modifier,
    text: String,
    hintText: String = "بحث",
    controller: (String) -> Unit = {},
    onChanged: (String) -> Unit = {},
    suffixIcon: @Composable () -> Unit = { Spacer(modifier = Modifier.width(0.dp)) }, // Default to empty spacer
    hintTextFontSize: Float = 16F,
    textFontSize: Float = 16f,
    maxLines : Int = 2 ,
    searchBtnOnTap: () -> Unit = {}
) {
    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        value = text,
        maxLines = maxLines,
        onValueChange = {
            onChanged(it)
            controller(it)
        },
        placeholder = {
            CustomAppText(
                text = hintText, // Use hint text instead of text for placeholder
                fontSize = textFontSize,
                color = MaterialTheme.colorScheme.onPrimary,
                maxLines = 2
            // Updated to use theme color
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedTextColor = MaterialTheme.colorScheme.onBackground, // Updated for focused text color
            unfocusedTextColor = MaterialTheme.colorScheme.onBackground, // Updated for unfocused text color
            cursorColor = MaterialTheme.colorScheme.primary, // Updated to use primary color
            errorCursorColor = Color.Red // You can keep this as is
        ),
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = MaterialTheme.colorScheme.primary // Updated to use primary color
            )
        },
        trailingIcon = {
            Row(
                modifier = Modifier.padding(end = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                suffixIcon() // Always calls suffixIcon, will render empty by default
                Spacer(modifier = Modifier.width(4.dp))
                CustomAppButton(
                    onTap = { searchBtnOnTap() },
                    width = 80f,
                    backGroundColor = MaterialTheme.colorScheme.primary, // Updated for button background
                    text = hintText,
                    colorText = MaterialTheme.colorScheme.onPrimary, // Updated for button text color
                    fontSize = hintTextFontSize.sp
                )
            }
        },
        enabled = true
    )
}
