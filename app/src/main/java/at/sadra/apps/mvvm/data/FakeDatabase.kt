package at.sadra.apps.mvvm.data

class FakeDatabase private constructor(){
    val quoteDao = FakeQuoteDao()
//    private get

    companion object {
        @Volatile private var instant: FakeDatabase? = null

        fun getInstance() =
                instant ?: synchronized(lock = this){
                    instant?: FakeDatabase().also { instant = it }
                }
    }
}