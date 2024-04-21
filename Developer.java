import java.util.ArrayList;

public class Developer extends Employee{
    ArrayList<Technology> technology = new ArrayList<>();
    public Developer(String fname, String lname, String city, String email, String pesel, int dateofbirth) {
        super(fname, lname, city, email, pesel, dateofbirth);
    }
    public void addTechnology(Technology t) {
        technology.add(t);
    }
}