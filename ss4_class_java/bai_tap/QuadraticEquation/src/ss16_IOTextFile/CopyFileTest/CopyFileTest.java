package ss16_IOTextFile.CopyFileTest;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args)  {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try{
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap source file:");
            String sourceFile = console.readLine();
            System.out.println("Nhap destination file:");
            String destinationFile = console.readLine();

            File sourcefile = new File(sourceFile);
            File destinationfile = new File(destinationFile);

            if(!sourcefile.exists()){
                System.out.println("Source file does not exist");
            }

            if(destinationfile.exists()){
                System.out.println("Destination file already exists");
            }

            reader = new BufferedReader(new FileReader(sourcefile));
            writer = new BufferedWriter(new FileWriter(destinationfile));

            int charCount = 0;
            int c;
            while((c = reader.read()) != -1){
                writer.write(c);
                charCount++;

                System.out.println("charCount: " + charCount);
            }

        }catch(IOException e) {
            System.out.println("IO Exception" + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception" + e.getMessage());

        }finally{
            try{
                if(reader != null){
                    reader.close();
                if(writer != null){
                    writer.close();}
                }
            }catch(IOException e){
                    System.out.println("IO Exception" + e.getMessage());
            }
        }
    }
}
