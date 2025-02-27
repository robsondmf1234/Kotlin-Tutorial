package designPattern.criacional.builder

// Definição da classe ComputerBuilder que será usada para construir um objeto Computer
class ComputerBuilder {
    // Inicialização das propriedades com valores padrão
    private var cpu: String = ""
    private var ram: String = ""
    private var storage: String = ""
    private var gpu: String = ""
    private var os: String = ""
    private var motherboard: String? = null

    // Métodos para definir as propriedades do objeto Computer
    fun cpu(cpu: String) = apply { this.cpu = cpu }
    fun ram(ram: String) = apply { this.ram = ram }
    fun storage(storage: String) = apply { this.storage = storage }
    fun gpu(gpu: String) = apply { this.gpu = gpu }
    fun os(os: String) = apply { this.os = os }
    fun motherboard(motherboard: String) = apply { this.motherboard = motherboard }

    // Método para construir o objeto Computer
    fun build(): Computer {
        // Verifica se a placa-mãe foi definida, pois é obrigatória
        require(motherboard != null) { "Motherboard is required" }
        // Retorna um novo objeto Computer com as propriedades definidas
        return Computer(cpu, ram, storage, gpu, os, motherboard)
    }
}