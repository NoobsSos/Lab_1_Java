
public class Task1 {
    public static int calculator(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                    if (num2 == 0) {
                        System.out.println("Error! Dividing by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                    }
                    break;
            default:
                System.out.println("Error! operator is not correct");
                break;
        }
        return result;
    }
}

