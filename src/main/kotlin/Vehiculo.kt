class Vehiculo {
    lateinit var color: String
    lateinit var marca: String
    lateinit var placas: String
    lateinit var modelo: String
    var encendido: Boolean = false
    var gasolina: Double = 0.0

    companion object {
        @JvmStatic fun main(vararg args: String) {
            val myVehiculo = Vehiculo()
            myVehiculo.color = "green"
            myVehiculo.marca = "Ford"
            myVehiculo.modelo = "2023"
            myVehiculo.placas = "PFM0001"

            myVehiculo.recargarCombustible(40.0)
            println(myVehiculo.statusNivelGasolina())
            myVehiculo.encenderVehiculo()
            println(myVehiculo.statusEncendido())
            myVehiculo.apagarVehiculo()
            println(myVehiculo.statusEncendido())
        }
    }

    fun encenderVehiculo() {
        encendido = true
    }

    fun apagarVehiculo() {
        encendido = false
    }

    fun statusEncendido(): Boolean {
        return encendido
    }

    fun recargarCombustible(cantidad: Double) {
        gasolina += cantidad
    }

    fun statusNivelGasolina(): Double {
        return gasolina
    }
}
