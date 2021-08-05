import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2, result;
        String select, errorMessage;

        System.out.print("Toplama\t: +\nÇıkarma\t: -\nÇarpma\t: *\nBölme\t: /\nYapmak İstediğiniz İşlemin İşaretini Giriniz: ");
        select = input.next();

        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextDouble();

        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextDouble();

        switch (select) {
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case "/":
                if (number2 == 0) {
                    errorMessage = "Bir sayı sıfıra bölünemez!";
                    System.out.println(errorMessage);
                    break;
                } else {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;
                }
            default:
                System.out.println("Hatalı Seçim Yaptınız!!!");
        }
    }
}
