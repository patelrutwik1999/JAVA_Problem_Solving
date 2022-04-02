import java.util.Scanner;

public class pod6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] dnaValues = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            dnaValues[i] = scanner.nextLine();
        }

        int[] countArr = new int[n];
        int count;
        for (int i = 0; i < dnaValues.length; i++) {
            count = 0;
            for (int k = 0; k < dnaValues.length; k++) {
                for (int j = 0; j < m; j++) {
                    if (dnaValues[i].charAt(j) != dnaValues[k].charAt(j)) {
                        count++;
                    }
                }
            }
            countArr[i] = count;
        }

        int max = 0;
        int min = 10000;
        for (int i = 0; i < countArr.length; i++) {
            max = Math.max(max, countArr[i]);
            min = Math.min(min, countArr[i]);
        }

        Character[] answer = new Character[m];
        char index = 'a';
        if (max == min) {
            for (int i = 0; i < m; i++) {
                int minimum = 200;
                for (int j = 0; j < n; j++) {
                    if (minimum > dnaValues[j].charAt(i) - 'a') {
                        minimum = dnaValues[j].charAt(i) - 'a';
                        index = dnaValues[j].charAt(i);
                    }
                    answer[i] = index;
                }
            }
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i]);
            }
            System.out.println();
        } else {
            for (int i = 0; i < m; i++) {
                int minimum = 200;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (countArr[k] == min) {
                            if (minimum > dnaValues[k].charAt(i) - 'a') {
                                minimum = dnaValues[k].charAt(i) - 'a';
                                index = dnaValues[k].charAt(i);
                            }
                            answer[i] = index;
                        }
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i]);
            }
            System.out.println();
        }

        int len = 0;
        for (int i = 0; i < dnaValues.length; i++) {

            for (int j = 0; j < m; j++) {
                if (dnaValues[i].charAt(j) != answer[j]) {
                    len++;
                }
            }
        }
        System.out.println(len);
    }
}

