// vector Example 

// import java.util.Vector;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<String> names = new Vector<>();

//         names.add("Alice");
//         names.add("Bob");
//         names.add("Charlie");

//         System.out.println(names);

//         System.out.println(names.get(1));
//         System.out.println(names.size());
//     }
// }

//Iterator vector example

// import java.util.Vector;
// import java.util.Iterator;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<String> courses = new Vector<>();
//         courses.add("Java");
//         courses.add("Spring boot");
//         courses.add("Microservices");

//         for (int i = 0; i < courses.size(); i++) {
//             System.out.println(courses.get(i));
    
//         }
//         // Using enhanced for loop
//         for (String course : courses) {
//             System.out.println(course);
//         }
//         // Using iterator
//         Iterator<String> iterator = courses.iterator();
//         while (iterator.hasNext()) {
//             String course = iterator.next();
//             System.out.println(course);
//     }
// }
// }

// How we can use vector in custome Object

// import java.util.Vector;
// import java.util.List;

// class Employee {
//     int id;
//     String name;

//     Employee(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public String toString() {
//         return id + "-" + name;
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         List<Employee> employees = new Vector<>();

//         employees.add(new Employee(1, "Shubham"));
//         employees.add(new Employee(2, "Vaidehi"));
//         employees.add(new Employee(3, "Charlie"));

//         for (Employee employee : employees) {
//             System.out.println(employee);
//         }
//     }
// }

// Difference between vector and Stack 
// Stack is a subclass of Vector, which means that Stack inherits all the properties and methods of Vector. However, Stack is designed to be used as a last-in-first-out (LIFO) data structure, while Vector is a more general-purpose dynamic array.
// Stack provides additional methods such as add(), pop(), and peek() that are specific to the LIFO behavior, while Vector does not have these methods. Additionally, Stack is synchronized, which means that it is thread-safe, while Vector is not synchronized by default.
// In summary, while Stack is a specialized version of Vector that is designed for LIFO behavior and thread safety, Vector is a more general-purpose dynamic array that can be used in a wider range of applications.

import java.util.Stack;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        vector.add("Java");
        vector.add("Spring Boot");
        vector.add("Microservices");

        System.out.println("Vector Elements: " + vector);
        System.out.println("Vector First Element: " + vector.get(0));

        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Spring Boot");
        stack.push("Microservices");

        System.out.println("Stack Elements: " + stack);
        System.out.println("Stack Top Element: " + stack.peek());
        System.out.println("Removed Element: " + stack.pop());

        System.out.println("Stack Elements After Pop: " + stack);
    }
}
