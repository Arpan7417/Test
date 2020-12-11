interface Inf1{
   public void methodx();
   public void methody();
   public void methodz();
   
}
interface Inf2 extends Inf1 {
   public void method2();
}
public class c implements Inf2{
   /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1*/
    
    public void methodx(){
	System.out.println(" hello x");
    }
    public void methody(){
	System.out.println(" hello y");
    }
    public void methodz(){
	System.out.println(" hello z");
    }
    public void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
	Inf1 obj = new c();
	obj.methodx();
	obj.methody();
	obj.methodz();
    }
}