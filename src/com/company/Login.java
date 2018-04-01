package com.company;
import java.util.Scanner;

public class Login {

    MovieClass movie = new MovieClass();

    private Scanner scan;

    private String newusername;
    private String newpassword;
    private String newaddress;
    private String decision;
    private String adminusername = "admin";
    private String adminpassword = "adminpw";
    private String username = "customer";
    private String password = "customerpw";
    private String LoginOrRegister;
    private String customerdecision;
    private String moviedecision;
    private String seatdecision;

    private void Menu(){
        scan = new Scanner(System.in);
        System.out.println("Please select the sub-menu number: ");
        System.out.println("1- Add a new movie");
        System.out.println("2- Modify a movie");
        System.out.println("3- Delete a movie");
        decision = scan.next();
    }

    private void CreateCustomer(){
        scan = new Scanner(System.in);
        System.out.println("Write your username: ");
        newusername = scan.next();
        System.out.println("Write your password: ");
        newpassword = scan.next();
        System.out.println("Write your mail adress: ");
        newaddress = scan.next();
    }

    private void LoginPrompt(){
        scan = new Scanner(System.in);

        System.out.println("Login");
        System.out.println("username: ");
        username = scan.next();

        System.out.println("password: ");
        password = scan.next();

        if (username.equals("admin") && password.equals("adminpw")) {
            System.out.println("Welcome, Admin!");
            System.out.println("You are logged in");
            System.out.println("Welcome the system");
            Menu();
        }

        if (username.equals("customer") && password.equals("customerpw")){
            System.out.println("Welcome, Customer!");
            System.out.println("You are logged in");
            System.out.println("Welcome the system");
            System.out.println("1 to buy New Tickets,\n2 to Show Current Tickets");
            customerdecision = scan.next();
            if (customerdecision.equals("1"))
                movie.MovieDisplay();
            System.out.println("Write your film name:");
            // TODO: Check film name from the database.
            moviedecision = scan.next();
            System.out.println("Write your seat number:");
            // TODO: Check the available seats.
            System.out.println("_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _\n_ _ _ _ _");
            seatdecision = scan.next();
            System.out.println("You are redirecting to the payment page...");

            if (customerdecision.equals("2")) {
                // TODO: Connect to DB and show the tickets.
            }
        }
        else{
            System.out.println("Wrong Login! Please check your login informations!");
            LoginPrompt();
        }
    }

    public static void main(String[] args) {

        Login login = new Login();

        String LoginOrRegister;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to login\nPress 2 to register\nPress 3 to exit");
        LoginOrRegister = scanner.next();
        if (LoginOrRegister.equals("1"))
            login.LoginPrompt();
        if (LoginOrRegister.equals("2")) {
            login.CreateCustomer();
            login.LoginPrompt();
        }
        if (LoginOrRegister.equals("3")) {
            System.exit(0);
        }
    }
}
