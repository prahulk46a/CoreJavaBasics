package OOP.encapsulation;

public class Encapsulation {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Encapsulation(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    // Validation ensures more precise control
    public void setName(String name) {
        if(name != null && name.matches("[A-Za-z ]{2,50}")){
            this.name = name;
        }
        else{
            System.out.println("Invalid name! Name should only contain letters and be 2-50 characters long.");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<18){
            System.err.println("Age must be at least 18 ");
        }
        if(age>120){
            System.err.println("Enter Valid Age");
        }
    }

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Male")
                ||gender.equalsIgnoreCase("Female")
                ||gender.equalsIgnoreCase("Other")) {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender! Please enter Male, Female, or Other.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && address.matches("[A-Za-z0-9,./\\- ]{5,100}")) {
            this.address = address;
        } else {
            System.out.println("Invalid address! Ensure it's between 5-100 characters and contains valid characters.");
        }
    }

    @Override
    public String toString() {
        return "Candidate is [name=" + name + ", age=" + age + ", gender=" + gender+ ", address=" + address + "]";
    }
}
