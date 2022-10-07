/* Project #5
 * Source code file: Project4.java
 * Programmer: Tristan Miller
 * Due: 06/02/22
 * Description: 
 * Write a program that provides a way for you to store and retrieve telephone numbers. 
 * This “phone book” will store names and numbers in a binary search tree.      
 */
package adtbinarysearchtree;

import java.util.Scanner;
import java.io.*;

public class Menu {
    static PhoneBook bst = new PhoneBook();
    public static void main (String [] args) {
        File inputDataStream = new File("phoneBookData.txt");
        Scanner input = new Scanner(System.in);
        
        
        int choice;
        
        do {
        System.out.println("Welcome to the Phone Book!");
        System.out.println("1) Add\n2) Delete\n3) Find\n4) Change\n5) Quit");
        
        choice = input.nextInt();
            switch(choice) {
                case 1:
                    try {
                        PrintWriter write = new PrintWriter(inputDataStream);
                        System.out.println("Enter a name: ");
                        String name = input.next() ;
                        System.out.println("Enter a number: ");
                        String number = input.next();
                        add(name, number);
                        
                        write.println(name);
                        write.println(number);
                        write.close();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("Sorry, " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter a name: ");
                    String Name = input.next();
                    delete(Name);
                    System.out.println(Name + " and their number has been deleted.");
                    break;
                case 3:
                    System.out.println("Enter a name: ");
                    String newName = input.next();
                    System.out.println("Number of " + newName + " is : " + find(newName));
                    break;
                case 4:
                    System.out.println("Enter a name: ");
                    String prevName = input.next();
                    delete(prevName);
                    System.out.println("Enter a new name: ");
                    String NewName = input.next();
                    System.out.println("Enter a new number: ");
                    String newNumber = input.next();
                    change(NewName, newNumber);
                    System.out.println("New name and number: " + NewName + " " + newNumber);
                    break;
                case 5:
                    Quit();
                    break;
                default:
                    System.out.println("Please enter a validchoice");
                    break;
            }
        } while(choice != 5);
    }
    
    public static void add(String name, String phoneNum) {
        bst.insert(name, phoneNum);
    }
    public static String find(String name) {
        Person p = bst.search(name);
        return p.getPhone();
    }
    public static void delete(String name) {
        bst.delete(name);
    }
    public static void change(String name, String number) {
        bst.search(name);
        add(name, number);
    }
    public static void Quit () {
        try {
            File outputDataStream = new File("phoneBookData.txt");
            Scanner output = new Scanner(outputDataStream);
            
            bst.inorder();
        }
        catch(FileNotFoundException e) {
            System.out.println("Sorry, " + e.getMessage());
        }
    }
}
