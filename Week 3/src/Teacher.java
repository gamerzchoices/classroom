public class Teacher extends Person {

    Teacher(double height) {
        super(height);
    }

    public String subject;
    public double wage;

    public void infoNew() {
        info();
        System.out.println("Suject: " + subject);
        System.out.println("Wage: " + wage);
    }
}
