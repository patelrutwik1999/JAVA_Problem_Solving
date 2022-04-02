import java.util.LinkedList;
import java.util.Scanner;

public class Pascal {
    public static void getEncrypted(int[] val){
        int temp = 0;
        int count = 0;
        for(int i =1;i<val.length;i++){
            if(val[i] > 0){
                temp = val[i-1] + val[i];
                if(temp > 9){
                    temp = temp%10;
                }
                //System.out.println(temp);
                val[i-1] = temp;
                if(i == val.length - 1){
                    val[val.length - 1] = -1;
                }
                count++;
                //System.out.println("Count " + count);
            }
        }

        if(count == 2){
            for(int i = 0;i<2;i++){
                System.out.print(val[i]);
            }

        }else{
            getEncrypted(val);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] val = new int[n];


        for(int i =0;i<val.length;i++){
            val[i] = scanner.nextInt();
        }

        getEncrypted(val);

//        for(int i = 0;i<val.length;i++){
//            System.out.println(val[i]);
//            if(val[i] >= 0){
//
//            }
//        }
    }
}
