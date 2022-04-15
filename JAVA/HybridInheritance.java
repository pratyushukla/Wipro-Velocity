//Code by Pratyush Shukla
class parent2{
    void sing(){
        System.out.println("Classical");
    }
    void draw(){
        System.out.println("Draw a square");
    }
}

class child2 extends parent2{
    void sing(){//overriding sing
        System.out.println("Hip-Hop");
    }
}

class grandchild1 extends child2{
    void sport(){
        System.out.println("Swims");
    }
}

class child3 extends parent2{
    void draw(){
        System.out.println("Draws a circle");
    }
}

public class HybridInheritance {
    public static void main(String args[]){
        grandchild1 ob = new grandchild1();
        ob.sing();
        ob.draw();
        ob.sport();
        child3 ob1 = new child3();
        ob1.sing();
        ob1.draw();
    }
}
