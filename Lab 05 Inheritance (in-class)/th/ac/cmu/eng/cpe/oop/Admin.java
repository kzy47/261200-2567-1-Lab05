package th.ac.cmu.eng.cpe.oop;

import java.time.LocalDate;

public class Admin extends User{
public Admin(){
    super();
}

    public Admin(String name, int year, int month, int dayOfMonth){
        super(name, year, month, dayOfMonth);
    }

    // public void doSomething(){
    //     System.out.println("Admin " + this.getName() + " " + this.getDob());
    // }

    public void doSomething(){
        //


        
        if (getDob().equals(LocalDate.now())){
            System.out.println("Happy Birthday Admin");
        }else{
            System.out.println("Hello Admin " + this.getName() + "!" + this.getDob());
        }
    }

    public void doSomething(int n){
        for(int i=0; i<n; i++)
        super.doSomething();
    }
}


