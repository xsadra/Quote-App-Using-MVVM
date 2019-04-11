package at.sadra.apps.mvvm.data

data class Quote(val quoteTest: String,
                 val author: String) {
    override fun toString(): String {
        return "$quoteTest - $author"
    }
}