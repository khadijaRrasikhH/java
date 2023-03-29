package creatingPackage;

class inherates {
      private String name = "khadija";

     public void myMethod() {
         System.out.println("very nice to learn inherate");
     }
 }
     class maryam extends inherates {
         String pass = "123rtasih";

         public void mysecondMethod() {
             System.out.println("this my second method");


         }
     public static void main(String[] args) {

     maryam ma =new maryam();
         System.out.println(ma.pass);
         ma.myMethod();
         ma.mysecondMethod();
     }
 }

