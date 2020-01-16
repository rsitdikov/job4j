package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int offset = post.length; offset > 0; offset --){
             if (word[word.length - offset] != post[post.length - offset]){
                 result = false;
                 break;
             }
        }
        return result;
    }
}