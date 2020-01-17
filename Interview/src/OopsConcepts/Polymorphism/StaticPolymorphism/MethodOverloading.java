package OopsConcepts.Polymorphism.StaticPolymorphism;

public class MethodOverloading {

    public static void main(String args[]) {
        MethodOverloading m = new MethodOverloading();
        m.method(10);
        m.method(10f);
        m.method(10, 10.00f);
    }

    public void method(int a){
        System.out.println("int method " + a);
    }

    public void method(float a){
        System.out.println("float method " + a);
    }

    public void method(int a, float b){
        System.out.println("" + a + "" + b);
    }
}
