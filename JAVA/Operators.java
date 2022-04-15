//Code by Pratyush Shukla
import java.util.*;
class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("arithmatic operator:"+(a+b));
        a=11;b=12; // assignment operator
        if(a==b && b>10){
            System.out.println("Logical operator and comparision operator");
        } 
    }
}