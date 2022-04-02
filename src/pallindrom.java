import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pallindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1  = scanner.nextLine();
        String input = "";

        java.util.StringTokenizer tokenizer = new StringTokenizer(input1.toLowerCase());
        while (tokenizer.hasMoreTokens()){
            input = input + tokenizer.nextToken();
        }


        //System.out.println(input);
        char[] a = new char[input.length()];
        char[] b = new char[input.length()];

        int counter = 0;
        for(int i = 0;i<input.length();i++){
            if ((input.charAt(i) >= 48 && input.charAt(i) <= 57) || (input.charAt(i) >= 97 && input.charAt(i) <= 122)){
                a[counter] = input.charAt(i);
                //System.out.println("2 "+a[i]);
                counter++;
            }
        }

        int length = 0;
        for(int i = input.length()-1;i>=0;i--){
            if ((input.charAt(i) >= 48 && input.charAt(i) <= 57) || (input.charAt(i) >= 97 && input.charAt(i) <= 122)){
                b[length] = input.charAt(i);
                //System.out.println("1 "+b[length]);
                length++;

            }

        }


        int count = 0;
        for(int i = 0; i<a.length;i++){
            System.out.println("Before "+a[i] + " " + b[i]);
            if(a[i] == b[i]){
                count++;
                System.out.println(a[i] + " " + b[i]);
            }
        }

        if(count == input.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
