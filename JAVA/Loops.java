public class Loops {
    public static void main(String args[]){
        int i=0,j=0,n=5,s=0;
        while(i<=n){
            j=0;s=i;
            while(s<=n){
                System.out.print(" ");
                s++;
            }
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        n=5;
        for(i=0;i<n;i++){
            for(s=i;s<=n;s++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
