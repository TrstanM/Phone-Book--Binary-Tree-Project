/* Project #5
 * Source code file: Project4.java
 * Programmer: Tristan Miller
 * Due: 06/02/22
 * Description: 
 * Write a program that provides a way for you to store and retrieve telephone numbers. This “phone 
 * book” will store names and numbers in a binary search tree.      
 */
package adtbinarysearchtree;


public class Person {
    private String name;
    private String phoneNo;
    private Person left;
    private Person right;
    
    public Person(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
    public void display() {
        System.out.println(name + " " + phoneNo + " ");
    }
    
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    
    public void setPhone(String newPhone) {
        phoneNo = newPhone;
    }
    public String getPhone() {
        return phoneNo;
    }
    
    public void setRight(Person newRight) {
        right = newRight;
    }
    public Person getRight() {
        return right;
    }
    
    public void setLeft(Person newLeft) {
        left = newLeft;
    }
    public Person getLeft() {
        return left;
    }
}
