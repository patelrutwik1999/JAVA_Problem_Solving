import java.util.*;

public class combination2 {
    public static List<List<Integer>> combSum2(List<Integer> val, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Collections.sort(val);

        uniqueCombination(ans, temp, val, target, 0, 0);
        return ans;
    }

    public static void uniqueCombination(List<List<Integer>> ans, List<Integer> temp, List<Integer> val, int target, int index, int sum) {
        if (target == sum) {
            ans.add(new ArrayList<>(temp));
            System.out.println(temp);
        }

        for (int i = index; i < val.size(); i++) {
            if (sum + val.get(i) > target) {
                continue;
            }

            if (i > index && val.get(i) == val.get(i - 1)) {
                System.out.println("hi " + temp);
                continue;
            }
            System.out.println(temp);
            temp.add(val.get(i));
            uniqueCombination(ans, temp, val, target, i + 1, sum + val.get(i));
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }
        int target = scanner.nextInt();

        List<List<Integer>> ans = combSum2(values, target);

        System.out.println(ans);
    }
}
