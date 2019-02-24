public class Composition {
    public static void main(String[] args) {
        Owner me = new Owner("iOS", "IOS",14);
        me.getMyStatus();
    }

    // this is a good example how libraries work in the JAVA
}
class OS{
    String name;
    public OS(String name){
        this.name=name;
    }

    public OS(){

    }
    public String getStatus(){
        if(name.equals("Android")){return "Cool OS";}
        // for string and objects always use .equals instead of ==
        else if(name.equals("iOS")){return "hmmm... gerai!";}
        else{return "Blogai!";}// missing return statement
    }
}
class Version {
    int version;
    public Version(int version) {
        this.version = version;
    }
    public String getStatus() {
        if (version > 10) {
            return "Great!";
        } else if (version < 10) {
            return "Please Update,,,";
        } else {
            return "Special Case!";
        }
    }
}

class product extends OS{


        String prod ;

        public product(String name){
            super(name);
            this.prod=prod;

        }

        public String getStatus(){

           if(name.equals("Android") ) {return "Samsung phone";}
           else if(name.equals("IOS")){ return "IPHONE produ";}
           else{
               return " please get a good mobile phone";
           }
        }





}
class Owner{
    Version v;  // this is where we call objects
    OS os;// this is where we call objects
     product prd;
    public Owner(String os, String p,int v){
        this.os= new OS(os);  // this is where we intilliaze
        this.v = new Version(v); // this is where we intilliaze
        this.prd = new product(p);
    }
    public void getMyStatus(){
        System.out.println(os.getStatus());
        System.out.println(v.getStatus());
        System.out.println(prd.getStatus());
    }
}

