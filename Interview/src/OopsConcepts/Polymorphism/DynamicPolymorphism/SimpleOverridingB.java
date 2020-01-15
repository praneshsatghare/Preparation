package OopsConcepts.Polymorphism.DynamicPolymorphism;

public class SimpleOverridingB extends SimpleOverridingA {
    public void methodA(){
        System.out.println("I am in Class B");
    }

    public static void methodB(){
        System.out.println("I am in Class B - Static");
    }

    public static void main(String args[]){
//        This is Static Binding
        SimpleOverridingA a= new SimpleOverridingA();
        SimpleOverridingB b= new SimpleOverridingB();
        SimpleOverridingA ab= new SimpleOverridingB();
        a.methodA();
        b.methodA();
        ab.methodA();

        SimpleOverridingA.methodB();
        SimpleOverridingB.methodB();

        a.methodB();
        b.methodB();
        ab.methodB();

    }
}
