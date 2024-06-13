/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.dictionary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class DictionaryTest {
    Dictionary dictionary;

    @BeforeEach
    void setUp(){
        dictionary = new Dictionary();
    }

    @Test
    void testAddWordsToDictionary() throws DictionaryException{
        // Works if a) is correct
        // Add to dictionary
        dictionary.addWordsToDictionary("apple", "apfel");
        // Check if dictionary contains the added word
        assertEquals("apfel", dictionary.getDictionary().get("apple"));
    }

    @Test
    void testAddingException() throws DictionaryException {
        // Works if a) is correct
        // Add to dictionary
        dictionary.addWordsToDictionary("apple", "apfel");

        // Test if adding again throws exception
        assertThrows(DictionaryException.class ,() -> dictionary.addWordsToDictionary("apple", "apfel"));

    }

    @Test
    void testRemoveWordFromDictionary() throws DictionaryException{
        // Works if b) is correct
        // Add to dictionary manually
        dictionary.getDictionary().put("apple", "apfel");

        // Remove
        dictionary.removeWordFromDictionary("apple");

        // If removing works, size of dictionary should be 0
        assertEquals(0, dictionary.getDictionary().size());
    }

    @Test
    void testRemovingException() throws DictionaryException {
        // Works if b) is correct
        // Test if removing non-existing word causes an exception
        assertThrows(DictionaryException.class ,() -> dictionary.removeWordFromDictionary("apple"));
    }

    @Test
    void testChangeTranslation() throws DictionaryException {
        // Works if c) is correct
        // Add to dictionary manually
        dictionary.getDictionary().put("apple", "apfel");

        // Change translation
        dictionary.changeTranslation("apple", "apfel2");

        // Compare changed word with manually retrieved value for specified key
        assertEquals("apfel2", dictionary.getDictionary().get("apple"));

    }

    @Test
    void testChangeTranslationException() throws DictionaryException {
        // Works if c) is correct
        // Test if changing non-existing word causes an exception
        assertThrows(DictionaryException.class ,() ->
                dictionary.changeTranslation("apple", "apfel2"));
    }

    @Test
    void testGetGermanWord() throws DictionaryException {
        // Works if d) part 1 is correct
        dictionary.getDictionary().put("apple", "apfel");
        // Check if German word is retrieved correctly
        assertEquals("apfel", dictionary.getGermanWord("apple"));
    }

    @Test
    void testGetGermanWordException() throws DictionaryException {
        // Works if d) part 1 is correct
        // Test if getting a non-existing word throws an exception
        assertThrows(DictionaryException.class ,() -> dictionary.getGermanWord("apple"));
    }

    @Test
    void testGetEnglishWord() throws DictionaryException {
        // Works if d) part 2 is correct
        dictionary.getDictionary().put("apple", "apfel");
        // Check if English word is retrieved correctly
        assertEquals("apple", dictionary.getEnglischWord("apfel"));
    }

    @Test
    void testGetEnglishWordException() throws DictionaryException {
        // Works if d) part 2 is correct
        // Test if getting a non-existing word throws an exception
        assertThrows(DictionaryException.class ,() -> dictionary.getGermanWord("apfel"));
    }

}
