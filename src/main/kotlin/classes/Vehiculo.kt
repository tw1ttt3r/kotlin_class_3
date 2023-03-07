package classes

enum class Color(val colorCode: Int){
    RED(0xFF0000),
    BLACK(0x000000),
    BLUE(0x0000FF),
    WHITE(0xFFFFFF),
}

class Vehiculo (val marca: String, val modelo: String, var color: Color, var gasolina: Double = 0.0) {
    var placas = ""
    var encendido = false

    init {
        println(toString())
    }

    // Constructor secundario
    constructor(marca: String, modelo: String, placas: String): this(marca, modelo, Color.BLACK) {
        this.placas = placas
        println("placas: $placas")
    }

    override fun toString() = """
        Los datos del vehiculo son:
            marca: $marca,
            modelo: $modelo,
            color: $color,
            con placas: $placas
    """.trimIndent()


    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros: Double){
        gasolina+=litros
    }
}
