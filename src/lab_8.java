import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class lab_8 {
    public static void recur(int[] val, int index, int target, ArrayList<Integer> a){
        if(target == 0){
            System.out.println(a);
            return;
        }
        if(index >= val.length){
            return;
        }
        a.add(index);
        recur(val, index+1, target-val[index], a);
        a.remove(a.size()-1);
        recur(val, index+1, target, a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();
        int n = scanner.nextInt();
        int[] val = new int[n];
        for(int i = 0;i<val.length;i++){
            val[i] = scanner.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        recur(val, 0, target, ans);
    }
}
