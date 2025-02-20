package org.example.designPattern.factory.example1

import designPattern.factory.example1.DialogType

// Define um objeto DialogFactory, que é um singleton
object DialogFactory {
    // Função para criar um diálogo com base no tipo de diálogo fornecido
    fun createDialog(dialogType: DialogType): Dialog {
        // Retorna o objeto de diálogo apropriado com base no tipo de diálogo
        return when (dialogType) {
            DialogType.DIALOG_CREATE_CHAT -> Dialog.CreateChatDialog
            DialogType.DIALOG_EDIT_MESSAGE -> Dialog.EditMessageDialog
            DialogType.DIALOG_DELETE_MESSAGE -> Dialog.DeleteMessageDialog
        }
    }
}