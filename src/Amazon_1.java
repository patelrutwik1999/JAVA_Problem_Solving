import java.util.Scanner;

public class Amazon_1 {
    public static int[] getEncrypted(int[] nums){
        int temp = 0;
        int number = 0;
        int len = 0;
        int[] store = new int[nums.length];
        String s = "";
        for(int i =1;i<nums.length;i++){
            temp = nums[i-1] + nums[i];
            if(Integer.toString(temp).length() > 1){
                s = s + (Integer.toString(temp).charAt(0));
                number = Integer.parseInt(s);
                store[len] = number;
                len++;
            }else{
                store[len] = temp;
                len++;
            }
        }

//        if(len == 1){
//            return
//        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }



        nums = getEncrypted(nums);

    }

}
