open class Van(regNo: String, model: String, year: Int, price: Double, private var height: Double, private var noOfSeats: Int)
    : Vehicle(regNo, model, year, price) {
    fun setHeight(height: Double) {
        this.height = height
    }

    fun setNoOfSeats(noOfSeats: Int) {
        this.noOfSeats = noOfSeats
    }

    fun getHeight(): Double = this.height

    fun getNoOfSeats(): Int = this.noOfSeats
}