package test.inoutData;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputData {

    public static String login(){
        System.out.print("Введите логин: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        scanner.close();
        return login;
    }

    public static String password(){
        System.out.print("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        return password;
    }
}
