import java.util.*;

public class pod8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] barbell = new int[n];
        for (int i = 0; i < barbell.length; i++) {
            barbell[i] = scanner.nextInt();
        }

        int[] plates = new int[m];
        for (int i = 0; i < plates.length; i++) {
            plates[i] = scanner.nextInt();
        }

        //Creating a frequency map of integers in plates array.
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int plate : plates) {
            count.put(plate, count.getOrDefault(plate, 0) + 1);
        }


        //Sorting array.
        Arrays.sort(plates);
        int len = 0;
        for (int i = 1; i < plates.length; i++) {
            len += plates.length - i;
        }
        // System.out.println(len);
        Set<Integer> ans = new HashSet<>();
        int[] start = new int[len];
        int[] end = new int[len];
        int[] result = new int[len];
        int index = 0;
        for (int i = 0; i < plates.length - 1; i++) {
            //System.out.println("Elements " + plates[i]);
            for (int j = i + 1; j < plates.length; j++) {
                //  System.out.println("Elements j " + plates[j]);

                int temp = plates[i] + plates[j];
                start[index] = i;
                result[index] = temp;
                end[index] = j;
                index++;
            }
        }

        //If any value in the plate array and the result is same then the final result is added to the set.
        for (int i : barbell) {
            for (int plate : plates) {
                //System.out.println(plate);
                for (int value : result) {
                    if (plate == value) {
                        int res = i + plate + value;
                        ans.add(res);
                    }
                }
            }
        }

        //Here we checked the frequency map that if any element combinely form sum of any value that is present in the result array.
        //For eg: 5 + 5 = 10 from the plate array and 4 + 6 = 10 from the result array share same result but different index.
        int temp = 0;
        for (int k = 0; k < barbell.length; k++) {
            ans.add(barbell[k]);
            for (int i = 0; i < plates.length; i++) {
                if (count.get(plates[i]) > 1) {
                    int tar = count.get(plates[i]);
                    temp = 0;
                    while (tar >= 1) {
                        temp += plates[i];
                        tar--;
                    }
                    //System.out.println("Temp " + temp);
                    for (int j = 0; j < result.length; j++) {
                        if (temp == result[j] && start[j] != i && end[j] != i) {
                            //System.out.println("result "+ result[j]);
                            int res = result[j] + temp + barbell[k];
                            //System.out.println("Res " + res);
                            ans.add(res);
                            break;
                        }
                    }
                }
            }
        }

        //For elements that are repeated in the plate array. iF missed any then it will be added here.
        for (int k = 0; k < barbell.length; k++) {
            for (int i = 0; i < plates.length; i++) {
                for (int j = i + 1; j < plates.length; j++) {
                    if (plates[i] == plates[j]) {
                        int res = barbell[k] + plates[i] + plates[j];
                        ans.add(res);
                    }
                }
            }
        }

        //Finally converting the set into the array so that I can sort the values for  display.
        int[] answer = new int[ans.size()];
        int arrIndex = 0;
        for (int i : ans) {
            answer[arrIndex] = i;
            arrIndex++;
        }

        Arrays.sort(answer);
        //Printing the resultant answer.
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
