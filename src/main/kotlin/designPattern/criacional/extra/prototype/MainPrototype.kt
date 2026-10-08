package designPattern.criacional.extra.prototype

// Executa o exemplo de Prototype clonando documentos.

import org.example.designPattern.criacional.extra.prototype.Document

// Testando o Prototype
fun main() {
    val originalDoc = Document("Relatório Anual", "Conteúdo do relatório...", "João Silva")

    // Criamos uma cópia do documento original
    val clonedDoc = originalDoc.clone().copy(title = "Relatório Anual (Revisado)")

    println("Original: ${originalDoc.title} - ${originalDoc.author}")
    println("Clone: ${clonedDoc.title} - ${clonedDoc.author}")
}
