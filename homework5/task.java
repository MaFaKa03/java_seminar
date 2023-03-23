package java_seminar.homework5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task {
    public static void main(String[] args) {
        /**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");

    }
    static void collectStats(String text) {
        
        Map<Integer, String> stats = new HashMap<>();
        
        String [] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            char[] v = splitText[i].toCharArray();
            Integer k = v.length;
            if(stats.containsKey(k)){
                stats.put(k, stats.get(k) + " " + splitText[i]);
            }else{
                stats.put(k, splitText[i]);
            }
            

        }
        

        
        System.out.println(stats.values());
        
    }
}
