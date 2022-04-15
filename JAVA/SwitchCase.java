//Code by Pratyush Shukla
import java.util.*;
public class SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press: + or *");
        char ch = sc.nextLine().charAt(0);
        switch(ch){
            case '+':
                System.out.println(1+2);
                break;
            case '*':
                System.out.println(2*3);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
