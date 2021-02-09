package japaneseFiles
import android.util.Log
import kotlin.random.Random

class Quiz(var score:Int = 0)
{
    fun askQuestion():Array<JapaneseCard> //ask based on
    {
        val random  = getDiffNum() //gets a set of random numbers within the bounds of the kana deck
        val card = JapaneseDeck[random.elementAt(0)]//chooses a deck and returns your card
        //put the kana into an array with 3 random others
        val question : Array<JapaneseCard> = arrayOf(card, JapaneseDeck[random.elementAt(1)],JapaneseDeck[random.elementAt(2)],JapaneseDeck[random.elementAt(3)])
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

    fun askHira(question : Array<JapaneseCard>):Array<String>{
        return arrayOf(question[0].showKText(), question[0].showHText(),question[1].showHText(),question[2].showHText(),question[3].showHText())
    }

    fun askKata(question : Array<JapaneseCard>):Array<String>{
        return arrayOf(question[0].showHText(), question[0].showKText(),question[1].showKText(),question[2].showKText(),question[3].showKText())
    }

    fun askRoma(question : Array<JapaneseCard>, choice: Array<Int>):Array<String>{
        return when(true){
            choice.contentDeepEquals(arrayOf(1,0)) -> arrayOf(question[0].showHText(), question[0].showRText(),question[1].showRText(),question[2].showRText(),question[3].showRText()) //select for hira
            choice.contentDeepEquals(arrayOf(0,1)) -> arrayOf(question[0].showKText(), question[0].showRText(),question[1].showRText(),question[2].showRText(),question[3].showRText()) // select for kata
            choice.contentDeepEquals(arrayOf(1,1)) -> askRomaB(question) //select for both
            else -> throw Exception("how did you even get here")
        }
    }

    fun askRomaB(question : Array<JapaneseCard>):Array<String>{
        val temp:String
        var r1 = Random.nextInt(0,2)
        //temp = (r1 == 0) ? question[0].showHText() : question[0].showKText()
        if(r1 == 0){
            temp = question[0].showHText()
        }
        else{
            temp = question[0].showKText()
        }
        return arrayOf(temp, question[0].showRText(),question[1].showRText(),question[2].showRText(),question[3].showRText())
    }

    fun addPoint()
    {
        this.score++
    }
}
