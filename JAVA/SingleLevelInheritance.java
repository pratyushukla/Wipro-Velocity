//Code by Pratyush Shukla
class parent{
    void sing(){
        System.out.println("Classical");
    }
    void draw(){
        System.out.println("Draw a square");
    }
}

class child extends parent{
    void sing(){
        System.out.println("Rock");
    }
}

public class SingleLevelInheritance {
    public static void main(String args[]){
        child ob = new child();
        ob.sing();
        ob.draw();
    }
}
