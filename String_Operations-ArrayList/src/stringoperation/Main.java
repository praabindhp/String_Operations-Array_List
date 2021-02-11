package stringoperation;
import java.util.Scanner;
import java.util.ArrayList;
class strOpr {
    private static final ArrayList<String> var = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);
    private static void append() {
        System.out.print("Enter String To Append: ");
        String str = scan.next();
        var.add(str);
        System.out.println("Appended Successfully!!!!!!");
    }
    private static void add() {
        System.out.print("Enter String To Add: ");
        String str = scan.next();
        System.out.print("Enter Index of String: ");
        int i = scan.nextInt();
        var.add(i,str);
        System.out.println("Added Successfully!!!!!!");}
    private static void search() {
        System.out.print("Enter String To Search For: ");
        String str = scan.next();
        int no = var.indexOf(str);
        System.out.println("Found In Index " + no);
    }
    private static void find() {
        System.out.print("Enter First Letter: ");
        String ch = scan.next();
        for(String a : var) {
            if(a.startsWith(ch))
                System.out.println(a);
        }	}
    private static void display() {
        for(String a : var)
            System.out.println(a); 	}
    public static void main(String[] args) {
        int ch;
        try  {
            do {
                System.out.println("\nMAIN MENU\n----------\n1.Append\n2.Add\n3.Search\n4.Find\n5.Display\n6.Exit");
                System.out.print("Enter your choice: ");
                ch = scan.nextInt();
                switch (ch) {
                    case 1 -> append();
                    case 2 -> add();
                    case 3 -> search();
                    case 4 -> find();
                    case 5 -> display();
                    case 6 -> System.exit(0);
                    default -> System.out.println("Invalid Input");
                }
            }while(true);
        }
        catch(Exception e)  {
            System.out.println(e);
        }
    }
}