package smallJavaProject;

public class Email {
    private String firstName;
     private String lastName;
    private String  password;
    private String department;
    private int mailboxcapcity;
    private String AlternateEmail;
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("CreatedEmail"+  this.firstName+this.lastName);
    }
}
