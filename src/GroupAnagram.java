import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }

        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

        for (String strs : str) {
            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int i = 0; i < strs.length(); i++) {
                fmap.put(strs.charAt(i), fmap.getOrDefault(strs.charAt(i), 0) + 1);
            }

            if(bmap.containsKey(fmap) == false){
                ArrayList<String> list = new ArrayList<>();
                list.add(strs);
                bmap.put(fmap, list);
            }else {
                ArrayList<String> list = bmap.get(fmap);
                list.add(strs);
            }
        }

        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(ArrayList<String> val : bmap.values()){
            res.add(val);
        }
    }
}
