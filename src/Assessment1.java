public class Assessment1 {
    int id;

    Assessment1(){
        System.out.println("Call A Constructor");
    }
    Assessment1(int id)
    {
        this ();
        this.id = id;
    }
    void display()
    {
        System.out.println (id);
    }
    public static void main (String[] args)
    {
        Assessment1 a1 = new Assessment1 (1);
        Assessment1 a2 = new Assessment1 (2);
        a1.display();
        a2.display();
    }
}
