import java.util.*;
public class Add {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            sum+=sc.nextInt();
        }
        System.out.println(Math.sqrt(sum));
        for(int i=1;i<10;i++){
            System.out.println("13 x "+i+"="+(13*i));
        }
    }
}
