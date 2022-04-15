public class MethodOverloading {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int a=5, b=6, c=8;
        MethodOverloading ob = new MethodOverloading();
        System.out.println(ob.sum(a,b,c)+"\n"+ob.sum(a,b));
    }
}
