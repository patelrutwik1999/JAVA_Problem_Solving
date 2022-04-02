import java.util.HashMap;
import java.util.Scanner;

public class KAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int k = scanner.nextInt();

        HashMap<Character, Integer> smap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            smap.put(a.charAt(i), smap.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (smap.getOrDefault(ch, 0) > 0) {
                smap.put(a.charAt(i), smap.get(ch) - 1);
            }
        }

        int count = 0;
        for(char ch : smap.keySet()){
            count += smap.get(ch);
        }

        if(count > k){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
