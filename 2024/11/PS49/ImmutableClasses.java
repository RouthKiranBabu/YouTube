// Immutable Classes: Learn how to design classes that can’t be modified after creation. with outputs
// Step 1: Make the class final
final class ImmutablePerson {
    // Step 2: Make fields private and final
    private final String name;
    private final int age;
    private final Address address;  // Address is a mutable class, we'll handle it specially

    // Step 3: Initialize fields through constructor
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Step 5: Create a defensive copy of mutable fields
        this.address = new Address(address.getCity(), address.getZipCode());
    }

    // Step 4: Provide only getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a copy of the mutable Address object
    public Address getAddress() {
        return new Address(address.getCity(), address.getZipCode());
    }

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}

// Mutable class Address
class Address {
    private String city;
    private int zipCode;

    public Address(String city, int zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', zipCode=" + zipCode + "}";
    }
}

public class test{
    public static void main(String[] args){
        Address address = new Address("New York", 10001);
        ImmutablePerson person = new ImmutablePerson("John Doe", 30, address);

        System.out.println("Initial Person: " + person);
        //Initial Person: ImmutablePerson{name='John Doe', age=30, address=Address{city='New York', zipCode=10001}}

        // Try modifying the original Address object
        address.setCity("Los Angeles");
        System.out.println("After modifying address object: " + person);
        //After modifying address object: ImmutablePerson{name='John Doe', age=30, address=Address{city='New York', zipCode=10001}}

        // Try modifying through the address from the person object
        person.getAddress().setCity("Chicago");
        System.out.println("After modifying through person.getAddress(): " + person);
    }   // After modifying through person.getAddress(): ImmutablePerson{name='John Doe', age=30, address=Address{city='New York', zipCode=10001}}
}