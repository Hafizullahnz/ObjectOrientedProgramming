/*
public class Computerproducts {
    public static void main(String[] args) {
        owner own = new owner("Core i3" ,"DELL");
        own.getdevice();
        
        

    }






}

class modul {



String modl;
    public  modul(String modl){

        this.modl=modl;
    }


    public  modul(){


    }

    public String getdevice(){
        if(modl.equals("DELL")){
            return " you have a DELL Model Laptop";
        }
        else if (modl.equals("LENOVO")){
            return "you have a Lenovo Model Laptop";
        }
        else {
            return "you have Mac machine";
        }
    }


}

class CPU{

    String process;

    public CPU(String process) {
        this.process = process;
    }
     public String getdevice(){

        switch (process){
            case "Core i3":
                return "you have corei3";
            case "core i5":
                return "you have corei3";
                default:
                    return "It is a MAC pro";

        }
     }
}

class owner {
    CPU c;
    modul m;
    prize p ;

    public owner(String c , String m , int p) {
        this.c = new CPU(c);
        this.m = new modul(m);
        this.p = new prize( p );

    }


    public  void getdevice() {
        
        System.out.println(c.getdevice()); 
        System.out.println(m.getdevice());
    }
    
    
    
}
class prize extends modul{

    int prz ;
    public prize(String mod1){
        super( mod1); // example for the super class
        this.prz=prz;
    }

    public int getPrz(){

        switch (modl){
            case "DELL":
                return 1000;
            case "Lenovo":
                return 900;
            default:
                return 1100;

        }
    }
}*/
