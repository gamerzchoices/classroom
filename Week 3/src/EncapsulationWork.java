import java.util.ArrayList;

public class EncapsulationWork {

    public static void main(String[] args) {

        Player p1 = new Player();

        ArrayList<String> skills = new ArrayList<String>();

        skills.add("Shooter");
        skills.add("Tackler");
        skills.add("Pacer");
        skills.add("Dribbler");

        p1.setName("Leonel Messi");
        p1.setAge(35);
        p1.setHeight(163);
        p1.setWeight(70);
        p1.setSalary(80000000);
        p1.setSkills(skills);

        System.out.println("Name of player: " + p1.getName());
        System.out.println("Age of player: " + p1.getAge());
        System.out.println("Height of player: " + p1.getHeight());
        System.out.println("Weight of player: " + p1.getWeight());
        System.out.println("Salary of player: " + p1.getSalary());

        for (String skill : p1.getSkills()) {
            System.out.println("Skill of player: " + skill);
        }

    }
}