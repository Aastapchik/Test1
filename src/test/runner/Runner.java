package test.runner;

import test.inoutData.InputData;

public class Runner {

    public static void main(String[] args) {
        String login = InputData.login();
        String password = InputData.password();
        System.out.println(login + " " + password);
    }
}
