package lesson_11

fun main() {
    val forum = Forum()
    val firstUser = forum.createNewUser("Карл")
    val secondUser = forum.createNewUser("Борис")

    forum.createNewMessage(firstUser.userId)
    forum.createNewMessage(secondUser.userId)
    forum.createNewMessage(firstUser.userId)
    forum.createNewMessage(secondUser.userId)

    forum.printThread()
}

class Forum() {

    private val userList = mutableListOf<ForumUser>()
    private val messageList = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumUser {
        userList.add(ForumUser.newUser(userList.size, userName))
        return userList.last()
    }

    fun createNewMessage(userId: Int) {

        if (userList.any { it.userId == userId }) {

            val userName = userList[userId].userName
            println("$userName печатает...")
            val userMessage = readln()

            if (userMessage.isNotEmpty()) {
                messageList.add(ForumMessage.newMessage(userId, userMessage))
            }

        } else {
            println("Оставлять сообщения могут только зарегестрированные пользователи!")
        }
    }

    fun printThread() {
        messageList.forEach {
            val userName = userList[it.authorId].userName
            val text = it.message
            println("${userName}: $text")
        }
    }
}

class ForumUser(val userId: Int, val userName: String) {

    companion object {
        fun newUser(id: Int, name: String) = ForumUser(id, name)
    }
}

class ForumMessage(val authorId: Int, val message: String) {

    companion object {
        fun newMessage(id: Int, newMessage: String) = ForumMessage(id, newMessage)
    }
}