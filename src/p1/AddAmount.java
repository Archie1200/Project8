package p1;

import java.util.Scanner;

public class AddAmount {
    int Amount;
    {
        Amount=50;
    }
    AddAmount() {
        Amount=0;
    }
    AddAmount(int a){
        Amount= Amount + a;
    }
    public void display(){
        System.out.println(Amount);
    }
}
class PiggieBank{
    public static void main(String[] args) {
        AddAmount obj1 = new AddAmount();
        int add;
        Scanner scan = new Scanner(System.in);
        add= scan.nextInt();
        AddAmount obj2= new AddAmount(add);
        obj2.display();
    }
}
