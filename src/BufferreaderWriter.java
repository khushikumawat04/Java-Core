import  java.io.*;
public class BufferreaderWriter {
    public  static void main(String[] args){

        try {
            FileWriter f = new FileWriter("file.text");
//BufferedWriter helps to write text more efficiently by temporarily storing data in a buffer and then writing it all at once,
// improving performance when working with large data or multiple write operations.
            BufferedWriter writer = new BufferedWriter(f);

            writer.write("Hello, this is a test.");
            writer.close();

// BufferedReader reads lines of text from the file and prints each line to the console.
//It's efficient because it reduces I/O operations by using a buffer to read data in chunks.
//Line-based Writing: It provides the newLine() method to write a system-specific line separator (like \n or \r\n).

            // Create a FileReader to read the file
            FileReader fileReader = new FileReader("file.txt");
            // Wrap FileReader with BufferedReader for efficient reading
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            // Read each line from the file until EOF (end-of-file)
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            // Close the BufferedReader to free resources
            reader.close();


        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
