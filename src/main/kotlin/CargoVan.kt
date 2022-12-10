class CargoVan(regNo: String, model: String, year: Int, price: Double, height: Double, noOfSeats: Int, private var maxLoad: Double)
    : Van(regNo, model, year, price, height, noOfSeats){
    fun setMaxLoad(maxLoad: Double) {
        this.maxLoad = maxLoad
    }

    fun getMaxLoad(): Double = this.maxLoad

    override fun getPricePerDay(): Double = super.getPricePerDay() * 1.1
                                            // ^ 110% of the price per day
}