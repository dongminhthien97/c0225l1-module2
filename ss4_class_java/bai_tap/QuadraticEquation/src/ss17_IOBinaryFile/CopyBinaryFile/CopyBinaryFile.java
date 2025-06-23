package ss17_IOBinaryFile.CopyBinaryFile;

import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap source path: ");
            String sourceFile = br.readLine();
            System.out.println("Nhap destination path: ");
            String destinationFile = br.readLine();

            File sourcefile = new File(sourceFile);
            File destinationfile = new File(destinationFile);

            if(!sourcefile.exists()){
                System.out.println("Source file does not exist");
                return;
            }

            if(destinationfile.exists()){
                System.out.println("Destination file already exists");
                return;
            }

            inputStream = new FileInputStream(sourcefile);
            outputStream = new FileOutputStream(destinationfile);

            int byteCount = 0;
            int byteData;
            while((byteData = inputStream.read()) != -1){
                outputStream.write(byteData);
                byteCount++;
                System.out.println("Byte count: " + byteCount);
            }

        }catch(IOException e){
            System.out.println("IO Exception" + e.getMessage());
        }finally{
            try{
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            }catch(IOException e){
                System.out.println("IO Exception" + e.getMessage());
            }
        }
    }
}
