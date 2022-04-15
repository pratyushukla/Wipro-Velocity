//Code by Pratyush Shukla
class parent1{
    void sing(){
        System.out.println("Classical");
    }
    void draw(){
        System.out.println("Draw a square");
    }
}

class child1 extends parent1{
    void sing(){//overriding sing
        //super.sing();
        System.out.println("Hip-Hop");
    }
}

class grandchild extends child1{
    void sport(){
        System.out.println("Swims");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]){
        grandchild ob = new grandchild();
        ob.draw();
        ob.sing();
        ob.sport();
    }    
}
