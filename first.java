import java.util.*;

public class first{
    public static void main(String[] args){
        System.out.println("hello");
        Scanner ram = new Scanner(System.in);    
        int a = ram.nextInt();
        int b = ram.nextInt();
        // System.out.println(" the number is ");
        // System.out.println(b);
        int sum = a+b;
        char ch = ram.next().charAt(0);
             System.out.println("Your entered character is : " + ch);
        System.out.println(sum);
        ram.close();


}}