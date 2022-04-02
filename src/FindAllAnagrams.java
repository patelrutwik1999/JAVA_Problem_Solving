import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindAllAnagrams {
    public static boolean compare(HashMap<Character, Integer> smap, HashMap<Character, Integer> pmap){
        for(char ch : smap.keySet()){
            if(smap.get(ch) != pmap.getOrDefault(ch, 0)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();
        String t = scanner.nextLine();

        String one = "";
        for(int i = 0;i<o.length();i++){
            if(o.charAt(i) - 'a' >= 97 && o.charAt(i) - 'a' <= 123){
                one += o.charAt(i);
            }
        }
        String two = "";
        for(int i = 0;i<t.length();i++){
            if((char) t.charAt(i)>= 97 && (char)t.charAt(i) - 'a' <= 123){
                two += t.charAt(i);
            }
        }

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> pmap = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        String s = "";
        for(int i = 0;i<one.length();i++){
            if(one.charAt(i) >= 97 && one.charAt(i) <= 123){
                s += one.charAt(i);
            }
        }
        String p = "";
        for(int i = 0;i<two.length();i++){
            if(two.charAt(i) >= 97 && two.charAt(i) <= 123){
                p += two.charAt(i);
            }
        }



        if(s.length() < p.length()){
            System.out.println(s.length());
            System.out.println(p.length());
            System.out.println(answer);
        }

        for(int i =0;i<p.length();i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i =0;i<p.length();i++){
            pmap.put(p.charAt(i), pmap.getOrDefault(p.charAt(i), 0) + 1);
        }

        int i = p.length();
        int j = 0;

        while(i<s.length()){
            if(compare(smap, pmap) == true){
                answer.add(i-p.length());
            }

            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha, 0)+1);

            char chr = s.charAt(i - p.length());
            if(smap.get(chr) == 1){
                smap.remove(chr);
            }else{
                smap.put(chr, smap.get(chr) - 1);
            }
            i++;
            j++;
        }

        if(compare(smap, pmap) == true){
            answer.add(i-p.length());
        }
    }
}
