// Данные от пользователя. Математические действия!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        //System.out.print("Введите ваше имя: ");
       // String username = scan.nextLine();
     //   System.out.println("Здарова, " + username + ".");

        //int num1 = scan.nextInt();
        //byte num2 = scan.nextByte();
       // boolean num3 = scan.hasNextBoolean();
       // float num4 = scan.nextFloat();

        //short num1 = 50, num2 =10, res;
       // res = num1 + num2;

        //float num1 = 50, num2 =33;
        //float res = num1 % num2;

        //res += 10;
        //res++; //можна и --

        System.out.println("Результат: " + res);

        System.out.print("Ввыды адно чэсло: ");
        float num1 = scan.nextFloat();

        System.out.print("Ввыды втароэ чэсло: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
