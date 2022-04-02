import java.util.Scanner;

public class isHappy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        int f = 0;
        if(str.length() == 1){
            f = n*n;
            str = Integer.toString(f);
        }


        while (str.length() > 1) {
            int answer = 0;
            for(int i = 0;i<str.length();i++) {
                int first = Integer.parseInt(Character.toString(str.charAt(i)));
                answer += first * first;
            }
            System.out.println(answer);
            if(answer <= 9){
                int first = n*n;
                str = Integer.toString(first);
            }
            str = Integer.toString(answer);
        }
        if(str.equals("1")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
