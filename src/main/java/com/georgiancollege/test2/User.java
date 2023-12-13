import com.google.gson.annotations.SerializedName;
import address.Address; // Import the Address class from the address package

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String birthDate;
    private String university;
    private String image;
    private Address address;

    // Constructor
    public User(int id, String firstName, String lastName, int age, String email, String phone, String birthDate,
                String university, String image, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.university = university;
        this.image = image;
        this.address = address;
    }

    // Get methods for instance variables
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getUniversity() {
        return university;
    }

    public String getImage() {
        return image;
    }

    public Address getAddress() {
        return address;
    }
}
