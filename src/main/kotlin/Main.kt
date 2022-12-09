fun main(args: Array<String>) {
    val v = Car("DA1234AA", "Renault Clio", 2001, 20.0, "coupe")
    val car = Car("DA8818BB", "Renault Megane Grandtour", 2007, 25.0, "caravan")
    val van1 = CargoVan("DA0009PO", "Volkswagen Transporter", 2018, 28.0, 2.0, 3, 4500.0)
    val van2 = PassengerVan("DA6282EA", "IMV 1600", 1978, 35.0, 2.0,3, 0)
    val limo = Limo("DA2238AB", "Zastava 750 LE", 1983, 220.0, 3.2, miniBar = false, sunRoof = false)

    println(v)
    println(car)
    println(van1)
    println(van2)
    println(limo)
}