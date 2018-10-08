package org.NCOFTWARE;

public class Kata_ReverseWords {

    public static void main(String args[]){
        System.out.println(substringTest("Hello World"));
    }

    public void testNothing(){

    }

    public static String substringTest(String original){

        String reversedWord = "";
        String[] listWords = original.split("\\s");
        for (int j = 0; j < listWords.length; j++) {

            StringBuilder sb = new StringBuilder();
            char[] reversedCharArray = listWords[j].toCharArray();
            for(int i = reversedCharArray.length - 1; i >= 0; i--)
                sb.append(reversedCharArray[i]);

            reversedWord += sb.toString();
            if(j < listWords.length - 1)
                reversedWord += " ";
        }

        if(listWords.length <= 0)
            return original;

        return reversedWord;
    }

    /* public static String reverseWords(final String original)
    {
        String reversedWord = "";
        String[] listWords = original.split("\\s+");
        String[] reversedList = new String[listWords.length];

        for(int j = 0; j < listWords.length; j++) {

            StringBuilder sb = new StringBuilder();
            char[] reversedCharArray = listWords[j].toCharArray();
            for(int i = reversedCharArray.length - 1; i >= 0; i--)
                sb.append(reversedCharArray[i]);

            reversedWord += sb.toString();
            if(j < listWords.length - 1)
                reversedWord += " ";
        }
        return reversedWord;
    }*/
}
