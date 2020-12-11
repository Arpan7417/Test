interface A
{
   public void aaa();
}
interface B
{
   public void aaa();
}
class Central implements A,B
{
   public void aaa()
   {
      System.out.println("hello");
   }
   public static void main(String args[])
   {
        A obj=new Central();
		obj.aaa();
    }
}
///it shows inheritance and implementing both the interface
//If there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the method once is enough.
//at the same time the class cannot impement the same method which is having differnt return type
//class can implement any numbers of interface thats is the reason we use this instead of abstract class as multiple inheritance in java (kinda compare to other lang)
//inside implementation class we cant change the declaration of variables coz by default it will be public static final