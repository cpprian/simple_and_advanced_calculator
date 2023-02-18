package com.simple_and_advanced_calculator.data

import androidx.annotation.StringRes
import com.simple_and_advanced_calculator.R

const val THREE_TOP_CALCULATOR_BUTTONS = 3

data class ButtonData(
    @StringRes val buttonName: Int,
    val functionName: String
)

val leaveButton = ButtonData(R.string.leave_button_name, "leaveView")

val startViewButtonList = listOf<ButtonData>(
    ButtonData(R.string.exit_button_name, "exitApp"),
    ButtonData(R.string.calculate_button_name, "openCalcView"),
    ButtonData(R.string.about_button_name, "aboutView"),
)

val simpleCalculatorButtonList = listOf<ButtonData>(
    ButtonData(R.string.all_clear_button_name, "allClear"),
    ButtonData(R.string.clear_operation_button_name, "clearOperation"),
    ButtonData(R.string.change_sign_button_name, "changeSign"),
    ButtonData(R.string.seven_button_name, "addFigure"),
    ButtonData(R.string.eight_button_name, "addFigure"),
    ButtonData(R.string.nine_button_name, "addFigure"),
    ButtonData(R.string.division_button_name, "divisionCalc"),
    ButtonData(R.string.four_button_name, "addFigure"),
    ButtonData(R.string.five_button_name, "addFigure"),
    ButtonData(R.string.six_button_name, "addFigure"),
    ButtonData(R.string.multiply_button_name, "multiplyCalc"),
    ButtonData(R.string.one_button_name, "addFigure"),
    ButtonData(R.string.two_button_name, "addFigure"),
    ButtonData(R.string.three_button_name, "addFigure"),
    ButtonData(R.string.minus_button_name, "subtractCalc"),
    ButtonData(R.string.zero_button_name, "addFigure"),
    ButtonData(R.string.dot_button_name, "addCalc"),
    ButtonData(R.string.equal_button_name, "returnResult"),
    ButtonData(R.string.plus_button_name, "addCalc")
)

val advancedCalculatorButtonList =
    simpleCalculatorButtonList.take(THREE_TOP_CALCULATOR_BUTTONS) +
    listOf<ButtonData>(
        ButtonData(R.string.sinus_button_name, "sinCalc"),
        ButtonData(R.string.cos_button_name, "cosCalc"),
        ButtonData(R.string.tan_button_name, "tanCalc"),
        ButtonData(R.string.ln_button_name, "lnCalc"),
        ButtonData(R.string.sqrt_button_name, "sqrtCalc"),
        ButtonData(R.string.square_button_name, "powerCalc"),
        ButtonData(R.string.yth_power_button_name, "powerCalc"),
        ButtonData(R.string.log_button_name, "logCalc"),
    ) +
    simpleCalculatorButtonList.takeLast(simpleCalculatorButtonList.size - THREE_TOP_CALCULATOR_BUTTONS)