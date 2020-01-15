package ComparatorAndComparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static  void main(String args[]){
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Abc", 2));
        emp.add(new Employee("Xyz", 3));
        emp.add(new Employee("Pqr", 1));
        System.out.println("Unsorted " + emp);
        Collections.sort(emp);
        System.out.println("Sorted " + emp);
    }
}


class Employee implements Comparable<Employee>{
    String empName;
    Integer empId;

    public Employee(String empName, Integer empId){
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public int compareTo(Employee e){
        return this.empId.compareTo(e.empId);
    }

    @Override
    public String toString(){
        return empName + " : " + empId;
    }
}