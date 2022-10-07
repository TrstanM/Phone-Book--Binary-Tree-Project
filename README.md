# Phone-Book--Binary-Tree-Project

Write a program that provides a way for you to store and retrieve telephone numbers.  This “phone 
book” will store names and numbers in a binary search tree.  Design a console program that provides 
the following operations: 

Add: Adds a person’s name and phone number to the phone book. 

Delete: Deletes a given person’s name and phone number from the phone book, given only the name. 

Find: Locates a person’s phone number, given only the person’s name. 

Change: Changes a person’s phone number, given the person’s name and new phone number. 

Quit: Quits the application, after first saving the phone book in a text file. 


You can proceed as follows: 

 Design and implement the class Person, which represents the name and phone number of a
person.  You will store instances of this class in the phone book.

 Design and implement the class PhoneBook, which represents the phone book.  The class should
contain a binary search tree as a data field.  This binary search tree contains the people in the
book and the PhoneBook class should contain all of the methods which “operate” the binary
search tree.

 Add methods to the PhoneBook class that use a text file to save and restore the tree.

 Design and implement the class Menu, which provides the program’s user interface.  This class
contains a main method which displays a menu for the user, declares an object from the
PhoneBook class, then invokes the Add, Delete, Find, Change or Quit methods on that
PhoneBook object, depending on the menu choice the user has made.  For example, if the user
chooses option A to add a name and number to the phone book, the program should prompt
the user for both the name and number, then invoke the add method on the PhoneBook object,
passing the user-entered name and number to the add method.
The program should read data from a text file when it begins and save data into the text file when the 
user quits the program. 
