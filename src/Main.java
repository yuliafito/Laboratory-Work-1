import java.util.Scanner;

// Варіант 27
// Визначити N-е число Фібоначчі і перевірити чи Fn < 1.75^n


public class Main {
    /**
     * Основний метод класу Main
     * @param args значення командного рядка
     */
    public static void main(String[] args) {
        int n = Input();
        System.out.println("Sequence of numbers (N = " + n + "):");
        FibonacciNumbers[] arr = CreateFibArr(n);
        System.out.println("\nF" + n + " = " + arr[n-1].getValue());
        if(arr[n-1].CheckExpression(n)){
            System.out.println("Fn < 1.75^n is true");
            System.out.println(arr[n-1].getValue() + " < " + Math.pow(1.75, n));
        }
        else{
            System.out.println("Fn < 1.75^n is false");
            System.out.println(arr[n-1].getValue() + " > " + Math.pow(1.75, n));
        }
    }

    /**
     * Метод введення числа Фібоначчі
     * @return номер числа Фібоначчі
     */
    public static int Input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fibonacci number: ");
        return scan.nextInt();
    }
    /**
     * Метод, який створює масив класу FibonacciNumbers
     * @return масив чисел Фібоначчі
     */
    public static FibonacciNumbers[] CreateFibArr(int n){
        FibonacciNumbers[] arr = new FibonacciNumbers[n];
        arr[0] = new FibonacciNumbers(1);
        arr[1] = new FibonacciNumbers(1);
        System.out.print(arr[0].getValue() + " ");
        System.out.print(arr[1].getValue() + " ");
        for(int i=2; i<n; i++){
            arr[i] = new FibonacciNumbers(arr[i-1].getValue()+arr[i-2].getValue());
            System.out.print(arr[i].getValue() + " ");
        }
        return arr;
    }
}
