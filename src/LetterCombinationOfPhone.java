import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetterCombinationOfPhone {
    public static void combinations(String prefix, String digits, int idx, ArrayList<String> res, String[] keys){
        if(idx >= digits.length()){
            res.add(prefix);
            return;
        }

        String letters = keys[Integer.parseInt(Character.toString(digits.charAt(idx)))];
        for(int i = 0;i<letters.length();i++){
            combinations(prefix+letters.charAt(i), digits, idx+1, res, keys);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replaceAll("\"", "");
        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> res = new ArrayList<>();
        String pre = "";
        System.out.println(str.length());
        if(str.length() == 0){
            System.out.println(res);
        }else {


            combinations(pre, str, 0, res, keys);
            System.out.println(res);
        }
    }
}
