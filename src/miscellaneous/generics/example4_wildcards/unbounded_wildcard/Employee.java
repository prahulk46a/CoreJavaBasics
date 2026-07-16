package miscellaneous.generics.example4_wildcards.unbounded_wildcard;

class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee : " + name;
    }
}
