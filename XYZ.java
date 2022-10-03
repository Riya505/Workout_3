import java.util.*;
class Faculty{
    int facultyid;
    float salary;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;

    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
    }
    float salaryF(){
        float salary1;
        salary1=basic+allowance;
        return salary1;
    }
    void displayF(){
        System.out.println("salary is:"+salaryF());
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;

    PartTimeFaculty(int hour,float rate){
       
        this.hour=hour;
        this.rate=rate;
    }
    float salaryP(){
        
        float salary2;
        salary2=hour*rate;
        return salary2;
    }
    void displayP(){
        System.out.println("salary is:"+salaryP());
    }
}
class XYZ{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic and allowance of faculty 1:");
        FullTimeFaculty f1=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        f1.displayF();
        System.out.println("Enter basic and allowance of faculty 2:");
        FullTimeFaculty f2=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        f2.displayF();
        System.out.println("enter hour and rate of faculty 1:");
        PartTimeFaculty f3=new PartTimeFaculty(sc.nextInt(),sc.nextFloat());
        f3.displayP();
        System.out.println("enter hour and rate of faculty 2:");
        PartTimeFaculty f4=new PartTimeFaculty(sc.nextInt(),sc.nextFloat());
        f4.displayP();

    }
}