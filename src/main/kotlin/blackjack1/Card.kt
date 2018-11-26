package blackjack1

class Card(val value:Int, val suit:Int){

    val suitName:String get() = "Spades"
    val valueName:String get() {
        return "Ace"
    }
}