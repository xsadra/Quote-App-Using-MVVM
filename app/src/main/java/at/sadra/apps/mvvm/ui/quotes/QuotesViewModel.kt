package at.sadra.apps.mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import at.sadra.apps.mvvm.data.Quote
import at.sadra.apps.mvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository : QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}