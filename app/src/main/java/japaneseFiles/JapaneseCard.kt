package japaneseFiles

class JapaneseCard(
    val hText: String,//display text, what will be shown on the shown part
    val kText: String, //katakana
    val uText: String//Romanized version of the card

) {
    fun showHText():String
    {
        return this.hText
    }

    fun showKText():String
    {
        return this.kText
    }

    fun  showRText():String
    {
        return this.uText
    }

}

val JapaneseDeck : Array<JapaneseCard> = arrayOf(
    JapaneseCard("あ", "ア","a"),
    JapaneseCard("い","イ","i"),
    JapaneseCard("う","ウ","u"),
    JapaneseCard("え","エ","e"),
    JapaneseCard("お","オ","o"),

    JapaneseCard("か","カ","ka"),
    JapaneseCard("き","キ","ki"),
    JapaneseCard("く","ク","ku"),
    JapaneseCard("け","ケ","ke"),
    JapaneseCard("こ","コ","ko"),

    JapaneseCard("さ","サ","sa"),
    JapaneseCard("し","シ","shi"),
    JapaneseCard("す","ス","su"),
    JapaneseCard("せ","セ","se"),
    JapaneseCard("そ","ソ","so"),

    JapaneseCard("た","タ","ta"),
    JapaneseCard("ち","チ","chi"),
    JapaneseCard("つ","ツ","tsu"),
    JapaneseCard("て","テ","te"),
    JapaneseCard("と","ト","to"),

    JapaneseCard("な","ナ","na"),
    JapaneseCard("に","ニ","ni"),
    JapaneseCard("ぬ","ヌ","nu"),
    JapaneseCard("ね","ネ","ne"),
    JapaneseCard("の","ノ","no"),


    JapaneseCard("は","ハ","ha"),
    JapaneseCard("ひ","ヒ","hi"),
    JapaneseCard("ふ","フ","fu"),
    JapaneseCard("へ","ヘ","he"),
    JapaneseCard("ほ","ホ","ho"),


    JapaneseCard("ま","マ","ma"),
    JapaneseCard("み","ミ","mi"),
    JapaneseCard("む","ム","mu"),
    JapaneseCard("め","メ","me"),
    JapaneseCard("も","モ","mo"),


    JapaneseCard("ら","ラ","ra"),
    JapaneseCard("り","リ","ri"),
    JapaneseCard("る","ル","ru"),
    JapaneseCard("れ","レ","re"),
    JapaneseCard("ろ","ロ","ro"),


    JapaneseCard("や","ヤ","ya"),
    JapaneseCard("ゆ","ユ","yu"),
    JapaneseCard("よ","ヨ","yo"),

    JapaneseCard("わ","ワ","wa"),
    JapaneseCard("を","ヲ","wo"),
    JapaneseCard("ん","ン","n")
)
