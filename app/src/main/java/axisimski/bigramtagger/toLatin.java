package axisimski.bigramtagger;

/**
 * Created by Alex on 3/7/2018.
 */

public class toLatin {

    //Convert from Russian Cyrillic
    public String convertRU(String cyr){

        String lat;

        //Lower case letters
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

        //Capital letters
        lat=lat.replaceAll("А","A");
        lat=lat.replaceAll("Б","B");
        lat=lat.replaceAll("В","V");
        lat=lat.replaceAll("Г","G");
        lat=lat.replaceAll("Д","D");
        lat=lat.replaceAll("Е","E");
        lat=lat.replaceAll("Ё","E");
        lat=lat.replaceAll("Ж","ZH");
        lat=lat.replaceAll("З","Z");
        lat=lat.replaceAll("И","I");
        lat=lat.replaceAll("Л","I");
        lat=lat.replaceAll("К","K");
        lat=lat.replaceAll("Л","L");
        lat=lat.replaceAll("М","M");
        lat=lat.replaceAll("Н","N");
        lat=lat.replaceAll("О","O");
        lat=lat.replaceAll("П","P");
        lat=lat.replaceAll("Р","R");
        lat=lat.replaceAll("С","S");
        lat=lat.replaceAll("Т","T");
        lat=lat.replaceAll("У","U");
        lat=lat.replaceAll("Ф","F");
        lat=lat.replaceAll("Х","KH");
        lat=lat.replaceAll("Ц","TS");
        lat=lat.replaceAll("Ч","CH");
        lat=lat.replaceAll("Ш","SH");
        lat=lat.replaceAll("Щ","SHCH");
        lat=lat.replaceAll("Ъ","IE");
        lat=lat.replaceAll("Ы","Y");
        lat=lat.replaceAll("Ь","-");
        lat=lat.replaceAll("Э","E");
        lat=lat.replaceAll("Ю","IU");
        lat=lat.replaceAll("Я","IA");


        return lat; //Return latinized string


    }

    //Convert from Bulgarian Cyrillic
    public String convertBG(String cyr){

        String lat;

        lat=cyr.replaceAll("а","a");
        lat=lat.replaceAll("б","b");
        lat=lat.replaceAll("в","v");
        lat=lat.replaceAll("г","g");
        lat=lat.replaceAll("д","d");
        lat=lat.replaceAll("е","e");
        lat=lat.replaceAll("ж","j");
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
        lat=lat.replaceAll("х","h");
        lat=lat.replaceAll("ц","c");
        lat=lat.replaceAll("ч","ch");
        lat=lat.replaceAll("ш","sh");
        lat=lat.replaceAll("щ","sht");
        lat=lat.replaceAll("ъ","u'");
        lat=lat.replaceAll("ь","'");
        lat=lat.replaceAll("ю","iu");
        lat=lat.replaceAll("я","ia");


        lat=lat.replaceAll("А","A");
        lat=lat.replaceAll("Б","B");
        lat=lat.replaceAll("В","V");
        lat=lat.replaceAll("Г","G");
        lat=lat.replaceAll("Д","D");
        lat=lat.replaceAll("Е","E");
        lat=lat.replaceAll("Ж","J");
        lat=lat.replaceAll("З","Z");
        lat=lat.replaceAll("И","I");
        lat=lat.replaceAll("Л","I");
        lat=lat.replaceAll("К","K");
        lat=lat.replaceAll("Л","L");
        lat=lat.replaceAll("М","M");
        lat=lat.replaceAll("Н","N");
        lat=lat.replaceAll("О","O");
        lat=lat.replaceAll("П","P");
        lat=lat.replaceAll("Р","R");
        lat=lat.replaceAll("С","S");
        lat=lat.replaceAll("Т","T");
        lat=lat.replaceAll("У","U");
        lat=lat.replaceAll("Ф","F");
        lat=lat.replaceAll("Х","H");
        lat=lat.replaceAll("Ц","C");
        lat=lat.replaceAll("Ч","CH");
        lat=lat.replaceAll("Ш","SH");
        lat=lat.replaceAll("Щ","SHT");
        lat=lat.replaceAll("Ъ","U'");
        lat=lat.replaceAll("Ь","'");
        lat=lat.replaceAll("Ю","IU");
        lat=lat.replaceAll("Я","IA");


        return lat;


    }

