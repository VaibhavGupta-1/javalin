enum class Author {
    USER, BOT
}

data class ChatMessage(
    val text: String,
    val author: Author
)
