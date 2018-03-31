package com.company;


import java.util.Scanner;

public class Login {

    private Scanner scan;

    private String newusername;
    private String newpassword;
    private String newaddress;
    private String decision;

    void Menu(){
        scan = new Scanner(System.in);
        System.out.println("Please select the sub-menu number: ");
        System.out.println("1- Add a new movie");
        System.out.println("2- Modify a movie");
        System.out.println("3- Delete a movie");
        decision = scan.next();
    }

    void CreateCustomer(){
        scan = new Scanner(System.in);
        System.out.println("Write your username: ");
        newusername = scan.next();
        System.out.println("Write your password: ");
        newpassword = scan.next();
        System.out.println("Write your mail adress: ");
        newaddress = scan.next();
    }

    public static void main(String[] args) {
        String adminusername = "admin";
        String adminpassword = "adminpw";
        String username = "customer";
        String password = "customerpw";

        Scanner scan = new Scanner(System.in);

        System.out.println("Log in:");
        System.out.println("username: ");
        username = scan.next();

        System.out.println("password: ");
        password = scan.next();

        if (adminusername.equals("admin") && adminpassword.equals("adminpw")) {
            System.out.println("Welcome, Admin!");
        }

        if (username.equals("customer") && password.equals("customerpw"))
            System.out.println("Welcome, Admin!");
        {
            System.out.println("You are logged in");
            System.out.println("Welcome the system ");

        }
    }
}
