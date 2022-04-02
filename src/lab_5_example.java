import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class lab_5_example {
    //Before is the first index and after is the last index.
    public static String length(int before, int after, String str, String letter) {
        int count = 0;

        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i < letter.length(); i++) {
            letters.add(letter.charAt(i));
        }
        //System.out.println(letters);
//        Iterator<Character> iterator = letters.iterator() ;
        for (int i = before; i < after; i++) {
            boolean ans = letters.contains(str.charAt(i));
            //System.out.println(ans);
            if (ans) {
                count++;
                int index = letters.indexOf(str.charAt(i));
                letters.remove(index);
            }
//            System.out.println("l " + letters);
        }

        if (count == letter.length()) {
            String answer = "";
            for (int i = before; i < after; i++) {
                answer = answer + str.charAt(i);
            }
//            System.out.println("answer " + answer);
            return answer;
        } else {
            return "NONE";
        }
    }

    public static void checkSubStringLength(String str, String letter) {
        int[] letters = new int[str.length()];
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < letter.length(); j++) {
                if (letter.charAt(j) == str.charAt(i)) {
                    counter++;
                    letters[i]++;
                    break;
                }
            }
        }
//        for(int i =0;i<letters.length;i++){
//            System.out.println(letters[i]);
//        }
        int count = 0;
        int first = 0;
        int beforeLen = 0;
        int afterLen = 0;
        int[] before = new int[counter];
        int[] after = new int[counter];
        for (int i = 0; i < letters.length; i++) {
            //If 1 is encounterd then the index is written in before array.
            if (letters[i] == 1) {
                before[beforeLen] = i;
                beforeLen++;
                count++;
            }

            //Once the length of the letter string is achieved the count which got after increment is being written in after.
            if (count >= letter.length() && letters[i] == 1) {
                after[afterLen] = i+1;
                afterLen++;
            }
        }

        if(before.length == 0){
            System.out.println("");
        }else{
            String[] ans = new String[before.length];
            for (int i = 0; i < before.length; i++) {
                System.out.println(before[i] + " " + after[i]);
                //To check if the after index is not null. That's why (> 0) is being checked.
                if (after[i] > 0) {
                    ans[i] = length(before[i], after[i], str, letter);
//                    System.out.println("a " + ans[i]);
                }
            }

            int index = 0;
            int min = 1000;
            for (int i = 0; i < ans.length; i++) {
                //System.out.println(ans[i]);
                if (ans[i] != "NONE" && ans[i] != null) {
                    //System.out.println(ans[i]);
                    if (ans[i].length() < min && ans[i].length() > 0) {
                        min = ans[i].length();
                        index = i;
                    }
                }
            }
//            System.out.println(ans.length);
//
//            System.out.println(index);
            System.out.println(ans[index]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String letter = scanner.nextLine();

        if(str.equals(letter)){
            System.out.println(str);
        }else if(letter.length() > str.length()){
            System.out.println("");
        }else{
            checkSubStringLength(str, letter);
        }
    }
}
