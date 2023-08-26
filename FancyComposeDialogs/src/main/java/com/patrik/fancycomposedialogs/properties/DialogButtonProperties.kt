package com.patrik.fancycomposedialogs.properties

import androidx.compose.ui.graphics.Color
import com.patrik.fancycomposedialogs.R
import com.patrik.fancycomposedialogs.ui.DarkBlackText

data class DialogButtonProperties(
    var positiveButtonText: Int = R.string.yes,
    var negativeButtonText: Int = R.string.no,
    var neutralButtonText: Int = R.string.ok,
    var buttonColor: Color = Color.LightGray.copy(alpha = 0.4F),
    var buttonTextColor: Color = DarkBlackText
)
