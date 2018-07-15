package axisimski.bigramtagger

/**
 * Created by Alex on 3/7/2018.
 */

class toLatin {

    //Convert from Russian Cyrillic
    fun convertRU(cyr: String): String {

        var lat: String

        //Lower case letters
        lat = cyr.replace("а".toRegex(), "a")
        lat = lat.replace("б".toRegex(), "b")
        lat = lat.replace("в".toRegex(), "v")
        lat = lat.replace("г".toRegex(), "g")
        lat = lat.replace("д".toRegex(), "d")
        lat = lat.replace("е".toRegex(), "e")
        lat = lat.replace("ё".toRegex(), "e")
        lat = lat.replace("ж".toRegex(), "zh")
        lat = lat.replace("з".toRegex(), "z")
        lat = lat.replace("и".toRegex(), "i")
        lat = lat.replace("й".toRegex(), "i")
        lat = lat.replace("к".toRegex(), "k")
        lat = lat.replace("л".toRegex(), "l")
        lat = lat.replace("м".toRegex(), "m")
        lat = lat.replace("н".toRegex(), "n")
        lat = lat.replace("о".toRegex(), "o")
        lat = lat.replace("п".toRegex(), "p")
        lat = lat.replace("р".toRegex(), "r")
        lat = lat.replace("с".toRegex(), "s")
        lat = lat.replace("т".toRegex(), "t")
        lat = lat.replace("у".toRegex(), "u")
        lat = lat.replace("ф".toRegex(), "f")
        lat = lat.replace("х".toRegex(), "kh")
        lat = lat.replace("ц".toRegex(), "ts")
        lat = lat.replace("ч".toRegex(), "ch")
        lat = lat.replace("ш".toRegex(), "sh")
        lat = lat.replace("щ".toRegex(), "shch")
        lat = lat.replace("ъ".toRegex(), "ie")
        lat = lat.replace("ы".toRegex(), "y")
        lat = lat.replace("ь".toRegex(), "-")
        lat = lat.replace("э".toRegex(), "e")
        lat = lat.replace("ю".toRegex(), "iu")
        lat = lat.replace("я".toRegex(), "ia")

        //Capital letters
        lat = lat.replace("А".toRegex(), "A")
        lat = lat.replace("Б".toRegex(), "B")
        lat = lat.replace("В".toRegex(), "V")
        lat = lat.replace("Г".toRegex(), "G")
        lat = lat.replace("Д".toRegex(), "D")
        lat = lat.replace("Е".toRegex(), "E")
        lat = lat.replace("Ё".toRegex(), "E")
        lat = lat.replace("Ж".toRegex(), "ZH")
        lat = lat.replace("З".toRegex(), "Z")
        lat = lat.replace("И".toRegex(), "I")
        lat = lat.replace("Л".toRegex(), "I")
        lat = lat.replace("К".toRegex(), "K")
        lat = lat.replace("Л".toRegex(), "L")
        lat = lat.replace("М".toRegex(), "M")
        lat = lat.replace("Н".toRegex(), "N")
        lat = lat.replace("О".toRegex(), "O")
        lat = lat.replace("П".toRegex(), "P")
        lat = lat.replace("Р".toRegex(), "R")
        lat = lat.replace("С".toRegex(), "S")
        lat = lat.replace("Т".toRegex(), "T")
        lat = lat.replace("У".toRegex(), "U")
        lat = lat.replace("Ф".toRegex(), "F")
        lat = lat.replace("Х".toRegex(), "KH")
        lat = lat.replace("Ц".toRegex(), "TS")
        lat = lat.replace("Ч".toRegex(), "CH")
        lat = lat.replace("Ш".toRegex(), "SH")
        lat = lat.replace("Щ".toRegex(), "SHCH")
        lat = lat.replace("Ъ".toRegex(), "IE")
        lat = lat.replace("Ы".toRegex(), "Y")
        lat = lat.replace("Ь".toRegex(), "-")
        lat = lat.replace("Э".toRegex(), "E")
        lat = lat.replace("Ю".toRegex(), "IU")
        lat = lat.replace("Я".toRegex(), "IA")


        return lat //Return latinized string


    }

