import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonsCollections {

   enum fname{
       hafiz(26),
       layrunas(34),
       sarunas(28);

       int values;
       fname(int values ){
           this.values=values;
       }
   }


    public static void main(String[] args ){

        Map<String, List<fname>> Firstname = new HashMap();
       // Map<String,List<String>> Lastname = new HashMap(  );
       // Map<String,List<Integer>> age = new HashMap(  );

                Firstname.put("hello", Arrays.asList(fname.values()));
              //  Lastname.put( "Last_Name",Arrays.asList( "Aziz Ahmad", "Teacher", "Mazuolis" ) );


                for (Map.Entry<String, List<fname>> pair : Firstname.entrySet()){

                    pair.getKey();
                    pair.getValue();
                    for(fname item : pair.getValue()){
                        System.out.println("age" +item.values );
                    }
                    System.out.println(pair);

                }

    }
}
