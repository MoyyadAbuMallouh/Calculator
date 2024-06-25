public class Main {

    public static int add(int x , int y) //emp1 should work here
    {return (x+y);}

    public static int sub(int x,int y)//emp1 should work here
    {return x-y;}

    public static int mul(int x,int y)//emp2 should work here
    {return (x*y);}

    public static int div(int x ,int y)////emp2 should work here
    {return x/y;}


    public static void main(String[] args)//tester should test code here!
    {
        System.out.println(add(5,6));
        System.out.println(sub(5,6));
        System.out.println(mul(5,6));
        System.out.println(div(5,6));
    }
}