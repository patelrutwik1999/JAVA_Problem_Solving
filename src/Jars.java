import java.util.Scanner;

public class Jars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] choco = new int[num];
        for(int i =0;i<choco.length;i++){
            choco[i] = scanner.nextInt();
        }

        int max = 0;
        int index = 0;
        for(int i =0;i<choco.length-2;i++){
            int tempMax = Math.max(choco[i+2], choco[choco.length-1]);
            int temp = tempMax + choco[i];
            System.out.println(tempMax);
            if(temp > max){
                if(i<2){
                    max = max + temp;
                }else{
                    max = max + tempMax;
                }

            }

        }

        System.out.println(max);
    }
}
