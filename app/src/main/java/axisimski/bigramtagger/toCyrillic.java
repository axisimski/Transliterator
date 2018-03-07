package axisimski.bigramtagger;

/**
 * Created by Alex on 3/7/2018.
 */

public class toCyrillic {

    public String convertToCyr(String lat){

        String cyr=lat.replaceAll("a", "а");
        cyr=cyr.replaceAll("b","б");
        cyr=cyr.replaceAll("c","б");
        cyr=cyr.replaceAll("d","б");
        cyr=cyr.replaceAll("e","б");
        cyr=cyr.replaceAll("f","б");
        cyr=cyr.replaceAll("g","б");
        cyr=cyr.replaceAll("h","б");
        cyr=cyr.replaceAll("i","б");
        cyr=cyr.replaceAll("j","б");
        cyr=cyr.replaceAll("k","б");
        cyr=cyr.replaceAll("l","б");
        cyr=cyr.replaceAll("m","б");
        cyr=cyr.replaceAll("n","б");
        cyr=cyr.replaceAll("o","б");
        cyr=cyr.replaceAll("p","б");
        cyr=cyr.replaceAll("q","б");
        cyr=cyr.replaceAll("r","б");
        cyr=cyr.replaceAll("s","б");
        cyr=cyr.replaceAll("t","б");
        cyr=cyr.replaceAll("u","б");
        cyr=cyr.replaceAll("v","б");
        cyr=cyr.replaceAll("w","б");
        cyr=cyr.replaceAll("x","б");
        cyr=cyr.replaceAll("y","б");
        cyr=cyr.replaceAll("z","б");
        cyr=cyr.replaceAll("ch","б");
        cyr=cyr.replaceAll("ts","х");
        cyr=cyr.replaceAll("sh","б");
        cyr=cyr.replaceAll("shch","б");
        cyr=cyr.replaceAll("y","ы");
        cyr=cyr.replaceAll("iu","ю");
        cyr=cyr.replaceAll("ia","я");







        return  cyr;
    }

}
