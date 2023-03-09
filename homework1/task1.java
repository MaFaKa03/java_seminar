package java_seminar.homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.printf("int year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(isLeapYear(year));


        createArray(5, 1);
        // printArray(arr);
        
        int count = 0;
        int value = 0;
        System.out.printf("int size: ");
        Scanner sz = new Scanner(System.in);
        int size = sz.nextInt();
        // while(count < size){
        //     System.out.printf("int value: ");
        //     count++;
        //     Scanner vl = new Scanner(System.in);
        //     value = vl.nextInt();
        // }

        swapArray(size, value);
        
        arrayAgain(10);
        
        System.out.printf("int column length: ");
        Scanner cl = new Scanner(System.in);
        int column = cl.nextInt();
        System.out.printf("int raw length: ");
        Scanner rw = new Scanner(System.in);
        int raw = rw.nextInt();
        
        
        squareArray(column, raw);
        
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        // int x = array[2][3]; 
        
        
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if((a + b) >= 10 && (a+b) <= 20){
            return true;
        }    
        else{
            return false;
        }    
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if(x < 0){
            return false;
        }
        else {
            return true;
        }
        
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        //Scanner iScanner = new Scanner(System.in);
        //System.out.printf("int a: ");
        //int year = iScanner.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        else return false;
        
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int [len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
            
            System.out.print(array[i] + " ");

                
        
        }
        System.out.println();
        return array;
        

        
        
    }

    private static int[] swapArray(int size, int value){

        int [] arrayNew = new int [size];
        for (int i = 0; i < arrayNew.length; i++) {
            
            System.out.printf("int value: ");
            Scanner vl = new Scanner(System.in);
            value = vl.nextInt();
        
            arrayNew[i] = value;
        }
        
        for (int j = 0; j < arrayNew.length; j++) {
            
        
        System.out.print(arrayNew[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayNew.length; i++) {
            if(arrayNew[i] == 0){
                arrayNew[i] = 1;
            }
            else{
                arrayNew[i] = 0;
            }
        System.out.print(arrayNew[i] + " ");    
        }
        System.out.println();
        return arrayNew;
    }

    private static int[] arrayAgain(int len){

        int arr [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8};
        for (int i = 0; i < len; i++) {
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
    
    private static int [][] squareArray(int column, int raw){

        int [] array[] = new int [column][raw];
        if (raw != column){
            System.out.println("Не проходит по условиям задачи");
            
        }
        else{
            for (int[] line : array) {
                for (int item : line) {

                    System.out.printf("%d ", item);  

                    }
                    System.out.println();
                }
                System.out.println();
            
        
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(i == j){
                    array[i][j] = 1;  
                    }
                    
                    System.out.printf(array[i][j] + " ");
                }
                System.out.println();
            }

            
            
                // System.out.println(array[i][j]); 
            
            //return array;
        }  
        return array;  
    }
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
}
