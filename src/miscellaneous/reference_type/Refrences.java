package miscellaneous.reference_type;

import java.lang.ref.WeakReference;

public class Refrences {

    public static void main(String[] args) {
        //Strong Reference
        ObjectName objectName = new ObjectName("Demo");
        System.out.println(objectName);

        //Weak Reference
        WeakReference<ObjectName>nameWeakReference=new WeakReference<>(objectName);
        System.out.println(nameWeakReference.get());
    }
}
