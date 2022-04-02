import java.util.*;

public class IsomorphicString {
    public static HashMap<Character, String> check(String s){
        HashMap<Character, String> fmap = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    stringBuilder.append(j);
                }
            }
            fmap.put(s.charAt(i), stringBuilder.toString());
            stringBuilder.replace(0, stringBuilder.length(), "");
        }
        return fmap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();


        if(s.length() != t.length()){
            System.out.println("false");
        }else {
            Map<Character, Character> fmap = new HashMap<>();
            Set<Character> val = new HashSet<>();

            for(int i = 0;i< s.length();i++){
                char x = s.charAt(i);
                char y = t.charAt(i);

                if (fmap.containsKey(x)){
                    if (fmap.get(x) != y){
                        System.out.println(false);
                    }
                }else{
                    if(val.contains(y)){
                        System.out.println(false);
                    }

                    fmap.put(x, y);
                    val.add(y);
                }
            }

            System.out.println(true);
        }
    }
}
