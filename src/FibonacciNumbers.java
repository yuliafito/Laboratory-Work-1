/**
 * Клас представляє числа Фібоначчі.
 * <p>
 * Це числа, які зазвичай позначаються Fₙ та
 * утворюють послідовність, у якій кожне число є сумою двох попередніх
 *
 * @author Yuliia Fito
 */
public class FibonacciNumbers {

    /** Значення числа Фібоначчі*/
    private int value;

    /**
     * Конструктор створення числа Фібоначчі
     * @param value значення числа Фібоначчі
     */
    public FibonacciNumbers(int value){
        this.value = value;
    }

    /**
     * Метод, що повертає значення числа Фібоначчі
     * @return значення n-го числа Фібоначчі
     */
    public int getValue(){
        return value;
    }

    /**
     * Метод, який перевіряє вираз
     * @param n порядковий номер числа Фібоначчі, який вводить користувач
     * @return true, якщо вираз правильний, false - якщо неправильний
     */
    public boolean CheckExpression(int n) {
        return getValue() < Math.pow(1.75, n);
    }
}
