

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = 10 - i;
            System.out.printf("%d ", arr[i]);
        }


    }
}
