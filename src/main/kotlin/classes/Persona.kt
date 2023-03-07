package classes

enum class Sexo(val type: Char) {
    HOMBRE ('M'),
    MUJER ('F')
}

class Persona (val nombre: String, val apellidos: String, val sexo: Sexo, val altura: Float) {

    init {
        println(toString())
    }
    override fun toString() = """
        Hola Soy $nombre $apellidos
        soy $sexo y mido $altura metros 
    """
}