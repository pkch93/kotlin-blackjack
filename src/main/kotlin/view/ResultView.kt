package view

import BlackJackGameResult

class ResultView {
    fun printBlackJackGameResult(blackJackGameResults: List<BlackJackGameResult>) {
        blackJackGameResults.forEach {
            val displayCards = it.cards.joinToString(", ") { drawCard -> drawCard.drawCardString }
            println("${it.playerName}: $displayCards - ${it.totalValue}")
        }
    }
}