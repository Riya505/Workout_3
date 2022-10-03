import p1.Faculty;
import p1.Student;
public class Demo {
    public static void main(String[] args) {
        p1.Faculty x1=new p1.Faculty("Ria",7865);
        p1.Faculty x2=new p1.Faculty("surya",7563);
        p1.Student y1=new p1.Student();
        p1.Student y2=new p1.Student();
        x1.display();
        x2.display();
        y1.display();
        y2.display();
        p2.Faculty f1=new p2.Faculty();
        p2.Faculty f2=new p2.Faculty();
        f1.display();
        f2.display();
        p2.Student st1=new p2.Student("akshay","IT",7995);
        p2.Student st2=new p2.Student("sana","EC",8765);
        st1.display();
        st2.display();
    }
}
