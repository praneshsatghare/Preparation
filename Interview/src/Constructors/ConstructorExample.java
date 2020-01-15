package Constructors;

public class ConstructorExample {
int val1;
int val2;
//    1) If we remove NoArg constructor object creation with noArg Construction won't work.
//    2) Default constructor is provided by Default as NoArg construtor but we write Parameterized Constructor
//       and also want call NoArg COnstructor then Default Construtor wont work you have to write NoArg Constructor Explicitly.

//    if we comment NoArg Constructor
//    ConstructorExample noArg = new ConstructorExample(); Code with throw Compiletime
    ConstructorExample(){
        this.val1 = 1;
        this.val2 = 2;
        System.out.println("inside noArg Constructor val1 : " + val1 + " val2 : " + val2);
    }
    ConstructorExample(int val1){
        this.val1 = val1;
        val2 = 2;
        System.out.println("inside parameterised Constructor 1 val1 : " + val1 + " val2 : " + val2);
    }
   // If we are writing Parametrised constructor then to get No-Arg constructor you need to explicitly write it(only in case if you need No-Arg constructor).
    ConstructorExample(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
        System.out.println("inside parameterised Constructor 1 val1 : " + val1 + " val2 : " + val2);
    }

    public static void main(String args[]){
        ConstructorExample noArg = new ConstructorExample();
        ConstructorExample parameterised1 = new ConstructorExample(10);
        ConstructorExample parameterised2 = new ConstructorExample(100, 200);
    }
}
