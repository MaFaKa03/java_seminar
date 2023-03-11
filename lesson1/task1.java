//Дан массив двоичных чисел, например [1,1,0,1,1,1], 
//вывести максимальное количество подряд идущих 1.
public class task1{
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 0, 1, 1, 1};
        int count = 0;
        int best = 0;
        for(int i =0; i < array.length; i++){
            int a = array[i];
            if(a == 1){
                count++;
            }else{
                if(count > best){
                    best = count;
                }
                count =0;
            }
            if(count > best){
                best = count;
            }

        }
        System.out.println(best);
    }
}