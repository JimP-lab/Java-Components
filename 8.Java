public class HelloWorld {
    public static void main(String[] args) {
        int[] arrayask = new int[10];
        int j;
        int sum = 0;
        for (j = 0; j < 10; j++) {
            arrayask[j] = j;
            sum = sum + arrayask[j];
            System.out.println(arrayask[j]);
        }
        System.out.println(sum);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        int enumerator = 32;
        int denominator = 10;
        double division;
        division = (double) enumerator / denominator;
        System.out.println("Result = " + division);
    }
}



class HelloWorld {
    public static void main(String[] args) {
        int[][] pinax = { {1,2}, {3,4} }; 
        for (int i = 0; i < pinax.length; i++) {
            for (int j = 0; j < pinax[i].length; j++) {
                System.out.print(pinax[i][j] + " ");
            }
            System.out.println();
        }
    }
}
