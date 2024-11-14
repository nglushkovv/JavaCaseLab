package task1;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Консольный калькулятор");
        System.out.println("Поддерживаемые операции:\n + (сложение)," +
                "\n - (вычитание),\n * (умножение),\n / (деление),\n " +
                ": (целочисленное деление),\n ^ (возведение в степень)," +
                "\n % (остаток от деления)");
        System.out.println("Введите 'exit' для завершения работы.");

        while (true) {
            System.out.print("Введите выражение: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход...");
                break;
            }

            if (isValidExpression(input)) {

                String[] parts = input.split(" ");
                double a = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double b = Double.parseDouble(parts[2]);

                try {
                    double result = calculate(a, b, operator);
                    System.out.println("Результат: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка - " + e.getMessage());
                }
            } else {
                System.out.println("Неверное выражение. Введите еще раз.");
            }
        }

        scanner.close();
    }
    public static boolean isValidExpression(String input) {
        return input.matches("-?\\d+\\s[+\\-*/%^:]\\s-?\\d+");
    }

    public static double calculate(double a, double b, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subtract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                if (b == 0) throw new ArithmeticException("деление на 0");
                return divide(a, b);
            case ":":
                if (b == 0) throw new ArithmeticException("деление на 0");
                return intDivide(a, b);
            case "^":
                return power(a, b);
            case "%":
                if (b == 0) throw new ArithmeticException("деление на 0");
                return mod(a, b);
            default:
                throw new IllegalArgumentException("Некорректный оператор");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double intDivide(double a, double b) {
        return (int) (a / b);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double mod(double a, double b) {
        return a % b;
    }
}
