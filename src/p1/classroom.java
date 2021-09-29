package p1;

import java.util.Scanner;
public class classroom {
    int AC_ON;
    int HOME_THEATRE_ON;
    int FAN_ON;
    int LIGHT_ON;
    int p1, p2, p3, p4;

    classroom() {
        p1 = 1200;
        p2 = 600;
        p3 = 400;
        p4 = 100;
    }

    public void display() {
        int total = 0;
        if (AC_ON==1) {
            total += p1;
            System.out.println("AC is on");
        } else
            System.out.println("AC is off");
        if (HOME_THEATRE_ON==1) {
            total += p2;
            System.out.println("Home Theatre is on");
        } else
            System.out.println("Home Theatre is off");
        if (FAN_ON==1) {
            total += p3;
            System.out.println("Fan is on");
        } else
            System.out.println("Fan is off");
        if (LIGHT_ON==1) {
            total += p4;
            System.out.println("Light is on");
        } else
            System.out.println("Light is off");
        if (total > 2000)
            System.out.println("Overload");
        else
            System.out.println("No Overload");
    }
}
class A{
    public static void main(String[] args) {
        classroom obj = new classroom();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for OFF and 1 for ON for 4 appliances");
        obj.AC_ON=scan.nextInt();
        obj.HOME_THEATRE_ON=scan.nextInt();
        obj.FAN_ON=scan.nextInt();
        obj.LIGHT_ON=scan.nextInt();
        obj.display();
    }
}

