import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.next();

        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);

        int count = 0;

        System.out.printf("%s에 %c가 존재하는 위치(인덱스): ", str, ch);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("i 개수: %d\n", count);

    }
}
