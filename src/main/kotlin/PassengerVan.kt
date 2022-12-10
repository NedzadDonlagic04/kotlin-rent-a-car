class PassengerVan(regNo: String, model: String, year: Int, price: Double, height: Double, noOfSeats: Int, private var noOfPassenger: Int)
    : Van(regNo, model, year, price, height, noOfSeats) {
    fun setNoOfPassenger(noOfPassenger: Int) {
        this.noOfPassenger = noOfPassenger
    }

    fun getNoOfPassenger(): Int = this.noOfPassenger

    override fun getPricePerDay(): Double = super.getPricePerDay() * 0.8
                                            // ^ 80% of the price per day
}