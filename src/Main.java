import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Запишите свой пример через пробел");
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(calc(exp));
    }

    static String calc(String exp) throws IOException {
        String[] spltd = exp.split(" ");
        int ans = 0;
        if (spltd.length == 3) {
            int num1 = Integer.parseInt(spltd[0]);
            char op = spltd[1].charAt(0);
            int num2 = Integer.parseInt(spltd[2]);
            if ((num1 > 10 || num1 < 1) || (num2 > 10 || num2 < 1)) {
                throw new IOException("Только числа от 1 до 10 включительно");
            }
            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                default:
                    System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    break;
            }
        } else {
            throw new IOException("Строка не является математической операцией");
        }
        return String.valueOf(ans);
    }
}