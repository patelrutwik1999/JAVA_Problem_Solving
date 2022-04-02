import java.util.*;
import java.util.function.DoubleToIntFunction;

public class FillTruck {

//[[2,1],[4,4],[3,1],[4,1],[2,4],[3,4],[1,3],[4,3],[5,3],[5,3]]
//        13
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        HashMap<Integer, Integer> boxes = new HashMap<>();
        boxes.put(1,2);
        boxes.put(4,4);
        boxes.put(1,3);
        boxes.put(1,4);
        boxes.put(4,2);
        boxes.put(4,3);boxes.put(3,4);
        boxes.put(3,1);boxes.put(3,5);

        boxes.put(3,5);


        TreeMap<Integer, Integer> sortedBoxes = new TreeMap<>(boxes);
        TreeMap<Integer, Integer> rev = new TreeMap<>(Collections.reverseOrder());
        for (int i : boxes.keySet()){
            rev.put(i, boxes.get(i));
        }
        HashMap<Integer, Integer> sorted = new HashMap<>(rev);

        int sum = 0;
        int mulSum = 0;
        for(int i : rev.keySet()){
            int temp = sorted.get(i);
            //System.out.println("Temp " + temp);
            sum+=temp;
            //System.out.println("Sum " + sum);
            if(sum <= k){
                int p = temp * i;
                mulSum += p;
                //System.out.println("MulSum " + mulSum);
            }else{
                sum -= temp;
                int diff = (k-sum);
                //System.out.println(diff);
                if(diff > 0 && sum <= k){
                    sum += diff;
                    int t = diff * i;
                    //System.out.println("t " + t);
                    mulSum += t;
                    //System.out.println(mulSum);
                }
            }
        }



        System.out.println(mulSum);



        //System.out.println(sortedBoxes);
    }


}
