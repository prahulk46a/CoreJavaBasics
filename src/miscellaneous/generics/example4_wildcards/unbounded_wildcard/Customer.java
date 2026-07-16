package miscellaneous.generics.example4_wildcards.unbounded_wildcard;

class Customer {

    private String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer : " + name;
    }
}