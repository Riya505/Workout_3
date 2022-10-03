package p1;
public class Faculty {
    String name;
    int IDno;
    public Faculty(String name,int IDno){
        this.name=name;
        this.IDno=IDno;
    }
    public void display(){
        System.out.println("faculty p1 package");
        System.out.println("Name="+this.name+"\tID NO="+this.IDno);
    }
}
