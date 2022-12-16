import java.util.HashMap;

public class Translator {
    HashMap<Integer,String> numericAplha = new HashMap<> ();

    //maak constructor, is soort van methode
    public Translator (String[] alphabetic, Integer[] numeric){
        for(int i= 0; i < numeric.length; i++){
            numericAplha.put(numeric[i],alphabetic [i]);
        }
    }

    public String translate (Integer number){
        return numericAplha.get(number);

    }
}
