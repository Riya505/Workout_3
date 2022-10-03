package p1;
import java.util.Scanner;
public class Student {
    String name,branch;
    int IdNo;
    Scanner sc=new Scanner(System.in);
    public Student(){
        System.out.println("enter name ");
        this.name=sc.next();
        System.out.println("enter branch");
        this.branch=sc.next();
        System.out.println("enter ID no ");
        this.IdNo=sc.nextInt();
    }
    public void display(){
        System.out.println("Student p1 package");
        System.out.println("Name="+name+"\tbranch="+branch+"\tID no="+IdNo);
    }
}
