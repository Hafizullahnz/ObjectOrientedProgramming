public class Overloading {
    public int add(int x, int y){
        return (x + y);
    }

    public int add(int x, int y, int z){
        return (x + y + z);
    }

    public double add(double x, double y){
        return (x + y);
    }

    public String add(String x, String y){
        return (x + y);
    }

    public String add(char x){  // the reason we are returning string is that sum of charachters will be a string
        return "abcd..." + x;
    }

    public static void main(String args[])
    {
        // we  are calling function add which has different parameters which is overloading
        Overloading obj = new Overloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
        System.out.println(obj.add("YO, ", "Its me!"));
        System.out.println(obj.add('z'));
    }
}