import java.util.*;

public class pod5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        String[] sentences = new String[numberOfLines];
        scanner.nextLine();
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = scanner.nextLine();
        }
        HashMap<String, ArrayList<String>> languages = new HashMap<>();

        for (int i = 0; i < sentences.length; i++) {
            String[] text = sentences[i].split("[\\s,!;\\.\\?\\)\\( ]+");
            ArrayList<String> words = new ArrayList<>();
            for (int j = 1; j < text.length; j++) {
                words.add(text[j].toLowerCase());
            }
            languages.put(text[0], words);
        }

        //System.out.println(languages);
        scanner.nextLine();
        String test;
        while (scanner.hasNextLine() && !(test = scanner.nextLine()).equals("")) {
            ArrayList<String> input = new ArrayList<>(Arrays.asList(test.split("[\\s,!;\\.\\?\\)\\( ]+" )));
            //System.out.println(input);
            for (String t : test.split("[\\s,!\\.;\\?\\)\\( ]+" )) {
                boolean flag = false;
                for (String key : languages.keySet()) {
                    input.retainAll(languages.get(key));
                    if (languages.get(key).contains(t.toLowerCase())) {
                        System.out.println(key);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
    }
}

