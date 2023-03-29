package creatingPackage;

public class exceptionhanding3 {
    public static void main(String[] args) {
        try{

        int [] number= new int[5];
            number[5]=7;
    }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println( "exception handled");
    }



    }


