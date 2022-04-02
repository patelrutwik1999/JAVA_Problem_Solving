import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String s = scanner.nextLine();

        char[] a = pattern.toCharArray();
        String[] b = s.split(" ");

        if(a.length != b.length){
            System.out.println(false);
        }else{
            HashMap<Character, String> fmap = new HashMap<>();
            Set<String> ss = new HashSet<>();
            for(int i = 0;i<a.length;i++){
                char x = a[i];
                String temp = b[i];

                if(fmap.containsKey(x)){
                    if(!Objects.equals(fmap.get(x), temp)){
                        System.out.println(false);
                    }
                }else{
                    if(ss.contains(temp)){
                        System.out.println(false);
                    }
                    fmap.put(x,temp);
                    ss.add(temp);
                }
            }

            System.out.println(true);
        }
    }
}
