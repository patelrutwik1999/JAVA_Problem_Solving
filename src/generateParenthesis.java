import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class generateParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        boolean ans = false, ans1 = false, ans2 = false;

        HashMap<Character, Integer> val = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){

            }
        }

        if(val.containsKey('(') && val.containsKey(')')){
            ans = Objects.equals(val.get('('), val.get(')'));
        }else if(val.containsKey('(') || val.containsKey(')')){
            ans = false;
        }else{
            ans = true;
        }

        if(val.containsKey('[') && val.containsKey(']')){
            ans1 = Objects.equals(val.get('['), val.get(']'));
        }else if(val.containsKey('[') || val.containsKey(']')){
            ans1 = false;
        }else{
            ans1 = true;
        }


        if(val.containsKey('{') && val.containsKey('}')){
            ans2 = Objects.equals(val.get('{'), val.get('}'));
        }else if(val.containsKey('{') || val.containsKey('}')){
            ans2 = false;
        }else{
            ans2 = true;
        }

        System.out.println(ans && ans1 && ans2);
    }
}
