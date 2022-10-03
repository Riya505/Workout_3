package p2;
import java.util.Scanner;
public class Faculty {
    String name;
    int IDno;
    Scanner sc=new Scanner(System.in);
    public Faculty(){
        System.out.println("enter name ");
        this.name=sc.next();
        System.out.println("enter ID ");
        this.IDno=sc.nextInt();
    }
    public void display(){
        System.out.println("faculty");
        System.out.println("Name="+this.name+"\tID NO="+this.IDno);
    }
}