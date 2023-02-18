package com.simple_and_advanced_calculator.data

import androidx.annotation.StringRes
import java.util.stream.Stream
import kotlin.streams.toList

data class ButtonData(
    @StringRes val buttonName: Int,
    val functionName: String
)

val simpleCalculatorButton = listOf<ButtonData>(

)

val advancedCalculatorButton = Stream.concat(
    simpleCalculatorButton.stream(),
    listOf<ButtonData>(

    ).stream()
).toList()
