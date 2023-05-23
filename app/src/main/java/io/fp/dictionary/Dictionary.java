package io.fp.dictionary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    private Map<String, String> dictionary = new TreeMap<>();

    public void addWordsToDictionary(String english, String german) throws DictionaryException {
       //Aufgabe a)
    }

    public void removeWordFromDictionary(String english) throws DictionaryException{
        //Aufgabe b)
    }

    public void changeTranslation(String englishWord, String germanWord) throws DictionaryException{
        //Aufgabe c)
    }

    public String getGermanWord(String english) throws DictionaryException{
        //Aufgabe d)
        return null;
    }

    public String getEnglischWord(String germanWord) throws DictionaryException{
        //Aufgabe d)
        return null;
    }

 
}