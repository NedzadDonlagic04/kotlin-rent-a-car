class Car(regNo: String, model: String, year: Int, price: Double, private var carType: String, private var cargoSpace: Double): Vehicle(regNo, model, year, price) {
    fun setCarType(carType: String) {
        this.carType = carType
    }

    fun setCargoSpace(cargoSpace: Double) {
        this.cargoSpace = cargoSpace
    }

    fun getCarType(): String = this.carType

    fun getCargoSpace(): Double = this.cargoSpace
}