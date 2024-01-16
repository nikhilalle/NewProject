package AlleNikhil.Java;

public class InstanceBlocks {
    int roll=121;
    String name="Nikhilesh Alle";
    {
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        InstanceBlocks instanceBlocks =new InstanceBlocks();
        InstanceBlocks instanceBlocks1 =new InstanceBlocks();
        InstanceBlocks instanceBlocks2 =new InstanceBlocks();
        InstanceBlocks instanceBlocks3 =new InstanceBlocks();
        InstanceBlocks instanceBlocks4 =new InstanceBlocks();
        InstanceBlocks instanceBlocks5 =new InstanceBlocks();

    }
}
