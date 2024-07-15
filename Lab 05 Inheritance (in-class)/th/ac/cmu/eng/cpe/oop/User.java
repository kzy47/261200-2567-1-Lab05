package th.ac.cmu.eng.cpe.oop;

import java.time.LocalDate;

public class User {

    private String name;
    private LocalDate dob;


    public User(){
        name = null;
        dob = LocalDate.now();
    }

    public User(String name, int year, int month, int dayOfMonth){
        this.name = name;
        this.dob = LocalDate.of(year, month, dayOfMonth);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void doSomething(){
        System.out.println(this.getName()+ " " + this.getDob());
    }

    protected void greet(){
        System.out.println("Hello");
    }
    protected void bye(){
        System.out.println("Good Bye");
    }
}
