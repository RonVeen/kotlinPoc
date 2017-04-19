data class Person(var name: String, val surname: String, val city: String?);

fun main(arg: Array<Any>) {
    val p1 = Person("Ron", "Veen", "Enschede")
    val p2 = Person(name="Ron", surname="Veen", city = "Enschede")

    val fullname = p1.name + " " + p1.surname
    p1.name = "Ronny"

    p1.toString()
    p1.hashCode()

    p1.copy(city = "Amersfoort")


}

