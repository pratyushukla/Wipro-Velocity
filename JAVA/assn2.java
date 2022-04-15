//Code by Pratyush Shukla
import java.util.*;
public class assn2 {
    int unitcost = 7;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        assn2 ob = new assn2();
        int units = sc.nextInt(); 
        System.out.println("The electricity bill for " +units+ " is : " + units * ob.unitcost);   
    }   
}

