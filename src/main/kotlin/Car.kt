class Car(regNo: String, model: String, year: Int, price: Double, private var carType: String): Vehicle(regNo, model, year, price) {
    fun setCarType(carType: String) {
        this.carType = carType
    }

    fun getCarType(): String = this.carType
}