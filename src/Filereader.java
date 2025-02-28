import  java.io.*;
public class Filereader {
    public static void main(String[] args){
//.................Read file using file Reader class
        try{



//            The FileReader class in Java is used to read text files character by character. It's useful for handling and processing text files.

            // Create a FileReader to read the file
           File f  = new File("file.text");
           f.createNewFile();
            FileReader reader = new FileReader(f);

            int data; // To hold character data
            // Read each character until the end of the file
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Convert and print each character
            }

            // Close the reader after use
            reader.close();


        }
        catch(IOException e){
            System.out.println(e);

        }


// Write File - The FileWriter class in Java is used to write data into a file. It writes data in the form of characters and is suitable for creating and updating text files.
        try {
            // Create a FileWriter to write to a file
            FileWriter writer = new FileWriter("file.txt");

            // Write data to the file
            writer.write("Hello, this is an example of FileWriter.\n");
            writer.write("This writes text line by line into a file.");

            // Close the FileWriter to save the changes
            writer.close();

            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }

}
