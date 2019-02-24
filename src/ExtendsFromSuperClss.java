public class ExtendsFromSuperClss {

    private String first_name;  // encapsulate the variables and we will use get() and set()
    private String lastname ;
    public ExtendsFromSuperClss(String first_name ,String lastname){

        this.first_name = first_name;
       this.lastname = lastname;

    }

    public ExtendsFromSuperClss(){

    }

    public String get_name(){

        return first_name;
    }

    public  String get_lstname(){

        return lastname;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /*public static void main(String[] args) {

        ExtendsFromSuperClss obj = new ExtendsFromSuperClss("hafiz","Aziz ahmad");

        *//*obj.first_name="hafiz";*//*
        System.out.println(obj.first_name); // the reason we can input the name is cause the main method is called inside the class where the variables are decleared
        System.out.println(obj.get_lstname());

    }*/





}

class stuff3 extends ExtendsFromSuperClss{


}



