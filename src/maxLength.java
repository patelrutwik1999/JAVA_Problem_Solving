import java.util.*;

public class maxLength {
    public static List<String> helper(List<String> arr, int index){
        List<String> ans = new ArrayList<>();
        ans.add("");

        if(index == arr.size()){
            return ans;
        }

        // Consider every string as
        // a starting substring and
        // store the generated string
        List<String> temp = helper(arr, index + 1);

        List<String> ret = new ArrayList<>(temp);

        // Add current string to result of
        // other strings and check if
        // characters are unique or not
        for(int i = 0;i<temp.size();i++){
            String test = temp.get(i) + arr.get(index);

            if(check(test)){
                ret.add(test);
            }
        }
        return ret;
    }

    private static boolean check(String test) {
        HashSet<Character> ans = new HashSet<>();

        // Check for repetition in
        // characters
        for(int i = 0;i<test.length();i++){
            if(ans.contains(test.charAt(i))){
                return false;
            }
            ans.add(test.charAt(i));
        }
        return true;
    }

    public static int maxLen(List<String> arr){
        List<String> ans = helper(arr, 0);

        int len = 0;
        for(int i = 0;i<ans.size();i++){
            len = Math.max(len, ans.get(i).length());
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLine());
        }

        System.out.println(maxLen(arr));
    }
}
