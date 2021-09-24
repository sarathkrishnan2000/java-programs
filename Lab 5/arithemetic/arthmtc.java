package arithmetic;

interface arthop{
    void add(float x,float y);
    void sub(float x,float y);
    void div(float x,float y);
    void multi();
}
public class arthmtc {
    void add(float x,float y){
        System.out.println("ADDITION: "+(x+y));
    }
    void sub(float x,float y){
        System.out.println("SUBTRACTION: "+(x-y));
    }
    void div(float x,float y){
        System.out.println("DIVISION: "+(x/y));
    }
    void multi(float x,float y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}
