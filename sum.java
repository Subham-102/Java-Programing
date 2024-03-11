public class sum {
    int a,b,add;
    void input(){
        a=102;
        b=103;

    }
    void calculate(){
        add=a+b;
    }
    void display(){
        System.out.println(add );
    }
}
class summation{
    public static void main(String a[]){
        sum ob = new sum();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
