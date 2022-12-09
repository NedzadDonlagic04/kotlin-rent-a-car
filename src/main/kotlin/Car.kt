/*
Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
   carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
   length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
   koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
   tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.
 */
class Car(regNo: String, model: String, year: Int, price: Double, private var carType: String): Vehicle(regNo, model, year, price) {
    fun setCarType(carType: String) {
        this.carType = carType
    }

    fun getCarType(): String = this.carType
}