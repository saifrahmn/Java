package pack;
public class praticals {

    public static void main(String arg[]){
        System.out.println("Base class(p1)"); p1 w=new p1();
//w.f1();
        System.out.println("Derived class(p2)"); p2 x=new p2();
//	x.f2();
        System.out.println("Simple class(p3)"); p3 y=new p3();

//	y.f3();
}


   
    public class p1
{
int a=1;
public int b=2; private int c=3; protected int d=4; public p1()
{
System.out.println("Value of a="+a); System.out.println("Value of b="+b); System.out.println("Value of c="+c); System.out.println("Value of d="+d);
}
}

 class p2 extends p1
{

p2()
{



}



    System.out.println("Value of a="+a);
  System.out.println("Value of b="+b);
//System.out.println("Value of c="+c); System.out.println("Value of d="+d);


package pack; class p3
{
p1 p=new p1(); p3()
{
System.out.println("Value of a="+(p.a)); System.out.println("Value of b="+(p.b));
//System.out.println("Value of c="+(p.c)); System.out.println("Value of d="+(p.d));
}
}



package pack1;
class simple extends pack.p1
{
public simple()
{

//	System.out.println("Value of a="+a); System.out.println("Value of b="+b);
//	System.out.println("Value of c="+c); System.out.println("Value of d="+d);
}
}

package pack1; class s2
{
public static void main(String arg[])
{
simple s=new simple(); s1 p=new s1();
}
}

package pack1; class s1
{
s1()
{
pack.p1 z=new pack.p1();
//	System.out.println("Value of a="+(z.a)); System.out.println("Value of b="+(z.b));
//	System.out.println("Value of c="+(z.c));
//	System.out.println("Value of d="+(z.d));
}
}

}
