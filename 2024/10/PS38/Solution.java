/*Solution-1
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
// Java
// Python

Solution-2
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        Iterator<Character> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
// A
// B

Solution-3
class employee{
    String Name;
    boolean isExercising;
    Integer age;
    employee(String Name, boolean isExercising, Integer age){
        this.Name = Name;
        this.isExercising = isExercising;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Employee Name: " + this.Name + ", Is Exercising: " + 
        this.isExercising + " Age: " + this.age);
    }
}
public class Test {
    public static void main(String[] args){
        employee firstEmp = new employee("New Name!", true, 23);
        firstEmp.displayInfo(); // Employee Name: New Name!, Is Exercising: true Age: 23
        System.out.print(firstEmp.Name); // New Name!
    }
}
*/