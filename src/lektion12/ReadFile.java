package lektion12;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    BufferedReader in;
    public void openFile(String file) {
        //TODO: Din kode her
        try {
            FileReader fr = new FileReader(file);
            in = new BufferedReader(fr);
        } catch (IOException e) {
            System.out.println("Filen kan ikke åbnes");
        }
    }
    public int[] readInts() {
        int[] ints=null;
        //TODO: Din kode her
        try {
           int i = in.read();
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ints;
    }
    public void closeFile(){
        //TODO: Din kode her
    }
}
