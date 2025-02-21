package designPattern.criacional.factory.example1

// Define uma enumeração DialogType para representar diferentes tipos de diálogos
enum class DialogType {
    // Constante de enumeração para criar um diálogo de chat
    DIALOG_CREATE_CHAT,
    // Constante de enumeração para editar um diálogo de mensagem
    DIALOG_EDIT_MESSAGE,
    // Constante de enumeração para deletar um diálogo de mensagem
    DIALOG_DELETE_MESSAGE
}