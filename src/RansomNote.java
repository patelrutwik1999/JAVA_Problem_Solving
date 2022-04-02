import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RansomNote {
    public static void  setMaps(HashMap<Character, Integer> fmap, String str){
        for(int i =0;i<str.length();i++){
            fmap.put(str.charAt(i), fmap.getOrDefault(str.charAt(i), 0)+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ransomNote = scanner.nextLine();
        String magazine = scanner.nextLine();

        HashMap<Character, Integer> fmap = new HashMap<>();
        HashMap<Character, Integer> bmap = new HashMap<>();

        setMaps(fmap, ransomNote);
        setMaps(bmap, magazine);

        System.out.println(fmap);
        System.out.println(bmap);

        boolean setAns = false;
        for(Character c : fmap.keySet()){
            setAns = bmap.containsKey(c) && fmap.get(c) <= bmap.get(c);
        }
        //System.out.println(count);
        System.out.println(setAns);
    }
}
