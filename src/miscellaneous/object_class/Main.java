package miscellaneous.object_class;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //.toString()
        ObjectClass obj=new ObjectClass("Tata",2002);
        System.out.println(obj);

        //.equals()
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));

        //.hashcode()
        System.out.println(str1.hashCode());

        //.clone() needs to implement clonable interface and throws CloneNotSupportedException
        ObjectClass obj2=(ObjectClass)obj.clone();
        System.out.println(obj2);

        //,getClass()
        System.out.println(obj2.getClass());

    }
}
