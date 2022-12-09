class Limo(regNo: String, model: String, year: Int, price: Double, private var length: Double, private var miniBar: Boolean, private var sunRoof: Boolean)
    : Vehicle(regNo, model, year, price) {
    fun setLength(length: Double) {
        this.length = length
    }

    fun setMiniBar(miniBar: Boolean) {
        this.miniBar = miniBar
    }

    fun setSunRoof(sunRoof: Boolean) {
        this.sunRoof = sunRoof
    }

    fun getLength(): Double = this.length

    fun getMiniBar(): Boolean = this.miniBar

    fun getSunRoof(): Boolean = this.sunRoof
}