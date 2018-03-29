package sample;

/**
 * Created by andriusbaltrunas on 3/29/2018.
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public Student(int id, String name, String surname, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
