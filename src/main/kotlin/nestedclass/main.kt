package nestedclass

//Demonstração de classe aninhada
fun main() {

    val airport = Airport(code = "ENG")
    val plane = Airport.Plane()
    plane.contact(airport)

    val myTicket = Ticket(name = "Rob", seat = Ticket.Seat.Bussines)
    myTicket.printSeat()//Bussiness
    myTicket.upgrade()//Bussiness >>First
    myTicket.printSeat()//First
    myTicket.upgrade()//First>>Eco
    myTicket.printSeat()//Eco
}

class Airport(private val code: String) {
    //Classe Plane é uma nested class ou classe aninhada, esta classe só será visivel dentro da classe
    //Airport
    class Plane {
        fun contact(airport: Airport) {
            println(airport.code)
        }
    }
}

//Demonstração do incremento de enum class
class Ticket(
    private val name: String,
    private var seat: Seat
) {
    enum class Seat {
        Eco,
        Premium,
        Bussines,
        First
    }

    fun upgrade() {
        //Caso o assento sejá First retornará a categoria Eco
        seat = if (seat.name == "First") {
            Seat.values()[seat.ordinal - 3]
        } else {
            //o assento sofrerá um upgrade solicitado pelo cliente
            Seat.values()[seat.ordinal + 1]
        }
    }

    //Impressão do nome e a categoria do assento.
    fun printSeat() {
        println("Hello $name, your seat is: $seat")
    }

}

interface Person {
    val height: Height

    data class Height(val cm: Int)
}

class John(height: Int) : Person {
    override val height = Person.Height(cm = height)
}