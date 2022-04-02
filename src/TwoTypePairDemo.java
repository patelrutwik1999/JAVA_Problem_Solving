import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoTypePairDemo {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add(new String());

        TwoTypePair<String, Integer> b = new TwoTypePair<>("The car guys", 8);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Our current Rating for " + b.getFirst() + "is " + b.getSecond());

        System.out.println("How would you rate them?");
        int score = scanner.nextInt();
        b.setSecond(score);
        System.out.println("Our current Rating for " + b.getFirst() + "is " + b.getSecond());
    }
}
