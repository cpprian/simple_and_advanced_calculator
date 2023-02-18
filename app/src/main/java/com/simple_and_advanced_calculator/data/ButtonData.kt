package com.simple_and_advanced_calculator.data

import androidx.annotation.StringRes
import java.util.stream.Stream
import kotlin.streams.toList

data class ButtonData(
    @StringRes val buttonName: Int,
    val functionName: String
)

val simpleCalculatorButtonList = listOf<ButtonData>(

)

val advancedCalculatorButtonList = Stream.concat(
    simpleCalculatorButtonList.stream(),
    listOf<ButtonData>(

    ).stream()
).toList()
