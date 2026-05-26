// Example one 
//  class AddNumbers{
//     int a;
//     int b;

//     void add(){
//        int sum = a + b;
//        System.out.println("Sum: " + sum);
//     }
//  }
//  public class Main {
//     public static void main(String[] args){
//         AddNumbers obj = new AddNumbers();
//         obj.a = 10;
//         obj.b = 20;
//         obj.add();

//     }
//  }

// Example two
// class Square{
//    int num;
//    void calculateSquare(){
//       int result = num * num;
//       System.out.println("Square is: " + result);
//    }
// }
// public class Main {
//    public static void main(String[] args){
//       Square s = new Square();
//       s.num = 6;
//       s.calculateSquare();
//    }
// }

// Exammple 3
// class EvenOdd {
//     int number;

//     void check() {
//         if (number % 2 == 0) {
//             System.out.println(number + " is even.");
//         } else {
//             System.out.println(number + " is odd.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         EvenOdd obj = new EvenOdd();
//         obj.number = 15;
//         obj.check();
//     }
// }

// Example 4
// class Largest{
//     int a; 
//     int b;

//     void findLargest(){
//         if(a > b){
//             System.out.println(a + " is the largest number.");
//         } else {
//             System.out.println(b + " is the largest number.");
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args){
//         Largest obj = new Largest();
//         obj.a = 25;
//         obj.b = 30;
//         obj.findLargest();
//     }
// }

// Example 5
class Interest{
    int p; // principal
    int t; // time
    int r; // rate
    void calculate(){
        int si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

public class Main {
    public static void main(String[] args){
        Interest obj = new Interest();
        obj.p = 1000;
        obj.t = 2;
        obj.r = 5;
        obj.calculate();
    }
}