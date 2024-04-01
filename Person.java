import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person extends EmployeeDetails{
    String name;
    String dob;
    public void displayName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of Person: " + age);
    }
    public static void main(String[] args) {
        Person p =new Person();
        p.name = "Swapna Hiremath";
        p.displayName();
        p.displayAge("10-08-2003");
        p.displaydetails();
       
    }
}