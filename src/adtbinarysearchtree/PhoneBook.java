/* Project #5
 * Source code file: Project4.java
 * Programmer: Tristan Miller
 * Due: 06/02/22
 * Description: 
 * Write a program that provides a way for you to store and retrieve telephone numbers. This “phone 
 * book” will store names and numbers in a binary search tree.      
 */
package adtbinarysearchtree;


public class PhoneBook {
    private Person root;
    
    public PhoneBook() {
        root = null;
    }
    public Person search (String key) {
        Person curr = root;
        while (curr.getName().compareTo(key) != 0) {
            if(key.compareTo(curr.getName()) < 0)
                curr = curr.getLeft();
            else
                curr = curr.getRight();
            if(curr == null)
                return null;
            }
        return curr;
    }
    public void insert(String value1, String value2) {
        Person newPerson = new Person(value1, value2);
        
        if(root == null) {
            root = newPerson;
        }
        else {
            Person curr = root;
            Person parent;
            while(true) {
                parent = curr;
                if(value1.compareTo(curr.getName()) < 0) {
                    curr = curr.getLeft();
                    if(curr == null) {
                        parent.setLeft(newPerson);
                        return;
                    }
                }
                else {
                    curr = curr.getRight();
                    if(curr == null) {
                        parent.setRight(newPerson);
                    }
                }
            }
        }
    }
    public void inorder() {
        inorder(root);
    }
    private void inorder(Person localRoot) {
        if(localRoot != null) {
            inorder(localRoot.getLeft());
            System.out.println(localRoot.getName());
            System.out.println(localRoot.getPhone());
            inorder(localRoot.getRight());
        }
    }
    public boolean delete(String key) {
        Person curr = root;
        Person parent = root;
        boolean isLeft = true;
        
        while(curr.getName() != key) {
            parent = curr;
            if(key.compareTo(curr.getName()) < 0) {
                curr = curr.getLeft();
                isLeft = true;
            }
            else {
                curr = curr.getRight();
                isLeft = false;
            }
            if(curr == null) {
                return false;
            }
        }
        if(curr.getLeft() == null && curr.getRight() == null) {
            if(curr == root)
                root = null;
            else if(isLeft)
                parent.setLeft(null);
            else
                parent.setRight(null);
        }
        else if(curr.getRight() == null){
            if(curr == root)
                root = curr.getLeft();
            else if(isLeft)
                parent.setLeft(curr.getLeft());
            else
                parent.setRight(curr.getLeft());
        }
        else if(curr.getLeft() == null){
            if(curr == root)
                root = curr.getRight();
            else if(isLeft)
                parent.setLeft(curr.getRight());
            else
                parent.setRight(curr.getRight());
        }
        else{
            Person succ = getSuccessor(curr);
        
        if(curr == root)
            root = succ;
        else if(isLeft)
            parent.setLeft(succ);
        else
            parent = succ;
        succ.setLeft(curr.getLeft());
        }
        return true;
    }
    public Person getSuccessor(Person delNode) {
        Person succ = delNode;
        Person succParent = delNode;
        Person curr = delNode.getRight();
        while(curr != null){
            succParent = succ;
            succ = curr;
            curr = curr.getLeft();
        }
        if(succ != delNode.getRight()){
            succParent.setLeft(succ.getRight());
            succ.setRight(delNode.getRight());
        }
        return succ;
    }
}
