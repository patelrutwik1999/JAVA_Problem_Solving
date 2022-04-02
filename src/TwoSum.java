import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++) {
                int temp = nums[i] + nums[j];
                if(temp == target){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
