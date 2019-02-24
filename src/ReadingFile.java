import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFile {

    public static void main (String[] args){

       // Path path = Paths.get( test.txt );
      try {
          List<String> fileRead = Files.readAllLines( Paths.get( "C:\\Users\\User\\Documents\\datastrc.txt" ));
          System.out.println(fileRead  );
      }
      catch (FileNotFoundException e){
          e.printStackTrace();
      }
      catch (IOException e){
          e.printStackTrace();
      }
    }
}
