import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i =0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }

//        Arrays.sort(nums);
//        List<List<Integer>> val = new ArrayList<>();
//        for(int i = 0;i<nums.length-2;i++){
//            for(int j = i+1;j<nums.length-1;j++){
//                for(int k = j+1;k<nums.length;k++){
//                    //System.out.println(i + " " + j + " "+ k);
//                    if((nums[i] + nums[j] + nums[k]) == 0 && !val.contains(Arrays.asList(nums[i], nums[j], nums[k]))){
//                        System.out.println(i + " " + j + " "+ k);
//                        System.out.println(nums[i] + " " + nums[j] + " "+ nums[k]);
//                        val.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    }
//                }
//            }
//        }
//        System.out.println(val);


        Arrays.sort(nums);
        List<List<Integer>> val = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0 && !val.contains(Arrays.asList(nums[i], nums[left], nums[right]))) {
                    val.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(val);
    }
}
