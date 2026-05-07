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
class EvenOdd {
    int number;

    void check() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.number = 15;
        obj.check();
    }
}