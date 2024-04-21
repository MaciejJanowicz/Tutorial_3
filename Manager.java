import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Goal> goals = new ArrayList<>();
    public Manager(String fname, String lname, String city, String email, String pesel, int dateofbirth) {
        super(fname, lname, city, email, pesel, dateofbirth);
    }
    public void addGoals(Goal g) {
        goals.add(g);
    }
}