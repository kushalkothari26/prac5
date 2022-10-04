package ooad;
import java.util.Scanner;
public class practical1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float c=0,d=0,e=0;int f=0;
        System.out.println("enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b=sc.nextInt();
        try{
            c=a+b;
            d=a-b;
            e=a*b;
            f=a/b;
        }
        catch(ArithmeticException A){
            System.out.println("bye");
        }
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
