package Task5;

public class Customer {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Customer(final String name, final String surname,
                    final String phoneNumber, final String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String name() {
        return this.name;
    }

    public String surname() {
        return this.surname;
    }


    public String phoneNumber() {
        return this.phoneNumber;
    }

    public String email() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", phoneNumber='" + this.phoneNumber + '\'' +
                ", email='" + this.email + '\'' +
                '}';
    }
}
