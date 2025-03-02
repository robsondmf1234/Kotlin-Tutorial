package org.example.designPattern.criacional.extra.prototype

// Interface Cloneable define o contrato para clonagem
interface Prototype<T> {
    fun clone(): T
}
