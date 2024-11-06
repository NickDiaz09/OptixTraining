package Day9;

public class Calculator {
    int previous; 
    int add(int num1, int num2) {
        int sum = num1 + num2;
        previous = sum;
        return sum;
        
    }
    void add(int add) {
        previous += add;
        
    }
    int subtract(int num1, int num2) {
        int subtract = num1 - num2;
        previous = subtract;
        return subtract;
    }
    int divide(int num1, int num2) {
        int divide = num1 / num2;
        previous = divide;
        return divide;
    }
    int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        previous = multiply;
        return multiply;
    }
    int power(int num1, int num2) {
        int power = 1;
        for (int i = 0; i < num2; i++) {
            power *= num1;
            
        }
        previous = power;
        return power;
    }

}
