import java.util.Scanner;

public class CountGoodMeals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] deliciousness = new int[n];

        for (int i = 0; i < deliciousness.length; i++) {
            deliciousness[i] = scanner.nextInt();
        }

//        int count = 0;
//        for (int i = 0; i < deliciousness.length; i++) {
//            for (int j = i + 1; j < deliciousness.length; j++) {
//                int temp = deliciousness[i] + deliciousness[j];
//                System.out.println("Temp " + temp);
//                if (temp == 2) {
//                    count++;
//                } else {
//                    while (temp % 2 == 0 && temp >= 2) {
//                        temp /= 2;
//                    }
//                    //System.out.println("p2 " + temp);
//                    if (temp == 1) {
//                        //System.out.println("in " + temp);
//                        count++;
//                    }
//                }
//
//            }
//        }
//        System.out.println("Count " + count);


        int counter = 0;
        int i =0;
        int j = i+1;
        while(i < n){
            if(j<n){
                int t = deliciousness[i] + deliciousness[j];
                //System.out.println("Temp " + t);
                if (t == 2) {
                    counter++;
                } else {
                    while (t % 2 == 0 && t >= 2) {
                        t /= 2;
                    }
                    //System.out.println("p2 " + temp);
                    if (t == 1) {
                        //System.out.println("in " + temp);
                        counter++;
                    }
                }
                j++;
            }else{
                i++;
                j = i+1;
            }
        }

        System.out.println(counter);
    }

}

