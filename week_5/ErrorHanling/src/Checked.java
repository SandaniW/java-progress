import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//sometimes theres really no point of handling exceptions and throwing them to the next person is ok

public class Checked {
    public static void main(String []args) throws IOException{
        Checked checked = new Checked();
        checked.middle();

    }
    public void writeToFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(("myFile.txt")));
            bw.write("testing");
        }catch (IOException e){
            System.out.println("File cannot be found or created");
        }

    }
    public void writeToFileNew() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(("myFile.txt")));
        bw.write("testing");
    }
    //since writeToFileNew is throwing an exception middle method also has to throw an exception
    public void middle() throws IOException{
        Checked checked = new Checked();
        checked.writeToFileNew();
    }
}
