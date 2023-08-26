
# Fancy Compose Dialogs

"Elevate your app's dialogs with '**FancyComposeDialogs**' using Jetpack Compose magic! ✨📲"

## Introduction

Introducing "**FancyComposeDialogs**"! 🚀 Elevate your app with captivating dialogs using Jetpack   Compose. With ComposeDialogs, displaying dialogs in your app becomes a breeze. whether it's success  messages, errors, information, or warnings, this library offers a range of dialog types with unique  designs. 🎉

✨. Experience both the classic dialog style and an innovative upper-cut design, all while  enjoying the simplicity and elegance of Jetpack Compose. Try it now to enhance your user experience!  💬📲 **#FancyComposeDialogs**

_Made with love  ❤️ by  [Pratik Fagadiya](https://github.com/pratikfagadiya)_

## Types Of Dialog

<table style="width:100%">  
  <tr>  
    <th>1. Success Dialog</th>  
    <th>2. Fancy Success Dialog</th>  
    <th>3. Error Dialog</th>  
  </tr>  
  <tr>  
    <td><img src="https://github.com/PratikFagadiya/FancyComposeDialog/raw/master/art/normalsuccess_dialog.gif"/></td>  
    <td><img src="https://github.com/PratikFagadiya/FancyComposeDialog/raw/master/art/fancysucess_dialog.gif"/></td>  
    <td><img src="https://github.com/PratikFagadiya/FancyComposeDialog/raw/master/art/normalerror_dialog.gif"/></td>  
  </tr>  
  <tr>  
    <th>7. Information Dialog</th>  
    <th>8. Information Action Dialog</th>  
    <th></th>  
  </tr>  
  <tr>  
  <td><img src="https://github.com/PratikFagadiya/FancyComposeDialog/raw/master/art/info_dialog.gif"/></td>  
    <td><img src="https://github.com/PratikFagadiya/FancyComposeDialog/raw/master/art/info_confirmation_dialog.gif"/></td>  
    <td></td>  
  </tr>  


</table>  

## Implementation
Implementation of FancyComposeDialog library is so easy. You can check [/app](https://github.com/PratikFagadiya/FancyComposeDialog/blob/master/app) directory for demo. Let's have look on basic steps of implementation.

### Prerequisite

Add JitPack repository to your project's `settings.gradle` file.
```groovy  
dependencyResolutionManagement {  
 // ...  
 repositories {
    // ...
    maven { url "https://www.jitpack.io" }
 }}  
```  
Declare the dependencies in the module-level `build.gradle` file 🍀 [![](https://jitpack.io/v/PratikFagadiya/FancyComposeDialog.svg)](https://jitpack.io/#PratikFagadiya/FancyComposeDialog)
```gradle  
 dependencies { implementation 'com.github.PratikFagadiya:FancyComposeDialog:<LATEST_VERSION>' }
```  
# How to use it ?
Fancy dialogs come in four types: `Success`, `Error`, `Warning`, and `Informative`. Each type is designed to communicate a specific message to the user in a visually appealing way.

Fancy dialogs provide an easy and customizable way to show different types of messages to users in a visually appealing manner. Let's have a look in `SuccessFancyDialog`.

## SuccessFancyDialog

`SuccessFancyDialog` displays a success message with customizable options.

### Usage Example

```kotlin
@Composable
fun showSuccessDialog() {
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
}
```

### Parameters

- `showTitle`: Boolean (default: true)
- `title`: String (default: "")
- `showMessage`: Boolean (default: true)
- `message`: String (default: "")
- `dialogStyle`: DialogStyle (default: DialogStyle.NORMAL)
- `dialogActionType`: DialogActionType (default: DialogActionType.ACTIONABLE)
- `dialogProperties`: DialogButtonProperties (default: DialogButtonProperties())
- `fontFamily`: FontFamily (default: FontFamily.Default)
- `isCancelable`: Boolean (default: true)
- `dismissTouchOutside`: () -> Unit
- `positiveButtonClick`: () -> Unit (default: {})
- `negativeButtonClick`: () -> Unit (default: {})
- `neutralButtonClick`: () -> Unit (default: {})

The same parameters will work on any types of dialogs

You can check [MainActivity](https://github.com/PratikFagadiya/FancyComposeDialog/blob/e8149c50e6bafd42c5afd6f133437598ca943efb/app/src/main/java/com/patrik/fancycomposedialog/MainActivity.kt#L61) file for multiple types of dialog implementation.

## Donate

If you found this library helpful or you learned something from the source code and want to thank  
me, consider buying me a cup of :coffee:

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png)](https://www.buymeacoffee.com/pratikf)  
<br />

## Find this library useful ? ❤️

- Support it by clicking the ⭐️ button on the upper right of this page and share with others. ✌️

  Also, follow me on __[github](https://github.com/PratikFagadiya)__ and _
  _[twitter](https://twitter.com/PFagadiya)__ to stay updated with my creations! 🤩    
  <br />

## Contribution 🤝

- If you would like to contribute you're most welcome! 💛    
  See [Contributing Guidelines](https://github.com/PratikFagadiya/FancyComposeDialog/blob/master/CONTRIBUTING.md).    
  <br />

## Connect with me

<div align="left">  
<a href="https://twitter.com/PFagadiy" target="https://twitter.com/PFagadiya">  
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 5px;" />  
</a>  
<a href="https://www.linkedin.com/in/pratik-fagadiya-79b8081b0/" target="https://www.linkedin.com/in/pratik-fagadiya-79b8081b0/">  
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />  
</a>  
<a href="https://www.instagram.com/patrik.codes/?next=%2Fpatcoder%2F&hl=en" target="https://www.instagram.com/patrik.codes/?next=%2Fpatcoder%2F&hl=en">  
<img src=https://img.shields.io/badge/instagram-%23000000.svg?&style=for-the-badge&logo=instagram&logoColor=white alt=instagram style="margin-bottom: 5px;" />  
</a>  
</div>  
<br />  

## License 🔖

```  
Apache 2.0 License  
  
Copyright 2023 Pratik Fagadiya  
  
Licensed under the Apache License, Version 2.0 (the "License");  
you may not use this file except in compliance with the License.  
You may obtain a copy of the License at  
  
 http://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, software  
distributed under the License is distributed on an "AS IS" BASIS,  
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
See the License for the specific language governing permissions and  
limitations under the License.  
```
