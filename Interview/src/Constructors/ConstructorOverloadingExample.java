package Constructors;

public class ConstructorOverloadingExample {

    long val1;
    float val2;
    ConstructorOverloadingExample(long val1){
        this.val1 = 10;
        this.val2 = 20;
        System.out.println("inside int parameter Constructor");
    }
    ConstructorOverloadingExample(float val2){
        this.val2 = val2;
        val2 = 20;
        System.out.println("inside float parameter Constructor");
    }
    ConstructorOverloadingExample(long val1, float val2){
        this.val1 = val1;
        this.val2 = val2;
        System.out.println("inside long and float parameter Constructor");
    }
    ConstructorOverloadingExample(int val1, float val2){
        this.val1 = val1;
        this.val2 = val2;
        System.out.println("inside int and float parameter Constructor");
    }
    public static void main(String args[]){
        ConstructorOverloadingExample parameterised1 = new ConstructorOverloadingExample(10);
        ConstructorOverloadingExample parameterised2 = new ConstructorOverloadingExample(100, 200);
    }
}
