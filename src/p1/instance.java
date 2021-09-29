package p1;

public class instance {
    static int c=0;
    {
        c++;
    }
}
class findout{
    public static void main(String[] args) {
        instance obj1= new instance();
        instance  obj2 = new instance();
        instance obj3= new instance();
        System.out.println(instance.c);
    }
}
