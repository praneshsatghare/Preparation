package OopsConcepts.Polymorphism.StaticPolymorphism;

public class TwoMethodsWithDifferentParameter {

    public void m1(int a){
        System.out.println("I am int");
    }
    public void m1(float a){
        System.out.println("I am float");
    }
//    public void m1(long a){
//        System.out.println("I am long");
//    }
    public void m1(double a){
        System.out.println("I am double");
    }

    public void m1(Integer a){
        System.out.println("I am Int");
    }
    public void m1(Float a){
        System.out.println("I am Double");
    }
    public void m1(Long a){
        System.out.println("I am Long");
    }
    public void m1(Double a){
        System.out.println("I am Double");
    }
    public static void main(String args []){
        TwoMethodsWithDifferentParameter t = new TwoMethodsWithDifferentParameter();
        int v = 1234567891;
        t.m1(v);
    }

}
