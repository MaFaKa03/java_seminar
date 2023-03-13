package java_seminar.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        
        List<Integer> integers = new ArrayList<>(Arrays.asList(3, 11, 5, 1, 5, 1, 2, 4, 5, 5, 1));
        System.out.println(integers);
        removeDublicates(integers);
        System.out.println(integers);
    }

    private static void removeDublicates(List<Integer> source){
        //Integer [] arr = source.toArray(Integer[]::new);
        //StringBuffer str = source.toString();
        //int count = 0;
        for (int i = 0; i < source.size(); i++) {

            for (int j = i+ 1; j < source.size(); j++) {
                if(source.get(i).equals(source.get(j))){
                    source.remove(j);
                    i--;
                }
            }
        
        }
            
    }

    
}
