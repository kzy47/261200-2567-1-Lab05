package th.ac.cmu.eng.cpe.oop;


public class Main {
    public static void main(String[] args){
        User user1 = new User();
        user1.doSomething();
        User user2 = new User("Jude", 1111, 1, 1);
        user2.doSomething();

        Admin admin2 = new Admin("Gareth", 1111, 1 ,1);
        admin2.doSomething();


        Admin admin1 = new Admin();
        admin1.setName("Peter");
        admin1.doSomething();
    }


    
}
