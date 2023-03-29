package creatingPackage;

public class constractor {
    int x;
    public constractor(int x){
    this.x=x;
    }

    public static void main(String[] args) {
        constractor cons=new constractor(5);
        System.out.println(cons.x);
    }
}
