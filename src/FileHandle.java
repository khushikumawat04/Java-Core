import java.io.File;
import java.io.IOException;
public class FileHandle {

    public static void main(String [] args) throws  IOException{
        File f = new File("Hello.text");
        //        Creating file
        boolean  file = f.createNewFile();
       if(file){
           System.out.println("File created successfully ");

       }
       else{
           System.out.println("Already Exists");
       }

// 2. Checking if the file exists
        if (f.exists()) {
            System.out.println("File exists.");
            //  Checking file permissions
            System.out.println("Can Read: " + f.canRead());
            System.out.println("Can Write: " + f.canWrite());
            System.out.println("Can Execute: " + f.canExecute());
            System.out.println("File name: " + f.getName());
            System.out.println("Get Path: " + f.getAbsolutePath());
            System.out.println("Get Path: " + f.listFiles());
        } else {
            System.out.println("File does not exist.");
        }


        // 5. Deleting the file
        if (f.delete()) {
            System.out.println("File deleted: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }






    }
}
