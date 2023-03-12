// Дано четное число N (>0) и символы c1 и c2. Написать метод,
//  который вернет строку длины N, которая состоит из чередующихся символов c1 и c2,
//   начиная с c1. (6, 'a', 'b') -> "ababab"

package java_seminar.homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.printf(" Enter num: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        System.out.printf("Enter first symbol: ");
        Scanner s1 = new Scanner(System.in);
        String smb1 = s1.nextLine();
        System.out.printf("Enter first symbol: ");
        Scanner s2 = new Scanner(System.in);
        String smb2 = s2.nextLine();

        System.out.println(buildString(num, smb1, smb2));

    }
    static String buildString(int num, String smb1, String smb2){
        StringBuilder result = new StringBuilder("");
        //String result = "";
        if(num > 0 && num % 2 ==0){
            while(result.length() < num ){
                result.append(smb1);
                result.append(smb2);
                //result += smb1 + smb2;
            }
            
        }else{
            System.out.printf("Number is failed");
        }

        return result.toString();
    }
}

