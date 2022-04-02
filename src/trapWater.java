import java.util.Scanner;

public class trapWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < val.length; i++) {
            val[i] = scanner.nextInt();
        }
        int res = 0;

        int[] leftMax = new int[n];
        leftMax[0] = val[0];
        for (int i = 1; i < val.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], val[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = val[n - 1];
        for (int i = val.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], val[i]);
        }
        for (int k = 0; k < val.length; k++) {
            res += Math.min(leftMax[k], rightMax[k]) - val[k];
        }
        System.out.println(res);
    }
}
