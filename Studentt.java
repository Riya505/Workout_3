import java.util.InputMismatchException;
import java.util.Scanner;
interface studentFee{
    Scanner sc=new Scanner(System.in);
    public void getFee() throws InputMismatchException;
}
public class Studentt implements studentFee{
    String name;
    int fee,f=0;
    public void getFee() throws InputMismatchException{
        System.out.println("enter name ");
        this.name=sc.next();
        try{
            System.out.println("enter fee ");
            this.fee=sc.nextInt();
            if(this.fee<0){
                this.f=1;
                throw new InputMismatchException("Fee can't be negative value!!!");
            }
        }
        catch (InputMismatchException e){
            this.f=1;
            System.out.println(e);
        }
    }
    public void display(){
        System.out.println("Name:"+this.name+" Fee:"+this.fee);
    }
    public static void main(String[] args) {
        Studentt s1=new Studentt();
        s1.getFee();
        if (s1.f!=1){
            s1.display();
        }
        else{
            System.out.println("stopped");
        }
    }
}