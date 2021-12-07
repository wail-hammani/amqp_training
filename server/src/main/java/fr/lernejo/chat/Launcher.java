package fr.lernejo.chat;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input a message, we will send it for you (q for quit)");
        String S=sc.nextLine();
        while (!(S.equals("q")))
        {
            System.out.println("\n Input a message, we will send it for you (q for quit)");
            S=sc.nextLine();
        }
        System.out.println("Bye");

    }
}
