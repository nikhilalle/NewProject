package AlleNikhil.nikhil.program;

public class Child extends Prarent {
    public void get(){

        System.out.println("I am in Child  get Method");

    }
    public void set(){
        System.out.println("I am in Child  set Method");
    }
    public void met(){
        System.out.println("I am in Child  Met Method");
    }


    public static void main(String[] args) {


        Prarent pr= new Prarent();
        pr.set();
        pr.get();
        pr.met();
        Child ref=new Child();
        ref.get();
        ref.set();
        System.out.println("----------------");
        Prarent pr1=new Prarent();
        pr1.set();
        pr1.get();
        pr1.met();


        //Child ch=new Prarent();




    }

}
