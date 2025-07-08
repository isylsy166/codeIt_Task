public class Array8 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        int max = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++){
           int num =  (int)(Math.random() * 10 + 1);
           arr[i] = num;
           System.out.print(arr[i] + " ");
           max = i == 0 ? num : Math.max(max, arr[i]);
           min = i == 0 ? num : Math.min(min, arr[i]);
        }

        System.out.println();
        System.out.printf("최대값: %d \n", max);
        System.out.printf("최소값: %d \n", min);





    }
}
