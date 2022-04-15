//Code by Pratyush Shukla
class calc{
    void area(int r){
        System.out.println("Circle: "+3.14*Math.pow(r,2));
    }
    void area(int l, int b){
        System.out.println("Rectangle: "+l*b);
    }

    void area(double s){
        System.out.println("Rectangle: "+s*s);
    }
}

public class polymorphism {
    public static void main(String args[]){
        calc ob = new calc();
        ob.area(5);
        ob.area(10,5);
        ob.area(10);
    }
}
