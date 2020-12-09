package japaneseFiles
import kotlin.random.Random

//timer = get gTime from Game.kt, Deck = get gameKana from Game.kt
class Quiz(var score:Int = 0, var Deck: Array<Int>)
{
    fun askQuestion():Array<JapaneseCard>
    {

        val random  = getDiffNum() //gets a set of random numbers within the bounds of the kana deck
        val card = chooseDeck(Deck, random.elementAt(0))//chooses a deck and returns your card
        //put the kana into an array with 3 random others
        val question : Array<JapaneseCard> = arrayOf(card, HIRAGANA_DECK[random.elementAt(1)],HIRAGANA_DECK[random.elementAt(2)],HIRAGANA_DECK[random.elementAt(3)])

        return arrayOf(question[0],question[1],question[2],question[3])

    }

    fun getDiffNum(): MutableSet<Int> {
        val questionSet = mutableSetOf<Int>()
        while(questionSet.size != 4)
        {
            //add elements to the set until you have 4 elements
            questionSet.add(Random.nextInt(0,46))
        }
        return questionSet
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
