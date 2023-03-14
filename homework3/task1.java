// Урок 3. Коллекции JAVA: Введение
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример:
//  ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//   ["string", "s", "my_value"]

package java_seminar.homework3;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;



public class task1 {

    public static void main(String[] args) {

       System.out.println(removeList(new ArrayList<>(Arrays.asList(2, 4, 3, 5, 7, 7, 8, 9))));
        System.out.println(removeListWitoutInt(new ArrayList<>(Arrays.asList("string", "s", "5",
                                                                             "10", "-12", "my_value"))));
        

    }

    public static ArrayList removeList(ArrayList<Integer> listNums){
        //List<Integer> = 
        for (int i = 0; i < listNums.size(); i++) {
           if(listNums.get(i) % 2 != 0){
            listNums.remove(i);
            i--;
           }
        }
        return listNums;
    }
   
    public static ArrayList removeListWitoutInt(ArrayList <String> listString ) {
        
        

        for (int i = 0; i < listString.size(); i++) {
            try{
            Integer.parseInt((listString.get(i)).trim());
            }
            catch(NumberFormatException e){
                listString.remove(i);
                i--;
            }

            
            


                
            
        }

        return listString;

    }
}
