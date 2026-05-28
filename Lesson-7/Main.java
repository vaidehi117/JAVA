
// Linked List --- IGNORE ---
// import java.util.LinkedList;
// import java.util.List;

// public class Main{
//     public static void main(String[] args) {
//         List<String> names = new LinkedList<>();
//         names.add("Vaidehi");
//         names.add("Satyarth");
//         names.add("Priya");
//         names.add("Madhu");
//         System.out.println(names);

//         System.out.println(names.get(2));
//         System.out.println(names.get(1));
//         System.out.println(names.size());
//     }

// }

// Iterate 


// Linked list for queue 
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void main(String[] args) {
//         Queue<String> queue = new LinkedList<>();
        
//         queue.offer("Customer 1");
//         queue.offer("Customer 2");
//         queue.offer("Customer 3");

//         System.out.println(queue.peek()); // trated as first element of the queue
//         System.out.println(queue.poll()); // 
//         System.out.println(queue.peek()); //

//         System.out.println(queue);
//     }
// }

// The use of the vector 
// It is like a class 
// stores in the form of array
// It is a dynamic array
// It is synchronized
// multiple threads can access the vector at the same time without any issues
// It is slower than ArrayList because of synchronization
// It is used in multi-threaded environments where thread safety is a concern
// It is not recommended to use Vector in new code, as ArrayList is generally preferred for better performance and flexibility.

// import java.util.Vector;
// public class Main {
//     public static void main(String[] args) {
//         Vector<String> fruits = new Vector<>();
//         fruits.add("Apple");
//         fruits.add("Mango");
//         fruits.add("Grapes");

//         System.out.println(fruits);
//         System.out.println(fruits.get(1));
    
//     }
// }

//Example 2

// import java.util.Vector;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         Vector<Integer> numbers = new Vector<>();
//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         System.out.println(numbers);

//         System.out.println(numbers.get(0));

//         System.out.println(numbers.get(2));

//         System.out.println(numbers.size());

//         numbers.add(0, 78);
//         System.out.println(numbers);
//     }
// }


