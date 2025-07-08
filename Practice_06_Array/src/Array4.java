import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        String[] arr = new String[]{"사과", "귤", "복숭아", "참외"};

        for( String s : arr){
            if(s.equals("귤")) System.out.println(s);
        }

    }
}
