package AlleNikhil.nikhil.vishalTestCase;

public class Test {
    //i h



    public static void main(String[] args) {
        String name = "Nikhilesh";
        char ch;
        int count1=0;
        int count2=0;

        for (int i = 0; i <= name.length() - 1; i++){
            ch=name.charAt(i);
            if(ch=='i'){
              count1++;
            }
            else if(ch=='h'){
                count2++;
            }
        }
        System.out.print(" I "+count1);
        System.out.println();
        System.out.print(" H "+count2);

    }
    @org.testng.annotations.Test
public void set()
    {
        String name = "Nikhilesh";
        char ch = ' ';
        char m1=' ';;
        int count1=0;
        for (int i = 0; i <= name.length() - 1; i++){
           // for( int j=i;j)
            ch=name.charAt(i);
            m1=name.charAt(i);
        }
        while (ch==m1){
            count1++;

        }
        System.out.print(" I "+count1);
        System.out.println();

    }
}
