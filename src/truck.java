import java.util.HashMap;
import java.util.Scanner;

public class truck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] parcels = new int[n];
        for(int i =0;i<parcels.length;i++){
            parcels[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        HashMap<Integer, Integer> val = new HashMap<>();
        for(int i : parcels){
            val.put(i, 1);
        }

        int capacity = k;
        int i = 1;
        int sum = 0;
        int currLen = parcels.length;
        while(k!=0){
            if(!(val.containsKey(i))){
                sum += i;
                currLen += 1;
            }
            if(currLen == capacity){
                break;
            }
            k--;
            i++;
        }
        System.out.println(sum);
    }
}
