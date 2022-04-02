import java.util.Scanner;

public class brokenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startValue = scanner.nextInt();
        int target = scanner.nextInt();

        int ans = 0;
        while (startValue<target){
            ans++;
            if(target%2>0){
                target++;
            }else {
                target/=2;
            }
        }

        System.out.println(startValue - target + ans);
    }
}
