public class Main {
    public static void printSquare(int number) {
        int s = number * number;
        System.out.println("Введіть ціле число" + number + " Квадрат числа 5 дорівнює: " + s);
    }
    public static double calculateCylinderVolume(double radius, double height) {
        final double PI = Math.PI;
        double V = PI * radius * radius * height;
        return V;
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printSquare(5);
        double volume = calculateCylinderVolume(3.5, 10.0);
        System.out.println("Volume of the cylinder: " + volume);
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = sumArray(numbers);
        System.out.println("Sum of the array elements: " + sum);
        String reversed = reverseString("hello, world");
        System.out.println("Reversed string: " + reversed);
        int result = power(2, 3);
        System.out.println("Введіть а: " + 2);
        System.out.println("Введіть b: "+ 3);
        System.out.println("Результат 2^3 = " + result + ".");
        printTextNTimes(4, "JAVA програмування");
    }
}