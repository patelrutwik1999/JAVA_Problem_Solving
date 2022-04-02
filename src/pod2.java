import java.util.Scanner;

public class pod2 {
    public static void findMaximum(int[] num){
        int tempMax = num[0];
        int max = tempMax;
        for(int i = 1;i<num.length;i++){
            tempMax = Math.max(num[i] + tempMax, num[i]);
            max = Math.max(tempMax, max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.next().split("\\.");
        //System.out.println(numbers.length);
        int[] num = new int[numbers.length];
        for(int i =0;i<num.length;i++){
            num[i] = Integer.parseInt(numbers[i]);
        }

        findMaximum(num);
    }
}
