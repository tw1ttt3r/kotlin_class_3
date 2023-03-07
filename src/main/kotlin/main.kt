import classes.Vehiculo
import classes.Color

fun main() {
    val miVehiculo = Vehiculo("Ford", "Focus", Color.BLUE)

    miVehiculo.placas="REM-4123"

    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07)
    println("El tanque tiene ${miVehiculo.gasolina}")

    val newVehiculo = Vehiculo("Mitsubishi", "Karr", "PFM-0002")


}