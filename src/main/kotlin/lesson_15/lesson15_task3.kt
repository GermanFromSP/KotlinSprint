package lesson_15

fun main() {
    val user = User("Григорий", id = 1)
    val administrator = Administrator("Марк", id = 2)

    user.readForum()
    user.writeMessage()

    administrator.readForum()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser(user)
}

abstract class Users() {
    abstract val name: String
    abstract val id: Int

    abstract fun readForum()
    abstract fun writeMessage()
}

class User(
    override val name: String,
    override val id: Int,
) : Users() {
    override fun readForum() {
        println("$name прочитал форум")
    }

    override fun writeMessage() {
        println("$name написал сообщение")
    }
}

class Administrator(
    override val name: String,
    override val id: Int,
) : Users() {

    fun deleteUser(user: User) {
        println("$name удалил пользователя ${user.name}")
    }

    fun deleteMessage() {
        println("$name удалил сообщение")
    }

    override fun readForum() {
        println("$name прочитал форум")
    }

    override fun writeMessage() {
        println("$name написал сообщение")
    }
}