package superclass;

public class TestPerson {
    public static void main(String[] args) {
        Person P1 = new Person("Priya Gupta", "Delhi");
        System.out.println("PERSON CLASS");
        System.out.println("Name: "+ P1.getName());
        System.out.println("Address: "+ P1.getAdress());

        Staff s1 = new Staff("Shruti Gupta", "Dilshad Garden", "Greenway", 2000);
        System.out.println("STAFF CLASS");
        System.out.println("Name: "+ s1.getName());
        System.out.println("Address: "+  s1.getAdress());
        System.out.println("School: "+ s1.getSchool());
        System.out.println("Pay: "+  s1.getPay());

        Student st1 = new Student("Mayank Gupta", "Rohini", "BCA", 3, 300000);
        System.out.println("STUDENT CLASS");
        System.out.println("Name: "+ st1.getName());
        System.out.println("Address: "+  st1.getAdress());
        System.out.println("Progarm: "+ st1.getProgram());
        System.out.println("Year: "+  st1.getYear());
    
    }
}