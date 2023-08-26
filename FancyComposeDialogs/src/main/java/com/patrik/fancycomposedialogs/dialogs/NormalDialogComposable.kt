package com.patrik.fancycomposedialogs.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.patrik.fancycomposedialogs.R
import com.patrik.fancycomposedialogs.enums.DialogActionType
import com.patrik.fancycomposedialogs.enums.DialogStyle
import com.patrik.fancycomposedialogs.ui.DarkBlackText
import com.patrik.fancycomposedialogs.ui.DarkLightBlackText

@Composable
fun NormalDialogComposable(
    showTitle: Boolean,
    title: String = "",
    showMessage: Boolean,
    message: String = "",
    dialogStyle: DialogStyle,
    dialogActionType: DialogActionType,
    positiveButtonText: String,
    negativeButtonText: String,
    neutralButtonText: String,
    buttonColor: Color = Color.LightGray.copy(alpha = 0.5F),
    buttonTextColor: Color = DarkBlackText,
    fontFamily: FontFamily = FontFamily.Default,
    lottieFile: Int?,
    positiveButtonClick: () -> Unit = {},
    negativeButtonClick: () -> Unit = {},
    neutralButtonClick: () -> Unit = {}
) {

    Box(
        modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 0.dp),
        contentAlignment = Alignment.TopCenter
    ) {

        Column(
            modifier = Modifier
                .padding(top = if (dialogStyle == DialogStyle.NORMAL) 0.dp else 26.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 5.dp)
                    .padding(top = if (dialogStyle == DialogStyle.NORMAL) 50.dp else if (lottieFile == null) 2.dp else 20.dp)
            ) {

                if (showTitle) {
                    Text(
                        text = title,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        fontFamily = fontFamily,
                        color = DarkBlackText,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                }

                if (showMessage) {
                    Text(
                        text = message,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(
                                top = 10.dp, start = 25.dp, end = 25.dp, bottom = 15.dp
                            )
                            .fillMaxWidth(),
                        fontFamily = fontFamily,
                        color = DarkLightBlackText,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.sp
                    )
                }

            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .background(
                        color = buttonColor,
                        shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
                    )
            ) {

                if (dialogActionType == DialogActionType.ACTIONABLE) {

                    Text(
                        text = negativeButtonText,
                        fontWeight = FontWeight.SemiBold,
                        color = buttonTextColor,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth(0.5F)
                            .background(
                                buttonColor,
                                shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
                            )
                            .clickable {
                                negativeButtonClick()
                            }
                            .padding(vertical = 8.dp),
                        fontFamily = fontFamily,
                        fontSize = 12.sp,
                    )

                    Text(textAlign = TextAlign.Center,
                        text = positiveButtonText,
                        fontWeight = FontWeight.SemiBold,
                        color = buttonTextColor,
                        modifier = Modifier
                            .fillMaxWidth(1F)
                            .background(
                                buttonColor,
                                shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
                            )
                            .clickable {
                                positiveButtonClick()
                            }
                            .padding(vertical = 8.dp),
                        fontFamily = fontFamily,
                        fontSize = 12.sp)
                }

                if (dialogActionType == DialogActionType.INFORMATIVE) {
                    Text(textAlign = TextAlign.Center,
                        text = neutralButtonText,
                        fontWeight = FontWeight.SemiBold,
                        color = buttonTextColor,
                        modifier = Modifier
                            .fillMaxWidth(1F)
                            .background(
                                buttonColor,
                                shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
                            )
                            .clickable {
                                neutralButtonClick()
                            }
                            .padding(vertical = 8.dp),
                        fontFamily = fontFamily,
                        fontSize = 12.sp

                    )

                }
            }
        }

        if (lottieFile != null) {
            val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(lottieFile))

            Box(
                modifier = Modifier.background(Color.White, shape = CircleShape)
            ) {
                LottieAnimation(
                    isPlaying = true,
                    modifier = Modifier
                        .size(62.dp)
                        .padding(6.dp),
                    composition = composition,
                    alignment = Alignment.Center
                )
            }
        }


    }

}

@Preview(group = "Preview")
@Composable
fun PreviewNormalDialogComposable() {

    NormalDialogComposable(showTitle = true,
        title = "Here Is Title",
        showMessage = true,
        message = "Here Is Dialog Message This Goes To This Section",
        dialogStyle = DialogStyle.NORMAL,
        dialogActionType = DialogActionType.ACTIONABLE,
        positiveButtonText = "Yes",
        negativeButtonText = "No",
        neutralButtonText = "Okay",
        buttonColor = Color.LightGray.copy(alpha = 0.5F),
        buttonTextColor = DarkBlackText,
        lottieFile = R.raw.success,
        positiveButtonClick = {

        },
        negativeButtonClick = {

        }) {

    }

}