package com.simple_and_advanced_calculator.view.calculator

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.simple_and_advanced_calculator.data.ButtonData

@Composable
fun SimpleCalculatorScreen(modifier: Modifier = Modifier) {
    // todo: add registers

    // todo: fill screen with buttons from
    // java/com/simple_and_advanced_calculator/data/ButtonData.kt
}

@Composable
fun CalculatorButton(button: ButtonData) {
    Button(onClick = {  }) {
        Text(stringResource(id = button.buttonName))
    }
}