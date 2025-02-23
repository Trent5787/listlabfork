package edu.grinnell.csc207.listlab;

/**
 * The driver for our lab on lists.
 */
public class ListLab {
    /**
     * The main entry point for the program.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        
        ArrayList newArr = new ArrayList();
        
        newArr.add(1);
        newArr.add(2);
        
        System.out.println(newArr.get(0));
        System.out.println(newArr.get(1));
        
        System.out.println(newArr.size());
        
        newArr.remove(1);
        
        System.out.println(newArr.get(0));
        System.out.println(newArr.get(1));
        
        
        
        LinkedList LL = new LinkedList();
        
        LL.add(1);
        LL.add(2);
        
        System.out.println(LL.get(0));
        System.out.println(LL.get(1));
        
        System.out.println(LL.size());
        
        LL.remove(1);
        
        System.out.println(LL.get(0));
    }
}
