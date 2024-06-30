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
