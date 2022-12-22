package com.epam.rd.autotasks.meetstrangers;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = Integer.parseInt(scan.nextLine());
        if (counter == 0){
            System.out.println("Oh, it looks like there is no one here");
        } else if (counter<0) {
            System.out.println("Seriously? Why so negative?");
        }else {
            for (int i = 0; i < counter; i++) {
                System.out.printf("Hello, %s\n", scan.nextLine());
            }
        }
    }
}
