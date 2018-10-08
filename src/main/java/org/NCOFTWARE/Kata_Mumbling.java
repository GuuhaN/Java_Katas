package org.NCOFTWARE;

public class Kata_Mumbling {

    public final static void main(String args[]){
        System.out.println(accum("jKLoMn"));
    }

    public static String accum(String s) {

        String[] splittedWords = s.split("");
        String partWord = "";
        String finalWord = "";

        for(int i = 0; i < splittedWords.length; i++) {
            partWord += splittedWords[i].toUpperCase();
            for(int k = 0; k < i; k++) {
                partWord += splittedWords[i].toLowerCase();
            }
            if (i < splittedWords.length - 1) {

                partWord += "-";
            }
        }
        finalWord += partWord;
        return finalWord;
    }
}
