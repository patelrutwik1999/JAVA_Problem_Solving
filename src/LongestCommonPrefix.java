import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] val = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextLine();
        }

        StringBuilder str = new StringBuilder();
        if (val.length == 0) {
            System.out.println(str.toString());
        }

        int minimumLength = val[0].length();
        for (int i = 1; i < val.length; i++) {
            minimumLength = Math.min(minimumLength, val[i].length());
        }

        for (int i = 0; i < minimumLength; i++) {
            char current = val[0].charAt(i);
            for (String s : val) {
                if (s.charAt(i) != current) {
                    System.out.println(str.toString());
                }
            }
            str.append(current);
        }
        System.out.println(str.toString());
    }

}
