open class Vehicle(private var regNo: String, private var model: String, private var year: Int, private var price: Double) {
    fun setRegNo(regNo: String) {
        this.regNo = regNo
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun setYear(year: Int) {
        this.year = year
    }

    fun setPrice(price: Double) {
        this.price = price
    }

    fun getRegNo(): String = this.regNo

    fun getModel(): String = this.model

    fun getYear(): Int = this.year

    fun getPrice(): Double = this.price

    override fun toString(): String = "Vehicle (regNo= ${this.regNo}, model= ${this.model}, year=${this.year}, price= ${this.price})"
}