import java.util.Arrays;
import java.util.Scanner;

public class pod3 {
    public static void checkForTriangle(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);


        int count = 0;
        for (int i =0;i<a.length;i++){
            if(a[i] == b[i]) {
                count++;
            }
        }

        if(count == 3){
            if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }



        //System.out.println(valIndex + " "+ minIndexTwo);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] triangleOne = new int[3];
        int[] triangleTwo = new int[3];
        for(int i = 0;i<triangleOne.length;i++){
            triangleOne[i] = scanner.nextInt();
        }

        for(int i = 0;i<triangleTwo.length;i++){
            triangleTwo[i] = scanner.nextInt();
        }

        checkForTriangle(triangleOne, triangleTwo);
    }


}
