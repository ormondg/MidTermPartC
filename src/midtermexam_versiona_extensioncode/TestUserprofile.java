/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Graham
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner variable
        String userInput1, userInput2;
        System.out.println("Welcome to the user profile creator");
        System.out.println("Please enter your name");
        userInput1 = input.nextLine();
        System.out.println("Please enter your favourite genre");
        System.out.println("Comedy/Drama/Action/Mystery");
        userInput2 = input.nextLine();
        UserProfile user = new UserProfile(userInput1, userInput2);
        System.out.println("Profile Created");
        
    }
}

