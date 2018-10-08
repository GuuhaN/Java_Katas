package org.NCOFTWARE;

import java.util.ArrayList;

public class Kata_MexicanWave {

    public final static void main(String args[]) {
        wave("Hello");
    }

    public static String[] wave(String str) {

        ArrayList<String> stringArrayList = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++){
            StringBuilder rebuildString = new StringBuilder(str.toLowerCase());
            rebuildString.replace(i, i + 1, String.valueOf(str.toUpperCase().charAt(i)));

            if(rebuildString.charAt(i) != ' ')
                stringArrayList.add(rebuildString.toString());
        }
        String[] newStr = new String[stringArrayList.size()];
        return stringArrayList.toArray(newStr);
    }
}
