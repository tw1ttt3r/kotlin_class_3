package mario

enum class Status(status: String) {
    SUPER_MUSHROOM("sm"),
    FIRE_FLOWER ("fl"),
    GOOMBA ("g")
}

class Mario {
    private var lives = 3
        // Los get y set implícitos deben estar debajo del atributo
        set(value) {
            // field corresponde al atributo superior, en este ejemplo field corresponde a lives
            if (field == 1) {
                field = 0
                gameOver()
                return
            }

            if (field == 0) {
                println("Error: Reinicia el juego")
                return
            }

            field = value
            println("Vidas restantes: $field")
        }
        get() = field
    var state = "small"


    private fun gameOver() {
        println("GAME OVER")
    }

    private fun die() {
        lives --
        println("Haz perdido una vida")
    }

    public fun collision(collisionObj: String) {
        when(collisionObj) {
            "Goomba" -> lives --
            "Super Mushroom" -> state = "Super Mario"
            "Fire Flower" -> state = "Fire Mario"
        }
    }
}