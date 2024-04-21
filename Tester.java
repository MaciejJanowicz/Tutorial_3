public class Tester extends Employee{
    String testerType;
    public Tester(String fname, String lname, String city, String email, String pesel, int dateofbirth) {
        super(fname, lname, city, email, pesel, dateofbirth);
    }
    public void addTestType(String testerType) {
        this.testerType = testerType;
    }
}