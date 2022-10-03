package p2;
import java.util.Scanner;
public class Student {
    String name,branch;
    int IdNo;
    Scanner sc=new Scanner(System.in);
    public Student(String name,String branch,int IdNo){
        this.name=name;
        this.branch=branch;
        this.IdNo=IdNo;
    }
    public void display(){
        System.out.println("Student");
        System.out.println("Name="+name+"\tbranch="+branch+"\tID no="+IdNo);
    }
}
