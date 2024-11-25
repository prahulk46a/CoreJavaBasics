package OOP.inheritance;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
//        InheritanceBase obj=new InheritanceChild();   here in this no methods of InheritanceChild will available, as reference is of base so only common methods will be allowed to access.
        //when you create a reference of a superclass, the compiler restricts access to only the methods and fields defined in that superclass.
        //This is because the reference type (InheritanceBase) determines what is accessible, not the actual object type (InheritanceChild).
        InheritanceChild obj=new InheritanceChild();
        obj.setName("Rahul");
        obj.setAddress("Pune");
        obj.setPhoneNumber("7709605253");
        obj.setDob(new Date(2002,02,07)); //date 0=>jan  based indexing
        obj.setExamName("10th Boards");
        obj.setExamSeatNumber("D19007135");

        System.out.println(obj);

    }
}
