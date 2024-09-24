package superclass;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }
    public void setPRogram(String program){
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return "Student[Person[name="+super.getName()+", address="+super.getAdress()+"], program="+program+", year="+year+", fee="+fee+"]";
    }
}