    //Convert from Bulgarian Cyrillic
    fun convertBG(cyr: String): String {

        var lat: String

        lat = cyr.replace("а".toRegex(), "a")
        lat = lat.replace("б".toRegex(), "b")
        lat = lat.replace("в".toRegex(), "v")
        lat = lat.replace("г".toRegex(), "g")
        lat = lat.replace("д".toRegex(), "d")
        lat = lat.replace("е".toRegex(), "e")
        lat = lat.replace("ж".toRegex(), "j")
        lat = lat.replace("з".toRegex(), "z")
        lat = lat.replace("и".toRegex(), "i")
        lat = lat.replace("й".toRegex(), "i")
        lat = lat.replace("к".toRegex(), "k")
        lat = lat.replace("л".toRegex(), "l")
        lat = lat.replace("м".toRegex(), "m")
        lat = lat.replace("н".toRegex(), "n")
        lat = lat.replace("о".toRegex(), "o")
        lat = lat.replace("п".toRegex(), "p")
        lat = lat.replace("р".toRegex(), "r")
        lat = lat.replace("с".toRegex(), "s")
        lat = lat.replace("т".toRegex(), "t")
        lat = lat.replace("у".toRegex(), "u")
        lat = lat.replace("ф".toRegex(), "f")
        lat = lat.replace("х".toRegex(), "h")
        lat = lat.replace("ц".toRegex(), "c")
        lat = lat.replace("ч".toRegex(), "ch")
        lat = lat.replace("ш".toRegex(), "sh")
        lat = lat.replace("щ".toRegex(), "sht")
        lat = lat.replace("ъ".toRegex(), "u'")
        lat = lat.replace("ь".toRegex(), "'")
        lat = lat.replace("ю".toRegex(), "iu")
        lat = lat.replace("я".toRegex(), "ia")


        lat = lat.replace("А".toRegex(), "A")
        lat = lat.replace("Б".toRegex(), "B")
        lat = lat.replace("В".toRegex(), "V")
        lat = lat.replace("Г".toRegex(), "G")
        lat = lat.replace("Д".toRegex(), "D")
        lat = lat.replace("Е".toRegex(), "E")
        lat = lat.replace("Ж".toRegex(), "J")
        lat = lat.replace("З".toRegex(), "Z")
        lat = lat.replace("И".toRegex(), "I")
        lat = lat.replace("Л".toRegex(), "I")
        lat = lat.replace("К".toRegex(), "K")
        lat = lat.replace("Л".toRegex(), "L")
        lat = lat.replace("М".toRegex(), "M")
        lat = lat.replace("Н".toRegex(), "N")
        lat = lat.replace("О".toRegex(), "O")
        lat = lat.replace("П".toRegex(), "P")
        lat = lat.replace("Р".toRegex(), "R")
        lat = lat.replace("С".toRegex(), "S")
        lat = lat.replace("Т".toRegex(), "T")
        lat = lat.replace("У".toRegex(), "U")
        lat = lat.replace("Ф".toRegex(), "F")
        lat = lat.replace("Х".toRegex(), "H")
        lat = lat.replace("Ц".toRegex(), "C")
        lat = lat.replace("Ч".toRegex(), "CH")
        lat = lat.replace("Ш".toRegex(), "SH")
        lat = lat.replace("Щ".toRegex(), "SHT")
        lat = lat.replace("Ъ".toRegex(), "U'")
        lat = lat.replace("Ь".toRegex(), "'")
        lat = lat.replace("Ю".toRegex(), "IU")
        lat = lat.replace("Я".toRegex(), "IA")


        return lat


    }

