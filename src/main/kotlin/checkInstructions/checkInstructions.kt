package checkInstructions

import java.io.File

//Demonstração no uso de check functions em Kotlin
//Para validação de instruções
fun main() {
    val person = Person(name = "Robson", age = 35)
    multiplyWithTen(number = 1)
    writeToFile()
}

fun multiplyWithTen(number: Int?): Int {
    //Require not null , faz a validação de um valor por nulo, caso a condição seja true , será lançado um IllegalException
    requireNotNull(value = number) {
        "We need a non-null- number."
    }
    return number * 10
}

fun writeToFile() {
    val myFile = File("MyFile.txt")
    //Check instruction vai validar se a condição é true/false, caso seja false ,será lançado um IllegalException
    //caso seja true ,será executado o bloco de código abaixo
    check(value = myFile.exists()) {
        "${myFile.name} does not exist."
    }
    myFile.writeText("Everything is okay.")
}

data class Person(
    val name: String,
    val age: Int
) {
    init {
        //Require vai ser chamado assim que a classe for iniciada,
        // e caso a condição seja true, será lançado um IllegalArgumentException ou podemos dar um throw e lançar
        //uma custom exception por exemplo
        require(value = name.length < 20) {
            "Name is too long."
        }
        //Exemplo2:
        //   require(value = name.length < 20) {
        //     throw NumberFormatException("Name is too long.")
        //   }
    }
}