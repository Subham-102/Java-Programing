public class pass {
    int a,b;
    void input(int x,int y){
        a=x;
        b=y;
    }
    void disp(){
        System.out.println("the values are"+a+" "+b);
    }
}
class pass2{
    public static void main(String a[]){
        pass ob=new pass();
        pass ob2=new pass();
        ob.input(20,40);
        ob2.input(120,400);
        ob.disp();
        ob2.disp();
    }
}
