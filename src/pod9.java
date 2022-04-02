import java.util.Scanner;

public class pod9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String test = scanner.nextLine();

        str = str.toLowerCase();
        test = test.toLowerCase();
        if(str.equals(test)){
            System.out.print("0");
        }else {
            int len = 0;
            int count = 0;
            StringBuilder stringBuilder = new StringBuilder();
            //stringBuilder.append(test.charAt(0));
            for(int i = 0;i<test.length();i++){
                //System.out.println("START");
                stringBuilder.append(test.charAt(i));
                //System.out.println(stringBuilder);
                if (str.contains(stringBuilder)){
                    //System.out.println("IN IF");
                    len++;
                }else {
                    //System.out.println("IN ELSE");
                    stringBuilder.delete(0,len);
                    len = 1;
                    count++;
                    //i--;
                }
//                System.out.println("END");
//                System.out.println(i + " "+ len  +" " + stringBuilder);
            }
            System.out.print(count);
        }
    }
}
