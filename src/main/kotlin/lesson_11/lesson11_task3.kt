package lesson_11

fun main() {
    val chatRoom = ChatRoom("1234.img", "Slipknot followers")
    val user = ChatUser("44.img", "Джон")

    chatRoom.addChatUser(user)
    chatRoom.updateUserStatus(user.name, "Разговаривает")
    chatRoom.printInfo(user.avatar)
}

class ChatRoom(
    val poster: String,
    val title: String,
) {

    private val chatUsers = mutableListOf<ChatUser>()

    fun addChatUser(chatUser: ChatUser) {
        chatUsers.add(chatUser)
    }

    fun updateUserStatus(chatMemberName: String, newStatus: String) {
        chatUsers.filter { it.name == chatMemberName }.map { it.status = newStatus }
    }

    fun printInfo(chatMemberAvatar: String) {
        chatUsers.filter { it.avatar == chatMemberAvatar }
            .forEach {
                println(
                    """
                         Имя - ${it.name}
                         Статус - ${it.status}
                    """.trimIndent()
                )
            }
    }
}

class ChatUser(
    val avatar: String,
    val name: String,
    var status: String = ""
)