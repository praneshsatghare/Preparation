package TrickyQuestions;

//What does the following Java program print?

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
//    }
//}

public class TrickySet1 {

    public static void main(String args[]){
        doubleMinVal();
        integerMinVal();
        floatMinVal();
        DoubleNaN();
        DoubleInfinity();
    }

    public static void doubleMinVal(){
        System.out.println("Double.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(-Double.MAX_VALUE, 0.0d));
        System.out.println(Math.min(Double.MIN_VALUE, Double.MAX_VALUE));
        System.out.println(Math.min(-Double.MIN_VALUE, -Double.MAX_VALUE));
    }

    public static void integerMinVal(){
        System.out.println("Integer.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
    }

    public static void floatMinVal(){
        System.out.println("Float.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
    }

    public static void DoubleNaN(){
        Double a = Double.NaN;
        Double b = 1.0 / 0.0;
        System.out.println("NaN Comparision by == " + (a == Double.NaN));
        System.out.println("NaN Comparision by isNaN " + (a.isNaN()));
    }

    public static void DoubleInfinity(){
        Double b = 1.0 / 0.0;
        System.out.println("Infinity Comparision by == " + (b));
        System.out.println("Infinity Comparision by == " + (b == Double.NEGATIVE_INFINITY));
        System.out.println("Infinity Comparision by == " + (b == Double.POSITIVE_INFINITY));
        System.out.println("Infinity Comparision by == " + (b.isInfinite()));
    }
}
