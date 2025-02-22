import org.example.designPattern.builder.ComputerBuilder

// Função principal
fun main() {
    // Criação de um novo objeto Computer usando o padrão Builder
    val computer = ComputerBuilder()
        .cpu("Intel i9") // Definição do CPU
        .ram("32GB") // Definição da RAM
        .storage("1TB SSD") // Definição do armazenamento
        .gpu("Nvidia RTX 3090") // Definição da GPU
        .os("Windows 11") // Definição do sistema operacional
        .motherboard("Asus ROG Strix Z590-E") // Definição da placa-mãe
        .build() // Construção do objeto Computer

    // Impressão do objeto Computer
    println(computer)
}