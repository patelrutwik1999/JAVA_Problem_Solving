import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class longestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        int max = 0;
        int len = 0;
        HashSet<Character> subString = new HashSet<>();

        while (i < input.length()){
            if(subString.add(input.charAt(i))){
                i++;
                max = Math.max(max, subString.size());
                System.out.println("up " + subString + " max " + max);
            }else{
                subString.remove(input.charAt(len));
                len++;
                System.out.println("down " + subString);
            }
        }

//        for (int i = 0; i < input.length(); i++) {
//
//        }

        System.out.println(max);

    }
}
