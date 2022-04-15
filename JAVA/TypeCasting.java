//Code by Pratyush Shukla
public class TypeCasting{
    public static void main(String args[]){
        float a = 10.0f;
        double b = a;
        System.out.println(a+"\nTypecasted value: \n(explicit typecasting)a="+(int)a+
        "\n(implicit typecasting)b="+b+"\nAssignment Operators:");

        int c= 6;
        c+=c;
        System.out.println(c);
        c*=c;
        System.out.println(c);
        c-=c;
        System.out.println(c);
    }
}