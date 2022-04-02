import java.util.Scanner;

public class pod7a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        while (a != b){
            if(a % 2 == 0 && a>b){
                a /=2;
            }else {
                a+=1;
            }
            count++;
        }
        System.out.print(count);

    }
}
