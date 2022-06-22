package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){

        String[] words = sentence.split("[\\W_]+");
        return words;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        String arr[] = sentence.split(" ", 2);
        String firstWord = arr[0];
        String theRest = arr[1];
        return firstWord;

    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        String arr[] = sentence.split(" ", 2);
        String firstWord = arr[0];
        String theRest = arr[1];
        StringBuilder builder = new StringBuilder(firstWord);
        builder.reverse();

        return builder.toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String arr[] = sentence.split(" ", 2);
        String firstWord = arr[0];
        String theRest = arr[1];
        StringBuilder builder = new StringBuilder(firstWord);
        builder.reverse();
        String word = builder.toString();
        char[] worded = word.toCharArray();
        for (int i = 0; i < worded.length; i++) {
            char letter = worded[i];
        }
        return word;

    }

        /**

         }   * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(index);
        String newString = builder.toString();
        return newString;
    }
}
