import java.util.Scanner;

public class Amazon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] power = new int[n];
        for(int i = 0;i< n;i++){
            power[i] = scanner.nextInt();
        }
        int armor = scanner.nextInt();

        int ans = 0;
        boolean checkArmorUse = false;
        for (int j = 0;j<power.length;j++) {
            if ((power[j] > armor || j == power.length -1) && !checkArmorUse ) {
                ans = (ans + power[j]) - armor;
                checkArmorUse = true;
            }else {
                ans += power[j];
            }
        }
        System.out.println(ans+1);
    }
}
