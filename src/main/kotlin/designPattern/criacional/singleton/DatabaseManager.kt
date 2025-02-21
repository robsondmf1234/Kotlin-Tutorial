package org.example.designPattern.criacional.singleton

// Define an object DatabaseManager, which is a singleton
object DatabaseManager {
    // Initialization block that runs when the object is first accessed
    init {
        println("Inicializando o DatabaseManager...")
    }

    // Function to simulate a database connection
    fun conectar(): String {
        return "Conectado ao banco de dados"
    }
}