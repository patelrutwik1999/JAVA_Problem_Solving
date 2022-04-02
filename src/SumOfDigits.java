import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s.trim();
        int k = scanner.nextInt();

        StringBuilder str = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int getNum = s.charAt(i) - 'a';
            String tempStr = Integer.toString(getNum + 1);
            str.append(tempStr);
        }

        int sum = 0;
        while(k>0){
            for(int i = 0;i<str.length();i++){
                sum += Integer.parseInt(Character.toString(str.charAt(i)));
            }

            if(k==1){
                System.out.println(sum);
                break;
            }else{
                str = new StringBuilder();
                str.append(sum);
                sum = 0;
            }
            k--;
        }

    }
}
