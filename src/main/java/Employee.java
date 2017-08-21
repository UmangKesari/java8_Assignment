
public class Employee {
    String firstName;
    String lastName;
    String email;
    int age;

    public Employee(String firstName, String lastName,
                    String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return this.firstName + " " +this.lastName;
    }
}