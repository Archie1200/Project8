package p1;

import java.util.Scanner;

public class bool {
    int arr[];

    bool() {
        arr = new int[]{10, 20, 30, 40, 50};
    }

    public boolean search(int arr[], int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                c += 1;
                break;
            }
            else {
                c = 0;
            }
        }
        if(c == 0)
            return false;
        else
            return true;
    }
}
class OUTPUT{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        bool obj = new bool();
        boolean p=obj.search(obj.arr,n);
        if(p){
            System.out.println(true);
        }
        else{
            System.out.println("Element not found");
        }


    }
}
