package com.patrik.fancyJetpackcomposedialog

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.patrik.fancyJetpackcomposedialog.ui.theme.FancyJetpackComposeDialogTheme
import com.patrik.fancyJetpackcomposedialog.ui.theme.Poppins
import com.patrik.fancycomposedialogs.dialogs.ErrorFancyDialog
import com.patrik.fancycomposedialogs.dialogs.InformativeFancyDialog
import com.patrik.fancycomposedialogs.dialogs.SuccessFancyDialog
import com.patrik.fancycomposedialogs.dialogs.WarningFancyDialog
import com.patrik.fancycomposedialogs.enums.DialogActionType
import com.patrik.fancycomposedialogs.enums.DialogStyle
import com.patrik.fancycomposedialogs.properties.DialogButtonProperties
import com.patrik.fancycomposedialogs.ui.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FancyJetpackComposeDialogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true, showBackground = true, group = "Main Group"
)
@Composable
fun MainScreen() {

    val context = LocalContext.current

    // region Success Dialog

    var showNormalSuccessDialog by remember { mutableStateOf(false) }

    if (showNormalSuccessDialog) {
        SuccessFancyDialog(title = "Normal Success Dialog",
            message = "Normal dialog with 2 button and with custom font",
            dialogProperties = DialogButtonProperties(
                positiveButtonText = R.string.yes
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showNormalSuccessDialog = false
            },
            positiveButtonClick = {
                showNormalSuccessDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showNormalSuccessDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })
    }

    var showFancySuccessDialog by remember { mutableStateOf(false) }

    if (showFancySuccessDialog) {
        SuccessFancyDialog(title = "Fancy Success Dialog",
            message = "fancy upper cut design dialog with 2 button and with custom font",
            dialogStyle = DialogStyle.UPPER_CUTTING,
            dialogProperties = DialogButtonProperties(
                positiveButtonText = R.string.yes
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showFancySuccessDialog = false
            },
            positiveButtonClick = {
                showFancySuccessDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showFancySuccessDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })

    }

    // endregion

    // region Error Dialog

    var showNormalErrorDialog by remember { mutableStateOf(false) }

    if (showNormalErrorDialog) {
        ErrorFancyDialog(title = "Normal Error Dialog",
            message = "Normal dialog with 2 button and with custom font",
            dialogProperties = DialogButtonProperties(
                positiveButtonText = R.string.yes
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showNormalErrorDialog = false
            },
            positiveButtonClick = {
                showNormalErrorDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showNormalErrorDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })

    }

    var showFancyErrorDialog by remember { mutableStateOf(false) }

    if (showFancyErrorDialog) {
        ErrorFancyDialog(title = "Fancy Error Dialog",
            message = "fancy upper cut design dialog with 2 button and with custom font",
            dialogStyle = DialogStyle.UPPER_CUTTING,
            dialogProperties = DialogButtonProperties(
                positiveButtonText = R.string.yes
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showFancyErrorDialog = false
            },
            positiveButtonClick = {
                showFancyErrorDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showFancyErrorDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })

    }

    // endregion

    // region Warning Dialog

    var showNormalWarningDialog by remember { mutableStateOf(false) }

    if (showNormalWarningDialog) {
        WarningFancyDialog(title = "Normal Warning Dialog",
            message = "Normal dialog with 2 button and with custom font",
            dialogStyle = DialogStyle.NORMAL,
            dialogProperties = DialogButtonProperties(
                positiveButtonText = R.string.yes
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showNormalWarningDialog = false
            },
            positiveButtonClick = {
                showNormalWarningDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showNormalWarningDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })

    }

    var showFancyWarningDialog by remember { mutableStateOf(false) }

    if (showFancyWarningDialog) {
        WarningFancyDialog(title = "Fancy Warning Dialog",
            message = "fancy upper cut design dialog with single button and with custom font",
            dialogStyle = DialogStyle.UPPER_CUTTING,
            dialogActionType = DialogActionType.INFORMATIVE,
            dialogProperties = DialogButtonProperties(
                neutralButtonText = R.string.ok
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showFancyWarningDialog = false
            },
            neutralButtonClick = {
                showFancyWarningDialog = false
                Toast.makeText(
                    context, context.getString(R.string.neutral_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })
    }

    // endregion

    // region Show Info Dialog

    var showInfoDialog by remember { mutableStateOf(false) }

    if (showInfoDialog) {
        InformativeFancyDialog(title = "Informative Dialog",
            message = "Normal dialog with single button and with custom font",
            dialogActionType = DialogActionType.INFORMATIVE,
            dialogProperties = DialogButtonProperties(
                neutralButtonText = R.string.ok
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showInfoDialog = false
            },
            neutralButtonClick = {
                showInfoDialog = false
                Toast.makeText(
                    context, context.getString(R.string.neutral_button_clicked), Toast.LENGTH_SHORT
                ).show()
            })
    }

    var showInfoConfirmationDialog by remember { mutableStateOf(false) }

    if (showInfoConfirmationDialog) {
        InformativeFancyDialog(title = "Informative Dialog",
            message = "fancy upper cut design dialog with 2 button and with custom font and custom button color",
            dialogActionType = DialogActionType.ACTIONABLE,
            dialogProperties = DialogButtonProperties(
                neutralButtonText = R.string.ok, buttonColor = Pink80, buttonTextColor = Color.Black
            ),
            fontFamily = Poppins,
            dismissTouchOutside = {
                showInfoConfirmationDialog = false
            },
            positiveButtonClick = {
                showInfoConfirmationDialog = false
                Toast.makeText(
                    context, context.getString(R.string.positive_button_clicked), Toast.LENGTH_SHORT
                ).show()
            },
            negativeButtonClick = {
                showInfoConfirmationDialog = false
                Toast.makeText(
                    context, context.getString(R.string.negative_button_clicked), Toast.LENGTH_SHORT
                ).show()

            })
    }

    // endregion

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 30.dp, vertical = 30.dp)
            .verticalScroll(rememberScrollState())

    ) {

        // region Success Dialog Button

        Text(
            text = "Success Dialog", fontFamily = Poppins
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showNormalSuccessDialog = true
            },
        ) {
            Text(
                text = "Normal Success Dialog"
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showFancySuccessDialog = true
            },
        ) {
            Text(text = "Fancy Success Dialog")
        }

        Spacer(modifier = Modifier.height(25.dp))

        // endregion

        // region Error Dialog Button

        Text(
            text = "Error Dialog", fontFamily = Poppins
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showNormalErrorDialog = true
            },
        ) {
            Text(text = "Normal Error Dialog")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showFancyErrorDialog = true
            },
        ) {
            Text(text = "Fancy Error Dialog")
        }

        Spacer(modifier = Modifier.height(25.dp))

        // endregion

        // region Warning Dialog Button

        Text(
            text = "Warning Dialog", fontFamily = Poppins
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showNormalWarningDialog = true
            },
        ) {
            Text(text = "Normal Warning Dialog")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showFancyWarningDialog = true
            },
        ) {
            Text(text = "Fancy Warning Dialog")
        }

        Spacer(modifier = Modifier.height(25.dp))

        // endregion

        // region Information Dialog Button

        Text(
            text = "Information Dialog", fontFamily = Poppins
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showInfoDialog = true
            },
        ) {
            Text(text = "Informative Dialog")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                showInfoConfirmationDialog = true
            },
        ) {
            Text(text = "Confirmation Informative Dialog")
        }

        // endregion

    }



}