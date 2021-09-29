package p1;

import java.util.Scanner;

public class stu {
    String name;
    int age;
    String add;
    stu(){
        name="unknown";
        age=0;
        add="not available";
    }
    Scanner scan = new Scanner(System.in);
    public void setInfo(String name,int age){
        name=scan.next();
        age=scan.nextInt();
        System.out.println(name+" "+age);
    }
    public void setInfo(String name,int age,String add){
        name=scan.next();
        age= scan.nextInt();
        scan.nextLine();
        add= scan.next();
        scan.nextLine();
        System.out.println(name+" "+age+" "+add);
    }
}
class D{
    public static void main(String[] args) {
        stu obj = new stu();
        for(int i=0;i<3;i++){
            obj.setInfo(obj.name, obj.age, obj.add);
        }
    }
}
