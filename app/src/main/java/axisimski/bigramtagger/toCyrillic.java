package axisimski.bigramtagger;

/**
 * Created by Alex on 3/7/2018.
 */

public class toCyrillic {

    public String convertToCyrRU(String lat){

        String cyr=lat.replaceAll("a", "а");
        cyr=cyr.replaceAll("b","б");
        cyr=cyr.replaceAll("ch","ч");
        cyr=cyr.replaceAll("ts","ц");
        cyr=cyr.replaceAll("sh","ш");
        cyr=cyr.replaceAll("shch","щ");
        cyr=cyr.replaceAll("y","ы");
        cyr=cyr.replaceAll("iu","ю");
        cyr=cyr.replaceAll("ia","я");
        cyr=cyr.replaceAll("c","ц");
        cyr=cyr.replaceAll("d","д");
        cyr=cyr.replaceAll("e","е");
        cyr=cyr.replaceAll("f","ф");
        cyr=cyr.replaceAll("g","г");
        cyr=cyr.replaceAll("h","х");
        cyr=cyr.replaceAll("i","и");
        cyr=cyr.replaceAll("j","й");
        cyr=cyr.replaceAll("k","к");
        cyr=cyr.replaceAll("l","л");
        cyr=cyr.replaceAll("m","м");
        cyr=cyr.replaceAll("n","н");
        cyr=cyr.replaceAll("o","о");
        cyr=cyr.replaceAll("p","п");
        cyr=cyr.replaceAll("q","к");
        cyr=cyr.replaceAll("r","р");
        cyr=cyr.replaceAll("s","с");
        cyr=cyr.replaceAll("t","т");
        cyr=cyr.replaceAll("u","у");
        cyr=cyr.replaceAll("v","в");
        cyr=cyr.replaceAll("w","уа");
        cyr=cyr.replaceAll("x","кс");
        cyr=cyr.replaceAll("y","й");
        cyr=cyr.replaceAll("z","з");

        lat.replaceAll("A", "А");
        cyr=cyr.replaceAll("B","Б");
        cyr=cyr.replaceAll("CH","Ч");
        cyr=cyr.replaceAll("TS","Ц");
        cyr=cyr.replaceAll("SH","Ш");
        cyr=cyr.replaceAll("SHCH","Щ");
        cyr=cyr.replaceAll("Y","Ы");
        cyr=cyr.replaceAll("IU","Ю");
        cyr=cyr.replaceAll("IA","Я");
        cyr=cyr.replaceAll("C","Ц");
        cyr=cyr.replaceAll("D","Д");
        cyr=cyr.replaceAll("E","Е");
        cyr=cyr.replaceAll("F","Ф");
        cyr=cyr.replaceAll("G","Г");
        cyr=cyr.replaceAll("H","Х");
        cyr=cyr.replaceAll("I","И");
        cyr=cyr.replaceAll("J","Й");
        cyr=cyr.replaceAll("K","К");
        cyr=cyr.replaceAll("L","Л");
        cyr=cyr.replaceAll("M","М");
        cyr=cyr.replaceAll("N","Н");
        cyr=cyr.replaceAll("O","О");
        cyr=cyr.replaceAll("P","П");
        cyr=cyr.replaceAll("Q","К");
        cyr=cyr.replaceAll("R","Р");
        cyr=cyr.replaceAll("S","С");
        cyr=cyr.replaceAll("T","Т");
        cyr=cyr.replaceAll("U","У");
        cyr=cyr.replaceAll("V","В");
        cyr=cyr.replaceAll("W","УА");
        cyr=cyr.replaceAll("X","КС");
        cyr=cyr.replaceAll("Y","Й");
        cyr=cyr.replaceAll("Z","З");


        return  cyr;
    }

    public String convertToCyrBG(String lat){

        String cyr=lat.replaceAll("a", "а");
        cyr=cyr.replaceAll("b","б");
        cyr=cyr.replaceAll("ch","ч");
        cyr=cyr.replaceAll("ts","ц");
        cyr=cyr.replaceAll("sh","ш");
        cyr=cyr.replaceAll("sht","щ");
        cyr=cyr.replaceAll("iu","ю");
        cyr=cyr.replaceAll("ia","я");
        cyr=cyr.replaceAll("c","ц");
        cyr=cyr.replaceAll("d","д");
        cyr=cyr.replaceAll("e","е");
        cyr=cyr.replaceAll("f","ф");
        cyr=cyr.replaceAll("g","г");
        cyr=cyr.replaceAll("h","х");
        cyr=cyr.replaceAll("i","и");
        cyr=cyr.replaceAll("j","ж");
        cyr=cyr.replaceAll("k","к");
        cyr=cyr.replaceAll("l","л");
        cyr=cyr.replaceAll("m","м");
        cyr=cyr.replaceAll("n","н");
        cyr=cyr.replaceAll("o","о");
        cyr=cyr.replaceAll("p","п");
        cyr=cyr.replaceAll("q","к");
        cyr=cyr.replaceAll("r","р");
        cyr=cyr.replaceAll("s","с");
        cyr=cyr.replaceAll("t","т");
        cyr=cyr.replaceAll("u","у");
        cyr=cyr.replaceAll("v","в");
        cyr=cyr.replaceAll("w","у");
        cyr=cyr.replaceAll("x","кс");
        cyr=cyr.replaceAll("y","й");
        cyr=cyr.replaceAll("z","з");

        lat.replaceAll("A", "А");
        cyr=cyr.replaceAll("B","Б");
        cyr=cyr.replaceAll("CH","Ч");
        cyr=cyr.replaceAll("TS","Ц");
        cyr=cyr.replaceAll("SH","Ш");
        cyr=cyr.replaceAll("SHТ","Щ");
        cyr=cyr.replaceAll("IU","Ю");
        cyr=cyr.replaceAll("IA","Я");
        cyr=cyr.replaceAll("C","Ц");
        cyr=cyr.replaceAll("D","Д");
        cyr=cyr.replaceAll("E","Е");
        cyr=cyr.replaceAll("F","Ф");
        cyr=cyr.replaceAll("G","Г");
        cyr=cyr.replaceAll("H","Х");
        cyr=cyr.replaceAll("I","И");
        cyr=cyr.replaceAll("J","Ж");
        cyr=cyr.replaceAll("K","К");
        cyr=cyr.replaceAll("L","Л");
        cyr=cyr.replaceAll("M","М");
        cyr=cyr.replaceAll("N","Н");
        cyr=cyr.replaceAll("O","О");
        cyr=cyr.replaceAll("P","П");
        cyr=cyr.replaceAll("Q","К");
        cyr=cyr.replaceAll("R","Р");
        cyr=cyr.replaceAll("S","С");
        cyr=cyr.replaceAll("T","Т");
        cyr=cyr.replaceAll("U","У");
        cyr=cyr.replaceAll("V","В");
        cyr=cyr.replaceAll("W","У");
        cyr=cyr.replaceAll("X","КС");
        cyr=cyr.replaceAll("Y","Й");
        cyr=cyr.replaceAll("Z","З");


        return  cyr;
    }

}
