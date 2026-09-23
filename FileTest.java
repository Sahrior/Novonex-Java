import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileTest {
    public static void main (String[] args) throws IOException{

        //File file = new File("test.txt");

        /*if( file.createNewFile() ){
            System.out.println("New file created");

        }else {
            System.out.println("File already created");
        }*/



        // checking file information

        /* 
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Exists: " + file.exists());
        System.out.println("Can read: " +file.canRead() );
        System.out.println("Can write: "+ file.canWrite());
        System.out.println("File size: " +file.length() + " bytes");

        */

        // --------------------------- INPUT STREAM && OUTPUT STREAM 

        // how to read from file using inputStream

        /*FileInputStream input = new FileInputStream("test.txt");

        int data;

        while( (data = input.read()) != -1 ){
            System.out.println( (char) data );
        }

        input.close(); */

        // how to write data in file using outputStream

        /*FileOutputStream output = new FileOutputStream("test.txt");

        String text = "hello afifa";

        output.write(text.getBytes());

        output.close();

        System.out.println("Data written succesfully");


        */

        // ------------------------ FILE READER && FILE WRITER


        // how to read from file using file reader

        /*FileReader reader = new FileReader("test.txt");

        int data;

        while( (data = reader.read()) != -1 ){
            System.out.println( (char) data );
        }

        reader.close(); */

        // how to write data in file using fileWrite

        /*FileWriter writer = new FileWriter("test.txt");

        writer.write("afifa is a good student");

        writer.close();*/


        // ---------------BUFFRED READER && BUFFRED WRITTER

        // how to read file using buffredreader

        /*BufferedReader reader = new BufferedReader( new FileReader("test.txt") );

        String line;

        while ( ( line = reader.readLine() ) != null ){
            System.out.println(line);
        }

        reader.close();
        */

        // how to write in a file using buffred writer 

        /*BufferedWriter writer  = new BufferedWriter( new FileWriter("test.txt") );

        //writer.write("Hello ");
        //writer.newLine();
        //writer.write("i am sahrior");
        //writer.newLine();
        //writer.write("i am learning machine learning");

        //writer.append("i am afifa");

        writer.close();

        System.out.println(" written succefully "); */



        // find the summation of the numbers inside the number.txt file

        // 10 + 25 + 5 + 30 + 15 + 40 + 7 + 3 = 135

        /* */

        BufferedReader reader = new BufferedReader( new FileReader( "number.txt") );

        String line;
        int sum = 0;

        while ( (line = reader.readLine())!= null ){

            String[] parts = line.split(" ") ; 

            // java 30 => parts[] = parts[0] = "java", parts[1] = "30"

            for (String p : parts){

                try {

                    int num = Integer.parseInt(p);
                    sum = sum + num;
                    
                } catch ( NumberFormatException e ) {
                    System.out.println(p + " is not a number");
                }

            }


        }

        reader.close();

        System.out.println("Sum: " + sum);





    }
}