public class incapsulation {

    private String firstName;
    private String lastName;

    public incapsulation(){}

    public incapsulation(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        incapsulation obj = new incapsulation("aha","ohhh");
        System.out.println("========");
        System.out.println(obj.firstName);
        System.out.println(obj.getFirstName());

        System.out.println("========2222");
        obj.firstName="Pavel";
        System.out.println(obj.firstName);
    }

}

class stuff extends incapsulation{

    public static void main(String[] args) {
        incapsulation obj = new incapsulation("yohan","ohhh");
        System.out.println("========");
        //System.out.println(obj.firstName);
        obj.setFirstName("pavel");
        System.out.println(obj.getFirstName());
    }

}

class Workout {
    private String name;
    private int times;

    public Workout(){}

    public Workout(String name){
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public String getName() {
        times++;
        return name;
    }

}

class stuff2 extends Workout{

    public static void main(String[] args) {
        Workout obj = new Workout("Incaps");
        System.out.println("========");
        //System.out.println(obj.firstName);
        System.out.println(obj.getName());
        System.out.println(obj.getName());
        System.out.println(obj.getName());
        System.out.println(obj.getTimes());

    }

}
   // Message Input


