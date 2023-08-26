package com.patrik.fancycomposedialogs.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.patrik.fancycomposedialogs.R
import com.patrik.fancycomposedialogs.enums.DialogActionType
import com.patrik.fancycomposedialogs.enums.DialogStyle
import com.patrik.fancycomposedialogs.properties.DialogButtonProperties

@Composable
fun ErrorFancyDialog(
    showTitle: Boolean = true,
    title: String = "",
    showMessage: Boolean = true,
    message: String = "",
    dialogStyle: DialogStyle = DialogStyle.NORMAL,
    dialogActionType: DialogActionType = DialogActionType.ACTIONABLE,
    dialogProperties: DialogButtonProperties = DialogButtonProperties(),
    fontFamily: FontFamily = FontFamily.Default,
    isCancelable: Boolean = true,
    dismissTouchOutside: () -> Unit,
    positiveButtonClick: () -> Unit = {},
    negativeButtonClick: () -> Unit = {},
    neutralButtonClick: () -> Unit = {}
) {

    val positiveButtonText = stringResource(dialogProperties.positiveButtonText)
    val negativeButtonText = stringResource(dialogProperties.negativeButtonText)
    val neutralButtonText = stringResource(dialogProperties.neutralButtonText)

    Dialog(properties = DialogProperties(
        dismissOnClickOutside = isCancelable
    ), onDismissRequest = {
        dismissTouchOutside()
    }) {

        NormalDialogComposable(
            showTitle = showTitle,
            title = title,
            showMessage = showMessage,
            message = message,
            dialogStyle = dialogStyle,
            dialogActionType = dialogActionType,
            positiveButtonText = positiveButtonText,
            negativeButtonText = negativeButtonText,
            neutralButtonText = neutralButtonText,
            buttonColor = dialogProperties.buttonColor,
            buttonTextColor = dialogProperties.buttonTextColor,
            fontFamily = fontFamily,
            lottieFile = R.raw.failed,
            positiveButtonClick = positiveButtonClick,
            negativeButtonClick = negativeButtonClick,
            neutralButtonClick = neutralButtonClick,
        )
    }

}

@Preview(group = "Preview")
@Composable
fun PreviewErrorFancyDialog() {
    ErrorFancyDialog(isCancelable = true, dismissTouchOutside = {

    })
}
