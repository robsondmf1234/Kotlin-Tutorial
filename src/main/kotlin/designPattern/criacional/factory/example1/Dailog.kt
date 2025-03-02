package designPattern.criacional.factory.example1

// Define a sealed class Dialog, which means all subclasses must be defined within this file
sealed class Dialog {
    // Define an object CreateChatDialog that extends Dialog
    object CreateChatDialog : Dialog()
    // Define an object EditMessageDialog that extends Dialog
    object EditMessageDialog : Dialog()
    // Define an object DeleteMessageDialog that extends Dialog
    object DeleteMessageDialog : Dialog()
}