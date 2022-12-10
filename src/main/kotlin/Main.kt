fun main(args: Array<String>) {
    val v: Vehicle = Car("DA1234AA", "Renault Clio", 2001, 20.0, "coupe", 200.0)
    val car = Car("DA8818BB", "Renault Megane Grandtour", 2007, 25.0, "caravan", 800.0)
    val van1: Van = CargoVan("DA0009PO", "Volkswagen Transporter", 2018, 28.0, 2.0, 3, 4500.0)
    val van2 = PassengerVan("DA6282EA", "IMV 1600", 1978, 35.0, 2.0, 3, 0)
    val limo: Vehicle = Limo("DA2238AB", "Zastava 750 LE", 1983, 220.0, 3.2, miniBar = false, sunRoof = false)

    println(v.getModel() + " price per day: " + v.getPricePerDay())
    println(van1.getModel() + " price per day: " + van1.getPricePerDay())
    println(van2.getModel() + " price per month: " + van2.getPricePerMonth())

    val newest: Vehicle? = Vehicle.getNewestVehicle(v, car, van1, van2, limo)
    println("Newest: " + newest?.getModel() + ", " + newest?.getYear())

    Vehicle.printAllVehiclesWithCargoSpaceGreaterThan(500.0, v, car, van1, van2, limo)
}