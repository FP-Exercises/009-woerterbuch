package io.fp.dictionary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    private Map<String, String> dictionary = new TreeMap<>();

    public void addWordsToDictionary(String english, String german) {
       //Aufgabe a)
    }

    public String removeWordFromDictionary(String english) {
        //Aufgabe b)
        return "nothing to remove";
        
    }

    public String changeTranslation(String englishWord, String germanWord) {
        //Aufgabe c)
        return "found nothing to change"; 
    }

    public String getGermanWord(String english) {
        //Aufgabe d)
        return "no translation found";
    }

    public String getEnglischWord(String germanWord) {
        //Aufgabe d)
        return "no english word found";
    }

 
}