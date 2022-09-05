public class Student {

    String surname;
    String firstname;
    char middleInitial;
    int dateOfBirth; 
    int studentNumber;
    String studentEmailAddress;
    boolean amIAwesome; 

    public void sayMystudentNumber() {
        System.out.println("My student number is " + studentNumber);
    }

    public void sayMystudentEmailAddress() {
        System.out.println("My student email address is " + studentEmailAddress);
    }

    public void amIAwesome() {
        System.out.println( amIAwesome );
    }
    
}
