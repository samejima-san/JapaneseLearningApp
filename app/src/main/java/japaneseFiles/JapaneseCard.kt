package japaneseFiles

class JapaneseCard(
    val dText: String,//display text, what will be shown on the shown part
    val uText: String//Romanized version of the card

) {
    fun showDText():String
    {
        return this.dText
    }

    fun  showUText():String
    {
        return this.uText
    }

}

val HIRAGANA_DECK : Array<JapaneseCard> = arrayOf(
    JapaneseCard("あ","a"),
    JapaneseCard("い","i"),
    JapaneseCard("う","u"),
    JapaneseCard("え","e"),
    JapaneseCard("お","o"),

    JapaneseCard("か","ka"),
    JapaneseCard("き","ki"),
    JapaneseCard("く","ku"),
    JapaneseCard("け","ke"),
    JapaneseCard("こ","ko"),

    JapaneseCard("さ","sa"),
    JapaneseCard("し","shi"),
    JapaneseCard("す","su"),
    JapaneseCard("せ","se"),
    JapaneseCard("そ","so"),

    JapaneseCard("た","ta"),
    JapaneseCard("ち","chi"),
    JapaneseCard("つ","tsu"),
    JapaneseCard("て","te"),
    JapaneseCard("と","to"),

    JapaneseCard("な","na"),
    JapaneseCard("に","ni"),
    JapaneseCard("ぬ","nu"),
    JapaneseCard("ね","ne"),
    JapaneseCard("の","no"),


    JapaneseCard("は","ha"),
    JapaneseCard("ひ","hi"),
    JapaneseCard("ふ","fu"),
    JapaneseCard("へ","he"),
    JapaneseCard("ほ","ho"),


    JapaneseCard("ま","ma"),
    JapaneseCard("み","mi"),
    JapaneseCard("む","mu"),
    JapaneseCard("め","me"),
    JapaneseCard("も","mo"),


    JapaneseCard("ら","ra"),
    JapaneseCard("り","ri"),
    JapaneseCard("る","ru"),
    JapaneseCard("れ","re"),
    JapaneseCard("ろ","ro"),


    JapaneseCard("や","ya"),
    JapaneseCard("ゆ","yu"),
    JapaneseCard("よ","yo"),

    JapaneseCard("わ","wa"),
    JapaneseCard("を","wo"),
    JapaneseCard("ん","n")
)

val KATAKANA_DECK : Array<JapaneseCard> = arrayOf(
    JapaneseCard("ア","a"),
    JapaneseCard("イ","i"),
    JapaneseCard("ウ","u"),
    JapaneseCard("エ","e"),
    JapaneseCard("オ","o"),

    JapaneseCard("カ","ka"),
    JapaneseCard("キ","ki"),
    JapaneseCard("ク","ku"),
    JapaneseCard("ケ","ke"),
    JapaneseCard("コ","ko"),

    JapaneseCard("サ","sa"),
    JapaneseCard("シ","shi"),
    JapaneseCard("ス","su"),
    JapaneseCard("セ","se"),
    JapaneseCard("ソ","so"),

    JapaneseCard("タ","ta"),
    JapaneseCard("チ","chi"),
    JapaneseCard("ツ","tsu"),
    JapaneseCard("テ","te"),
    JapaneseCard("ト","to"),

    JapaneseCard("ナ","na"),
    JapaneseCard("ニ","ni"),
    JapaneseCard("ヌ","nu"),
    JapaneseCard("ネ","ne"),
    JapaneseCard("ノ","no"),


    JapaneseCard("ハ","ha"),
    JapaneseCard("ヒ","hi"),
    JapaneseCard("フ","fu"),
    JapaneseCard("ヘ","he"),
    JapaneseCard("ホ","ho"),


    JapaneseCard("マ","ma"),
    JapaneseCard("ミ","mi"),
    JapaneseCard("ム","mu"),
    JapaneseCard("メ","me"),
    JapaneseCard("モ","mo"),


    JapaneseCard("ラ","ra"),
    JapaneseCard("リ","ri"),
    JapaneseCard("ル","ru"),
    JapaneseCard("レ","re"),
    JapaneseCard("ロ","ro"),


    JapaneseCard("ヤ","ya"),
    JapaneseCard("ユ","yu"),
    JapaneseCard("ヨ","yo"),

    JapaneseCard("ワ","wa"),
    JapaneseCard("ヲ","wo"),
    JapaneseCard("ン","n")
)
