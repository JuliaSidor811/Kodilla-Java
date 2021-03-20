package com.kodilla.stream.reference;

public class FunctionalBeautifer {

    public static String changeCase(String text){

        String result = "";
        char []chars = text.toCharArray();

        for(char c: chars){
           if(Character.isAlphabetic(c)){
               if(Character.isLowerCase(c)){
                   result += Character.toUpperCase(c);
               }else {
                   result += Character.toLowerCase(c);
               }
           }else {
               result += c;
           }
        }
        return result;
    }
    public static String reverse(String text){
        String result = "";
        for(int i = text.length()-1; i >= 0; i--){
            result += text.charAt(i);
        }
        return result;

    }
}
