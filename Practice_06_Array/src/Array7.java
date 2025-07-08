import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
           int num =  (int)(Math.random() * 10 + 1);
           System.out.print(num + " ");
        }

    }
}