    //Convert from Mongolian Cyrillic
    fun convertMO(cyr: String): String {

        var lat: String

        lat = cyr.replace("а".toRegex(), "a")
        lat = lat.replace("б".toRegex(), "b")
        lat = lat.replace("в".toRegex(), "v")
        lat = lat.replace("г".toRegex(), "g")
        lat = lat.replace("д".toRegex(), "d")
        lat = lat.replace("е".toRegex(), "je")
        lat = lat.replace("ё".toRegex(), "jo")
        lat = lat.replace("ж".toRegex(), "zh")
        lat = lat.replace("з".toRegex(), "z")
        lat = lat.replace("и".toRegex(), "i")
        lat = lat.replace("й".toRegex(), "i")
        lat = lat.replace("к".toRegex(), "k")
        lat = lat.replace("л".toRegex(), "l")
        lat = lat.replace("м".toRegex(), "m")
        lat = lat.replace("н".toRegex(), "n")
        lat = lat.replace("о".toRegex(), "o")
        lat = lat.replace("ө".toRegex(), "o")
        lat = lat.replace("п".toRegex(), "p")
        lat = lat.replace("р".toRegex(), "r")
        lat = lat.replace("с".toRegex(), "s")
        lat = lat.replace("т".toRegex(), "t")
        lat = lat.replace("у".toRegex(), "u")
        lat = lat.replace("ү".toRegex(), "u")
        lat = lat.replace("ф".toRegex(), "f")
        lat = lat.replace("х".toRegex(), "h")
        lat = lat.replace("ц".toRegex(), "ts")
        lat = lat.replace("ч".toRegex(), "ch")
        lat = lat.replace("ш".toRegex(), "sh")
        lat = lat.replace("щ".toRegex(), "sht")
        lat = lat.replace("ы".toRegex(), "y")
        lat = lat.replace("ь".toRegex(), "'")
        lat = lat.replace("ю".toRegex(), "iu")
        lat = lat.replace("я".toRegex(), "ia")
        lat = lat.replace("э".toRegex(), "e")


        //Capital letters
        lat = lat.replace("А".toRegex(), "A")
        lat = lat.replace("Б".toRegex(), "B")
        lat = lat.replace("В".toRegex(), "V")
        lat = lat.replace("Г".toRegex(), "G")
        lat = lat.replace("Д".toRegex(), "D")
        lat = lat.replace("Е".toRegex(), "JE")
        lat = lat.replace("Ё".toRegex(), "JO")
        lat = lat.replace("Ж".toRegex(), "ZH")
        lat = lat.replace("З".toRegex(), "Z")
        lat = lat.replace("И".toRegex(), "I")
        lat = lat.replace("Л".toRegex(), "I")
        lat = lat.replace("К".toRegex(), "K")
        lat = lat.replace("Л".toRegex(), "L")
        lat = lat.replace("М".toRegex(), "M")
        lat = lat.replace("Н".toRegex(), "N")
        lat = lat.replace("О".toRegex(), "O")
        lat = lat.replace("Ө".toRegex(), "O")
        lat = lat.replace("П".toRegex(), "P")
        lat = lat.replace("Р".toRegex(), "R")
        lat = lat.replace("С".toRegex(), "S")
        lat = lat.replace("Т".toRegex(), "T")
        lat = lat.replace("У".toRegex(), "U")
        lat = lat.replace("ү".toRegex(), "U")
        lat = lat.replace("Ф".toRegex(), "F")
        lat = lat.replace("Х".toRegex(), "KH")
        lat = lat.replace("Ц".toRegex(), "TS")
        lat = lat.replace("Ч".toRegex(), "CH")
        lat = lat.replace("Ш".toRegex(), "SH")
        lat = lat.replace("Щ".toRegex(), "SHCH")
        lat = lat.replace("Ъ".toRegex(), "IE")
        lat = lat.replace("Ы".toRegex(), "Y")
        lat = lat.replace("Ь".toRegex(), "-")
        lat = lat.replace("Э".toRegex(), "E")
        lat = lat.replace("Ю".toRegex(), "IU")
        lat = lat.replace("Я".toRegex(), "IA")


        return lat

    }


}