    //Convert from Mongolian Cyrillic
    public String convertMO(String cyr){

        String lat;

        lat=cyr.replaceAll("а","a");
        lat=lat.replaceAll("б","b");
        lat=lat.replaceAll("в","v");
        lat=lat.replaceAll("г","g");
        lat=lat.replaceAll("д","d");
        lat=lat.replaceAll("е","je");
        lat=lat.replaceAll("ё","jo");
        lat=lat.replaceAll("ж","zh");
        lat=lat.replaceAll("з","z");
        lat=lat.replaceAll("и","i");
        lat=lat.replaceAll("й","i");
        lat=lat.replaceAll("к","k");
        lat=lat.replaceAll("л","l");
        lat=lat.replaceAll("м","m");
        lat=lat.replaceAll("н","n");
        lat=lat.replaceAll("о","o");
        lat=lat.replaceAll("ө","o");
        lat=lat.replaceAll("п","p");
        lat=lat.replaceAll("р","r");
        lat=lat.replaceAll("с","s");
        lat=lat.replaceAll("т","t");
        lat=lat.replaceAll("у","u");
        lat=lat.replaceAll("ү","u");
        lat=lat.replaceAll("ф","f");
        lat=lat.replaceAll("х","h");
        lat=lat.replaceAll("ц","ts");
        lat=lat.replaceAll("ч","ch");
        lat=lat.replaceAll("ш","sh");
        lat=lat.replaceAll("щ","sht");
        lat=lat.replaceAll("ы","y");
        lat=lat.replaceAll("ь","'");
        lat=lat.replaceAll("ю","iu");
        lat=lat.replaceAll("я","ia");
        lat=lat.replaceAll("э","e");


        //Capital letters
        lat=lat.replaceAll("А","A");
        lat=lat.replaceAll("Б","B");
        lat=lat.replaceAll("В","V");
        lat=lat.replaceAll("Г","G");
        lat=lat.replaceAll("Д","D");
        lat=lat.replaceAll("Е","JE");
        lat=lat.replaceAll("Ё","JO");
        lat=lat.replaceAll("Ж","ZH");
        lat=lat.replaceAll("З","Z");
        lat=lat.replaceAll("И","I");
        lat=lat.replaceAll("Л","I");
        lat=lat.replaceAll("К","K");
        lat=lat.replaceAll("Л","L");
        lat=lat.replaceAll("М","M");
        lat=lat.replaceAll("Н","N");
        lat=lat.replaceAll("О","O");
        lat=lat.replaceAll("Ө","O");
        lat=lat.replaceAll("П","P");
        lat=lat.replaceAll("Р","R");
        lat=lat.replaceAll("С","S");
        lat=lat.replaceAll("Т","T");
        lat=lat.replaceAll("У","U");
        lat=lat.replaceAll("ү","U");
        lat=lat.replaceAll("Ф","F");
        lat=lat.replaceAll("Х","KH");
        lat=lat.replaceAll("Ц","TS");
        lat=lat.replaceAll("Ч","CH");
        lat=lat.replaceAll("Ш","SH");
        lat=lat.replaceAll("Щ","SHCH");
        lat=lat.replaceAll("Ъ","IE");
        lat=lat.replaceAll("Ы","Y");
        lat=lat.replaceAll("Ь","-");
        lat=lat.replaceAll("Э","E");
        lat=lat.replaceAll("Ю","IU");
        lat=lat.replaceAll("Я","IA");

        return lat;


    }





}
