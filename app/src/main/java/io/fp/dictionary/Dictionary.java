package io.fp.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Dictionary {

    private final Map<String, String> dictionary = new TreeMap<>();

    public Map<String, String> getDictionary() {
        return this.dictionary;
    }

    public void addWordsToDictionary(String english, String german) throws DictionaryException {
        if(dictionary.containsKey(english)) throw new DictionaryException(english + " is not in the dictionary");
        dictionary.putIfAbsent(english, german);
        
    }

    public void removeWordFromDictionary(String english) throws DictionaryException {
        if(!dictionary.containsKey(english)) throw new DictionaryException(english+ " is not in the dictionary");
        dictionary.remove(english);
        
    }

    public String getGermanWord(String english) throws DictionaryException{
        if(!dictionary.containsKey(english)) throw new DictionaryException(english+ " is not in the dictionary");
        return dictionary.get(english);
    }

    public String getEnglishWord(String germanWord) throws DictionaryException{
        if (!dictionary.containsValue(germanWord)) throw new DictionaryException(germanWord+ " is not in the dictionary");
        
        String englishWord = "";
        for (Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(germanWord)) {
                englishWord = entry.getKey();
            }
        }
       return englishWord;
    }

    public String changeTranslation(String englishWord, String germanWord) throws DictionaryException {
        if (!dictionary.containsKey(englishWord)) throw new DictionaryException(englishWord+ " is not in the dictionary"); 
        return dictionary.replace(englishWord, germanWord);
    }

    public Map<String, String> findWordsByLetter(String firstLetter) {
        Map<String, String> searchResults = new HashMap<>();
        for (Entry<String, String> entry : dictionary.entrySet()) {
            if(entry.getKey().startsWith(firstLetter)){
                searchResults.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResults;
    }
 
}