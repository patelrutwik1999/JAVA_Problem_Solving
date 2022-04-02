import java.util.Scanner;

public class FancyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();


        int tempCount = 1;
        char a = s.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        //System.out.println("intial "+ tempCount);
        for(int i = 1;i<s.length();i++){
            char b = s.charAt(i);
            if(a == b){
//                System.out.println("a " +a);
//                System.out.println("b " +b);
//                System.out.println(tempCount);
                tempCount+=1;
                //System.out.println("Temp " + tempCount);
            }else{
                tempCount = 1;
            }
            if(!(tempCount >= 3)) {
                stringBuilder.append(b);
            }
            a=b;
        }
        System.out.println(stringBuilder);
    }
}
