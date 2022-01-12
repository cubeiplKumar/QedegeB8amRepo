// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
//new code changes done by Mahender for the userstory hdfc300
// reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
      destFile.write(array);
      System.out.println("The input.txt file is copied to newFile.");
  }
}