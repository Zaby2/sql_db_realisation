package com.digdes.school;

import java.util.Scanner;

public class Main {
    private static String com = "";
    public static void main(String[] args) {

        JavaSchoolStarter jss = new JavaSchoolStarter();
        Scanner sc = new Scanner(System.in);
        while(true) {
            com = sc.nextLine();
            if(com == "EXIT") {
                break;
            }
            jss.execute(com);

        }
    }
}