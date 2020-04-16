package japaneseFiles
import kotlin.random.Random

//timer = get gTime from Game.kt, Deck = get gameKana from Game.kt
class Quiz(var score:Int = 0, var Deck: Array<Int>)
{
    fun askQuestion():Array<JapaneseCard>
    {

        val random:Int = Random.nextInt(0,46) //gets a random number within the bounds of the kana deck
        val card = chooseDeck(Deck, random)//chooses a deck and returns your card
        //put the kana into an array with 3 random others
        val random2:Int = Random.nextInt(0,46)
        val random3:Int = Random.nextInt(0,46)
        val random4:Int = Random.nextInt(0,46)
        val question : Array<JapaneseCard> = arrayOf(card, HIRAGANA_DECK[random2],HIRAGANA_DECK[random3],HIRAGANA_DECK[random4])

        return arrayOf(question[0],question[1],question[2],question[3])

    }

    fun chooseDeck(choice :Array<Int>, randomnum:Int):JapaneseCard{

        if(choice.contentDeepEquals(arrayOf(1,0)))
        {
            //Hiragana only
            return HIRAGANA_DECK[randomnum]
        }
        else if (choice.contentDeepEquals(arrayOf(0,1)))
        {
            //Katakana only
            return KATAKANA_DECK[randomnum]
        }
        else
        {
            //both
            val randommeme:Int = Random.nextInt(0,2)
            return if(randommeme==0) {
                HIRAGANA_DECK[randomnum]
            } else {
                KATAKANA_DECK[randomnum]
            }
        }
    }

    fun addPoint()
    {
        this.score++
    }
}
