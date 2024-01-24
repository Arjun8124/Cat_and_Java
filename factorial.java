package Cat_and_Java;
import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of:-");
        int a=read.nextInt();
        long fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of the number is:-"+fact);
    }
}