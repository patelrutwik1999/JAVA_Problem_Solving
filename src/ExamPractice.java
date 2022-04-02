import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ExamPractice {
    public static void removeAllLength(ArrayList a, int len){
        String temp;
//        for(int i = 0;i<a.size();i++){
//            temp = (String) a.get(i);
//            if (temp.length() == len){
//                a.remove(i);
//                //i--;
//            }
//        }
        Iterator it = a.iterator();
        while (it.hasNext()){
            temp = (String) it.next();
            if(temp.length() == len){
                it.remove();
            }
        }

        System.out.println(a);
    }
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>(25);
        System.out.println("Size of the list " + val.size());
        for(int i = 0; i<10;i++){
            val.add(3*i);
        }
        val.set(6,44);
        val.set(4,42);
        val.remove(new Integer(99));
        System.out.println("Current size " + val.size());

        for(int i = 0;i<val.size();i++){
            System.out.println(val.get(i) + ", ");
        }

        if(val.contains(57)){
            System.out.println("57 found.");
        }

        System.out.println("44 found at index : " + val.indexOf(44));

        ArrayList<Integer> b = val;

        ArrayList<Integer> c = (ArrayList<Integer>) val.clone();
//
//        for(int i = 0;i<c.size();i++){
//            c.set(i,val.get(i));
//        }
//
        val.set(0,1);
        val.remove(0);
        System.out.println(c);
        System.out.println(val);
        System.out.println(b);

        //Common pitfall:
        String[] arr = {"abc"};
        //ArrayList<String> s = Arrays.asList(arr);
        ArrayList<String> s = new ArrayList<>(Arrays.asList(arr));
        boolean ans = Arrays.asList(arr).contains("abc");
        System.out.println(ans);


        //Illustration for using iterator while travesing arraylist.
        ArrayList a = new ArrayList();
        a.add("hi");
        a.add("ok");
        a.add("the");
        a.add("so");
        a.add("do");

        int len = 2;
        removeAllLength(a, len);
    }
}
