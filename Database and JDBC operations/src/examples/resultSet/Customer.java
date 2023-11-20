package examples.resultSet;

import java.time.LocalDate;

public class Customer {

    private final String id;
    private final String username;
    private final String email;
    private final String surname;
    private final LocalDate dateOfbirth;
    private final String telephoneNumber;

    public Customer(String id, String username, String email, String surname, String string, LocalDate dateOfbirth, String telephoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.telephoneNumber = telephoneNumber;
    }


    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
