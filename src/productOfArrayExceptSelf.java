import java.util.Scanner;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i =0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }


        int mul = 1;
        long count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            }else{
                mul = mul * nums[i];
            }
        }

        System.out.println(mul);
        for(int i = 0;i<nums.length;i++){
            if(count > 1) {
                nums[i] = 0;
            }else if(count == 0){
                nums[i] = mul/nums[i];
            }else if(count == 1 && nums[i] != 0){
                nums[i] = 0;
            }else {
                nums[i] = mul;
            }
        }

        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
