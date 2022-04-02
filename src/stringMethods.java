import java.util.StringTokenizer;

public class stringMethods {
    public static void main(String[] args) {
        String one = "abcdefghijklmnopqrstuvwxyz hi";
        StringTokenizer stringTokenizer = new StringTokenizer(one);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
