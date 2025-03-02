package designPattern.criacional.factory.example1

fun main() {
    // Cria uma lista mutável para armazenar os diálogos criados pela fábrica
    val listFactory = mutableListOf<Dialog>()

    // Adiciona diferentes tipos de diálogos à lista usando a fábrica de diálogos
    listFactory.add(DialogFactory.createDialog(DialogType.DIALOG_DELETE_MESSAGE))
    listFactory.add(DialogFactory.createDialog(DialogType.DIALOG_EDIT_MESSAGE))
    listFactory.add(DialogFactory.createDialog(DialogType.DIALOG_CREATE_CHAT))

    // Itera sobre a lista de diálogos e verifica o tipo de cada diálogo
    listFactory.forEach { verifyDialog(it) }
}

fun verifyDialog(factory: Dialog) {
    // Verifica o tipo do diálogo e imprime uma mensagem correspondente
    when (factory) {
        is Dialog.CreateChatDialog -> println("Create Chat Dialog")
        is Dialog.EditMessageDialog -> println("Edit Message Dialog")
        is Dialog.DeleteMessageDialog -> println("Delete Message Dialog")
    }
}