package axisimski.bigramtagger;

/**
 * Created by Alex on 3/7/2018.
 */

public class toLatin {

    public String convert(String cyr){

        String lat;

        lat=cyr.replaceAll("а","a");
        lat=lat.replaceAll("б","b");
        lat=lat.replaceAll("в","v");
        lat=lat.replaceAll("г","g");
        lat=lat.replaceAll("д","d");
        lat=lat.replaceAll("е","e");
        lat=lat.replaceAll("ё","e");
        lat=lat.replaceAll("ж","zh");
        lat=lat.replaceAll("з","z");
        lat=lat.replaceAll("и","i");
        lat=lat.replaceAll("й","i");
        lat=lat.replaceAll("к","k");
        lat=lat.replaceAll("л","l");
        lat=lat.replaceAll("м","m");
        lat=lat.replaceAll("н","n");
        lat=lat.replaceAll("о","o");
        lat=lat.replaceAll("п","p");
        lat=lat.replaceAll("р","r");
        lat=lat.replaceAll("с","s");
        lat=lat.replaceAll("т","t");
        lat=lat.replaceAll("у","u");
        lat=lat.replaceAll("ф","f");
        lat=lat.replaceAll("х","kh");
        lat=lat.replaceAll("ц","ts");
        lat=lat.replaceAll("ч","ch");
        lat=lat.replaceAll("ш","sh");
        lat=lat.replaceAll("щ","shch");
        lat=lat.replaceAll("ъ","ie");
        lat=lat.replaceAll("ы","y");
        lat=lat.replaceAll("ь","-");
        lat=lat.replaceAll("э","e");
        lat=lat.replaceAll("ю","iu");
        lat=lat.replaceAll("я","ia");


        return lat;


    }



}
