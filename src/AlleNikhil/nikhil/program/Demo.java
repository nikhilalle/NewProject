package AlleNikhil.nikhil.program;

public class Demo {
   int add(int a,int b,String name,char c,boolean b1){


        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
       amol(54,58);
        System.out.println(name  );
        System.out.println(b1);
        System.out.println("-----------------------");

        return a;


    }

    public void amol(int a,int b){

        char c='A';
        String name="Arti";
        boolean b1=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
        System.out.println(b1);
    }
    public static void main(String[] args)
    {
        Demo dm=new Demo();
       int y=dm.add(10,50,"Nikhi",'D',false);
        System.out.println(y);
      //dm.amol(20,56);
        int a=20,b=20;
        int sum=a+b;
        System.out.println(sum);


    }
}
