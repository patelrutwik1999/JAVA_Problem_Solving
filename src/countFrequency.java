import java.util.*;

public class countFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashMap<Character, Integer> alpha = new HashMap<>();

        int maxFreq = 0;
        for (int i = 0; i < input.length(); i++) {
            alpha.put(input.charAt(i), alpha.getOrDefault(input.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, input.charAt(i));
        }

        List<Character>[] charArray = new List[maxFreq + 1];
        for (char ch : alpha.keySet()) {
            int num = alpha.get(ch);
            if (charArray[num] == null) {
                charArray[num] = new ArrayList<>();
            }
            charArray[num].add(ch);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = maxFreq; i >= 0; i--) {
            if (charArray[i] != null) {
                List<Character> list = charArray[i];
                if (list.size() > 1) {
                    list.stream().sorted();
                }
                for(Character ch:list){
                    ans.append(ch);
                }
            }
        }
        System.out.println(ans);

        //Priority Queue Implementation:
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> alpha.get(b) - alpha.get(a));
        maxHeap.addAll(alpha.keySet());

        StringBuilder answer = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            answer.append(current);
        }
        System.out.println(answer.toString().toUpperCase());
    }
}
