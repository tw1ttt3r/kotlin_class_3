import classes.Vehiculo
import classes.Color
import classes.Persona
import classes.Sexo
import mario.Mario

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

    val pedro = Persona("Pedro", "Fragoso", Sexo.HOMBRE, 1.72f)

    val mario = Mario()
    mario.collision("Goomba")
    mario.collision("Goomba")
    mario.collision("Goomba")
    mario.collision("Goomba")


}