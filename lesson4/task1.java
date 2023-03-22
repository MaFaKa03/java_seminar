// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке.
// Если введено exit, завершаем программу
// Пример:
// string~4
// num~3
// print~3
// num
// print~4
// string
// my_value~1
// print~1
// my_value

package java_seminar.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class task1 {

    public static void main(String[] args) {
        ArrayList <String> arrayTask = new ArrayList<>();
        System.out.printf("Enter text~num: ");
        Scanner a = new Scanner(System.in);
        while(true){
            
            String text = a.nextLine();
            if(text.equalsIgnoreCase("exit")){
                break;
            }
            else{

                creatArray(text, arrayTask);
            }
            
        }

        
    }
    public static void creatArray(String text, ArrayList<String> arrayTask){
        String [] wordsNum = text.split("~");
        if(wordsNum.length == 1){
            System.out.println("Try again: ");
        }
        else{
            Integer ind = Integer.parseInt(wordsNum[1]);
            while(arrayTask.size() <= ind){
                arrayTask.add(null);
            }
            if(wordsNum[0].equals("print")){
                System.out.println(arrayTask.get(ind));
                
            }else{
                if(arrayTask.get(ind) == null ){
                    arrayTask.add(ind, wordsNum[0]);
                }    
                else{
                    System.out.println("Position is busy. Try again: ");
                }    
            }

        }

    }
}
