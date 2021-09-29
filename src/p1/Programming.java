package p1;

import java.util.Scanner;

public class Programming {
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String pro){
        System.out.println("I love"+" "+pro);
    }

}
class Display {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            Programming obj = new Programming();
        } else if (a == 1) {
            String b= scan.next();
            Programming obj = new Programming(b);
        } else
            System.out.println("INVALID Number");
    }
}
