public class A2 {
    int a=20;
    int b=30;
}
class B extends A2{
    int c=a+b;
}
class C extends A2{
    void display(){
        System.out.println("The value of c =" +c);
    }
}
class hierarchy_inherit{
    public static void main(String a[]){
        C ob=new C();
        ob.display();
    }
}
