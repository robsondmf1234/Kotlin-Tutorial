package org.example.designPattern.criacional.extra.prototype

// Classe Document que implementa Prototype
data class Document(val title: String, val content: String, val author: String) : Prototype<Document> {
    override fun clone(): Document {
        return copy()  // Utilizamos a função copy() do data class para criar um clone
    }
}