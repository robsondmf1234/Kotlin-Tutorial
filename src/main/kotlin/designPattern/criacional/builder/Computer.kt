package designPattern.criacional.builder

// Representa o objeto final montado pelo builder com suas configuracoes de hardware.

// Definição da classe Computer com propriedades privadas
data class Computer(
    private val cpu: String,
    private val ram: String,
    private val storage: String,
    private val gpu: String,
    private val os: String,
    private val motherboard: String?
)
