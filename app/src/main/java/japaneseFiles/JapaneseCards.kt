package japaneseFiles
import JapaneseCards.kt

class JapaneseCards(
    val dText: String,//display text, what will be shown on the shown part
    val uText: String//Romanized version of the card

) {

    fun showDText():String
    {
        return this.dText
    }

    fun showUText():String
    {
        return this.uText
    }

}

val HiraganaDeck : Array<JapaneseCards> = arrayOf(
    JapaneseCards("あ","a"),
    JapaneseCards("い","i"),
    JapaneseCards("う","u"),
    JapaneseCards("え","e"),
    JapaneseCards("お","o"),

    JapaneseCards("か","ka"),
    JapaneseCards("き","ki"),
    JapaneseCards("く","ku"),
    JapaneseCards("け","ke"),
    JapaneseCards("こ","ko"),

    JapaneseCards("さ","sa"),
    JapaneseCards("し","shi"),
    JapaneseCards("す","su"),
    JapaneseCards("せ","se"),
    JapaneseCards("そ","so"),

    JapaneseCards("た","ta"),
    JapaneseCards("ち","chi"),
    JapaneseCards("つ","tsu"),
    JapaneseCards("て","te"),
    JapaneseCards("と","to"),

    JapaneseCards("な","na"),
    JapaneseCards("に","ni"),
    JapaneseCards("ぬ","nu"),
    JapaneseCards("ね","ne"),
    JapaneseCards("の","no"),


    JapaneseCards("は","ha"),
    JapaneseCards("ひ","hi"),
    JapaneseCards("ふ","fu"),
    JapaneseCards("へ","he"),
    JapaneseCards("ほ","ho"),


    JapaneseCards("ま","ma"),
    JapaneseCards("み","mi"),
    JapaneseCards("む","mu"),
    JapaneseCards("め","me"),
    JapaneseCards("も","mo"),


    JapaneseCards("ら","ra"),
    JapaneseCards("り","ri"),
    JapaneseCards("る","ru"),
    JapaneseCards("れ","re"),
    JapaneseCards("ろ","ro"),


    JapaneseCards("や","ya"),
    JapaneseCards("ゆ","yu"),
    JapaneseCards("よ","yo"),

    JapaneseCards("わ","wa"),
    JapaneseCards("を","wo"),
    JapaneseCards("ん","n")
)

val KatakanaDeck : Array<JapaneseCards> = arrayOf(
    JapaneseCards("ア","a"),
    JapaneseCards("イ","i"),
    JapaneseCards("ウ","u"),
    JapaneseCards("エ","e"),
    JapaneseCards("オ","o"),

    JapaneseCards("カ","ka"),
    JapaneseCards("キ","ki"),
    JapaneseCards("ク","ku"),
    JapaneseCards("ケ","ke"),
    JapaneseCards("コ","ko"),

    JapaneseCards("サ","sa"),
    JapaneseCards("シ","shi"),
    JapaneseCards("ス","su"),
    JapaneseCards("セ","se"),
    JapaneseCards("ソ","so"),

    JapaneseCards("タ","ta"),
    JapaneseCards("チ","chi"),
    JapaneseCards("ツ","tsu"),
    JapaneseCards("テ","te"),
    JapaneseCards("ト","to"),

    JapaneseCards("ナ","na"),
    JapaneseCards("ニ","ni"),
    JapaneseCards("ヌ","nu"),
    JapaneseCards("ネ","ne"),
    JapaneseCards("ノ","no"),


    JapaneseCards("ハ","ha"),
    JapaneseCards("ヒ","hi"),
    JapaneseCards("フ","fu"),
    JapaneseCards("ヘ","he"),
    JapaneseCards("ホ","ho"),


    JapaneseCards("マ","ma"),
    JapaneseCards("ミ","mi"),
    JapaneseCards("ム","mu"),
    JapaneseCards("メ","me"),
    JapaneseCards("モ","mo"),


    JapaneseCards("ラ","ra"),
    JapaneseCards("リ","ri"),
    JapaneseCards("ル","ru"),
    JapaneseCards("レ","re"),
    JapaneseCards("ロ","ro"),


    JapaneseCards("ヤ","ya"),
    JapaneseCards("ユ","yu"),
    JapaneseCards("ヨ","yo"),

    JapaneseCards("ワ","wa"),
    JapaneseCards("ヲ","wo"),
    JapaneseCards("ン","n")
)
