public class GenericsExample {
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //Creating an array of Integer, Double and Character type
        Integer[] i = new Integer[]{1,2,3,4,5,6,7};
        Double[] d = new Double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] c = new Character[]{'a','b','c','d','e','f','g'};

        System.out.println("integer array ");
        printArray(i);
        System.out.println("Double array ");
        printArray(d);
        System.out.println("Character array ");
        printArray(c);



    }
}
