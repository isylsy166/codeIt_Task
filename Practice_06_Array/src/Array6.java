import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for( int i = 0; i < num; i++ ){
            System.out.printf("배열 %d번째 인덱스에 넣을 값: ",i);
            int input = sc.nextInt();
            arr[i] = input;
        }

        int sum = 0;
        for(int n : arr){
            System.out.print(n+" ");
            sum += n;
        }

        System.out.println();
        System.out.printf("총 합: %d \n", sum);

    }
}
