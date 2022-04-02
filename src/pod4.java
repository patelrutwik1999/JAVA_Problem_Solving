import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pod4 {
    public static void checkPerfectNumber(int abc) {
        int index = 0;
        int sum = 0;
        int len = 0;
        int[] store = new int[abc];
        for (int i = 1; i < abc; i++) {
            if ((abc % i) == 0) {
                sum = sum + i;
                store[len] = i;
                index = len;
                len++;
//                System.out.println("abc % i "+ (i % abc));
                //System.out.println("i "+ i);

            }
        }
        //System.out.println(index);
        String output = "";
        if (sum == abc) {
            output = output + abc + " = ";
            for (int i = 0; i < store.length; i++) {
                if (store[i] != 0) {
                    if (i == index) {
                        //System.out.println("YES");
                        output = output + store[i];
                    } else {
                        output = output + store[i] + " + ";
                    }

                }
            }
        } else {
            output = output + abc + " is NOT perfect.";
        }
        System.out.println(output);
//        System.out.println("SUM " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        StringBuilder a = new StringBuilder();
//        while (n != -1) {
//            a.append(n).append(",");
//            n = scanner.nextInt();
//        }
//        String[] abc = a.toString().split(",");
//        for (String s : abc) {
//            checkPerfectNumber(Integer.parseInt(s));
//        }

        List<Integer> abc = new ArrayList<>();
        while (n != -1) {
            abc.add(n);
            n = scanner.nextInt();
        }
        for (int i: abc) {
            checkPerfectNumber(i);
        }
    }
}
