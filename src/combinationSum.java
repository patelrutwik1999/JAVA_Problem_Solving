import java.util.*;

public class combinationSum {
    static List<List<Integer>> combSum(ArrayList<Integer> val, int target){
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Set<Integer> s = new HashSet<>(val);
        val.clear();
        val.addAll(s);

        Set<Integer> t = new HashSet<>();
        Collections.sort(val);
        findSum(ans, val, temp, target, 0);
        return ans;
    }

    public static void findSum(List<List<Integer>> ans, ArrayList<Integer> val, ArrayList<Integer> temp, int target, int index){
        if(target == 0){
            Collections.sort(temp);
            if(!(ans.contains(temp))){
                ans.add(new ArrayList<>(temp));
            }
        }

        for(int i = 0;i<val.size();i++){
            if(target - val.get(i) >= 0){
                temp.add(val.get(i));
                findSum(ans, val, temp, target - val.get(i), i);
                temp.remove(val.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> val = new ArrayList<>();
        for (int i = 0;i<n;i++){
            val.add(scanner.nextInt());
        }
        int target = scanner.nextInt();

        List<List<Integer>> ans = combSum(val, target);

        System.out.println(ans);
    }
}
