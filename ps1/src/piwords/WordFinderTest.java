package piwords;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordFinderTest {
    @Test
    public void basicGetSubstringsTest() {
        String haystack = "abcde";
        String[] needles = {"ab", "abc", "de", "fg"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();
        expectedOutput.put("ab", 0);
        expectedOutput.put("abc", 0);
        expectedOutput.put("de", 3);

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack,
                                                              needles));
    }

    @Test
    public void noHits(){
    	String haystack = "abcde";
        String[] needles = {"az", "at", "t"};
        
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>(); //empty result

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack,
                                                              needles));
    }
    
    @Test
    public void emptyHaystack(){
    	String haystack = "";
        String[] needles = {"az", "at", "t"};
        
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>(); //empty result

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack,
                                                              needles));
    }
    
    @Test
    public void emptyNeedles(){
    	String haystack = "abcdef";
        String[] needles = {};
        
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>(); //empty result

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack,
                                                              needles));
    }
    
    
}
