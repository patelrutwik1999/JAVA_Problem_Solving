import java.util.*;

public class CombinationalSum {
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> val, int target){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        // first do hashing since hashset does not always
        // sort
        //  removing the duplicates using HashSet and
        // Sorting the arrayList

        //Duplicates are removed here.
        Set<Integer> set = new HashSet<>(val);

        //clearing the val arraylist as the values of arraylist except the duplicates ones can be removed and stored.
        val.clear();
        //All the values of the val arraylist are copied here except the ones that were repeating.
        val.addAll(set);

        Collections.sort(val);
        findNumber(ans, val, target, 0, temp);
        return ans;
    }

    public static void findNumber(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> val, int target, int index, ArrayList<Integer> temp){
        if(target == 0){
            System.out.println(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i<val.size();i++){
            if(target-val.get(i) >= 0){
                System.out.println("Before" + temp);
                temp.add(val.get(i));
                findNumber(ans, val, target - val.get(i), i, temp);
                temp.remove(val.get(i));
                System.out.println("after" + temp);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Target value.
        int n = scanner.nextInt();

        ArrayList<Integer> val = new ArrayList<>();
        for(int i = 1;i<=17;i++){
            val.add(i*i);
        }

        ArrayList<ArrayList<Integer>> ans = combinationSum(val, n);
        int min = 1000;
        for(ArrayList<Integer> a : ans){
            min = Math.min(min, a.size());
        }
        System.out.println(ans.size() + " " + min);
    }
}
