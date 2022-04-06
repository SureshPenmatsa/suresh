package init;

class Parent{
    {
        System.out.println("Init of parent");
    }
    int x=100;
    static int s=200;
    Parent (){
        System.out.println("Dc of  parent  const...");
    }
    
    static void show() {
        System.out.println("Show method of Parent");
    }
    
    void display() {
        System.out.println("Display  method of Parent");
    }
    
}

public class Children  extends Parent{
int x=10;
static int s=20;

{
    System.out.println("init of child");
}
Children(){
    
    System.out.println("DC of Child ...");
}
void display() {
    System.out.println("Display  method of Child");
}
static void show() {
    System.out.println("Show method of Child");
}

public static void main(String[] args) {
    
	Children c= new Children();
    System.out.println(c.x);
    System.out.println(c.s);
    c.show();
    c.display();
    

    
}
    
}
