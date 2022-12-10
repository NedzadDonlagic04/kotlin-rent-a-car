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

    open fun getPricePerDay(): Double = this.price * 24

    fun getPricePerMonth(): Double = this.getPricePerDay() * 30

    companion object {
        fun getNewestVehicle(vararg vehicles: Vehicle): Vehicle? {
            if(vehicles.isEmpty()) return null

            var newest = vehicles[0]

            for(i in 1 until vehicles.size) {
                if(newest.getYear() < vehicles[i].getYear()) {
                    newest = vehicles[i]
                }
            }

            return newest
        }

        fun printAllVehiclesWithCargoSpaceGreaterThan(cargoSpace: Double, vararg vehicles: Vehicle) {
            val cars = vehicles.filterIsInstance<Car>()
            val cargoVans = vehicles.filterIsInstance<CargoVan>()

            println("Vehicles with cargo space greater than $cargoSpace litre:")

            cars.forEach {
                if (it.getCargoSpace() > cargoSpace) {
                    println("\t- ${it.getModel()}: ${it.getCargoSpace()}")
                }
            }

            cargoVans.forEach {
                if(it.getMaxLoad() > cargoSpace) {
                    println("\t- ${it.getModel()}: ${it.getMaxLoad()}")
                }
            }
        }
    }
}