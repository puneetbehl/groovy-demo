import java.io.*;
class FileTest {
   public static void main(String args[]) {
       try {
           File file = new File("/home/puneet/Desktop/Test.txt");
           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line = null;
           while ((line = bufferedReader.readLine()) != null) {
               System.out.println(line);
           }
       } catch (IOException ioException) {
           ioException.printStackTrace();
       }
   }
}


// Groovy Example 
new File("/home/puneet/Desktop/Test.txt").eachLine {line->
   println(line)
}
