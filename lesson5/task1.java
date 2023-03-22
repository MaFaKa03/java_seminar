package java_seminar.lesson5;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {

        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
}

/**
* Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
* Изоморфные строки имеют одинаковую длину.
* Примеры:
* (foo, bar) -> false f -> b, o -> a
* (paper, title) -> true p -> t, a -> i, e -> l, r -> e
* (egg, add) -> true e -> a, g -> d
* (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
*/
    static boolean isMatches(String s1, String s2) {
        Map<Character, Character> dict = new HashMap<>();
        char [] char1 = s1.toCharArray();
        char [] char2 = s2.toCharArray();
        if(char1.length != char2.length){
            return false;
        }
        else{
            for (int i = 0; i < char1.length; i++) {
                if(dict.containsKey(char1[i])){
                    Character characterValue =  dict.get(char1[i]);
                    if(characterValue != char2[i]){
                        return false;
                    }
                }
                dict.put(char1[i], char2[i]);
            }
            return true;
        }
        }
}
