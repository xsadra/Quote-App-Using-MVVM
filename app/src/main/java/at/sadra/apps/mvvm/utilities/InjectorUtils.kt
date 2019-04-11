package at.sadra.apps.mvvm.utilities

import at.sadra.apps.mvvm.data.FakeDatabase
import at.sadra.apps.mvvm.data.FakeQuoteDao
import at.sadra.apps.mvvm.data.QuoteRepository
import at.sadra.apps.mvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}