public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        System.out.println((int) (Math.random() * 40)+ 10);
        System.out.println(Math.random() < 0.05);
    }
}
