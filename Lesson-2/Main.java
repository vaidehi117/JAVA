
// Example 1

// class Student {
//     String name;
//     int age;
// }

// public class Main {
//     public static void main(String[] args){
//         Student s1 = new Student();

//         s1.name = "Alice";
//         s1.age = 20;
//         System.out.println(s1.name + " " + s1.age);
//     }
// }

// Example 2

// class Student {
//     String name;
//     int age;

//     Student(){
//         name = "Vaidehi";
//         age = 26;
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         Student s1 = new Student();

//         System.out.println(s1.name + " " + s1.age);
//     }
// }

// Example 3
// a parametrized constructor, which initializes object variables when the object is created.
// The Student object s1 receives the values "Alice" and 20 as arguments, which are then displayed using the object's properties. 

// class Student {
//     String name;
//     int age;

//     Student(String n, int a){
//         name = n;
//         age = a;
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         Student s1 = new Student("Alice", 20);

//         System.out.println(s1.name + " " + s1.age);
//     }
// }

// Example 4
// a parameterized constructor to initialize the brand and price of each Car object when it is created.
// The display() method prints the details of each car, demonstrating how multiple objects of the same class can store and display different data.

// class Car {
//     String brand;
//     int price;

//     Car(String b, int p){
//         brand = b;
//         price = p;
//     }
//     void display(){
//         System.out.println(brand + " costs " + price);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car("BMW", 50000);
//         Car c2 = new Car("Audi", 60000);

//         c1.display();
//         c2.display();
//     }
// }

// Example 5
// constructor overloading, where the Employee class has both a default constructor and a parameterized constructor.
// The default constructor assigns predefined values, while the parameterized constructor allows custom values to be provided when creating an object.

// class Employee {
//     String name;
//     int salary;

//     Employee(){
//         name = "Default";
//         salary = 0;
//     }
//     Employee(String n, int s){
//         name = n;
//         salary = s;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         Employee e2 = new Employee("Vaidehi", 50000);

//         System.out.println(e1.name + " earns " + e1.salary);
//         System.out.println(e2.name + " earns " + e2.salary);


//     }
// }

// Example 6

// different classes can have methods with the same name while performing actions specific to their own objects.
// The Dog and Cat classes both contain an eat() method, and each object calls its own version of the method to display different output.

// class Dog {
//     void eat(){
//         System.out.println("Dog is eating");
//     }
// }
// class Cat {
//     void eat(){
//         System.out.println("Cat is eating");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         Cat c = new Cat();

//         d.eat();
//         c.eat();
//     }
// }

// Example 7

// inheritance, where the Cat class extends the Dog class and automatically inherits its methods and properties.
// Since Cat does not define its own eat() method, it can use the eat() method inherited from the Dog class.

// class Dog {
//     void eat(){
//         System.out.println("Dog is eating");
//     }
// }
// class Cat extends Dog {
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//     }
// }