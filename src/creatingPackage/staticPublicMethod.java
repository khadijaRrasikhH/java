package creatingPackage;

public class staticPublicMethod {
    static void myMethodS(){

        System.out.println("this is static Method");
    }
    public void myMethodP(){
        System.out.println("this is public method");

    }


    public static void main(String[] args) {

        staticPublicMethod myObj= new staticPublicMethod();
        myObj.myMethodP();
        myMethodS();
    }}