package io.fp.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Dictionary {

    private Map<String, String> dictionary = new TreeMap<>();

    public void addWordsToDictionary(String english, String german) {
        dictionary.putIfAbsent(english, german);
    }

    public String removeWordFromDictionary(String english) {
        if(!dictionary.containsKey(english)) return "nothing to remove";
        return dictionary.remove(english);
    }

    public String getGermanWord(String english) {
        if(!dictionary.containsKey(english)) return "no translation found";
        return dictionary.get(english);
    }

    public String getEnglischWord(String germanWord) {
        if (!dictionary.containsValue(germanWord)) return "no english word found";
        
        String englishWord = "";
        for (Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(germanWord)) {
                englishWord = entry.getKey();
            }
        }
       return englishWord;
    }

    public String changeTranslation(String englishWord, String germanWord) {
        if (!dictionary.containsKey(englishWord)) return "found nothing to change"; 
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