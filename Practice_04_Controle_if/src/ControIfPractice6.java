import java.util.Scanner;

public class ControIfPractice6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int num = sc.nextInt();

        if( num <= 13){
            System.out.println("어린이");
        }
        else if(num <= 19){
            System.out.println("청소년");
        }
        else{
            System.out.println("성인");
        }
    }
}
