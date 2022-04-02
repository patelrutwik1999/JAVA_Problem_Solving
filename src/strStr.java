import java.util.Scanner;

public class strStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hayStack = scanner.nextLine();
        String needle = scanner.nextLine();

        int len = needle.length();
        if(needle.length() == 0){
            System.out.println("0");
        }else{
            if(hayStack.contains(needle)){
                int index = hayStack.indexOf(needle);
                System.out.println(index);
                int haystacktemp = 0;
                int needlestack = 0;
//                while (len > 0){
//
//                    len--;
//                }
//                int index = hayStack.indexOf(needle.charAt(0));

                //System.out.println(index);
            }else{
                System.out.println("-1");
            }
        }



    }

}
