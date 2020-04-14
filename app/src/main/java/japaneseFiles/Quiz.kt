package japaneseFiles
import com.example.japaneselearningapp.Game as Game
import japaneseFiles.JapaneseCard
import kotlin.random.Random


class Quiz(var timer :Int , var score :Int = 0, var Deck :Array<Int>)
{
    fun askQuestion()
    {

        var random:Int = Random.nextInt(0,45) //gets a random number within the bounds of the kana deck
        var card = chooseDeck(gameKana, random)//chooses a deck and returns your card
        //put the kana into an array with 3 random others
        var random2:Int = Random.nextInt(0,45)
        var random3:Int = Random.nextInt(0,45)
        var random4:Int = Random.nextInt(0,45)
        var question :Array<String> = arrayOf(card.showUText(), HIRAGANA_DECK[random2].showUText(),HIRAGANA_DECK[random3].showUText(),HIRAGANA_DECK[random4].showUText())


    }

    fun formatQuestion(card: JapaneseCard){
        card.showUText()
    }

    fun chooseDeck(choice :Array<Int>, randomnum:Int):JapaneseCard{

        if(choice.contentDeepEquals(arrayOf(1,0)))
        {
            //Hiragana only
            return japaneseFiles.HIRAGANA_DECK[randomnum]
        }
        else if (choice.contentDeepEquals(arrayOf(0,1)))
        {
            //Katakana only
            return japaneseFiles.KATAKANA_DECK[randomnum]
        }
        else
        {
            //both
            var randommeme:Int = Random.nextInt(0,1)
            return if(randommeme==0) {
                japaneseFiles.HIRAGANA_DECK[randomnum]
            } else {
                japaneseFiles.KATAKANA_DECK[randomnum]
            }
        }
    }

    fun addPoint()
    {
        this.score++
    }
}
