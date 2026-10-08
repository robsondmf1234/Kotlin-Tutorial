package org.example.designPattern.criacional.extra.prototype

// Define o contrato de clonagem reutilizado pelo exemplo de Prototype.

// Interface Cloneable define o contrato para clonagem
interface Prototype<T> {
    fun clone(): T
}
