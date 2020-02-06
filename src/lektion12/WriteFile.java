package lektion12;

import java.io.*;

public class WriteFile {

    private FileWriter fw;
    private BufferedWriter out;

    public void openFile(String file) throws IOException {
        //TODO: Din kode her!
        fw = new FileWriter(file);
        out = new BufferedWriter(fw);
    }

    public void writeInts(int[] ints) throws IOException {
        //TODO: Din kode her!
        for (int i = 0; i < ints.length; i++) {
            out.write(ints[i] + " ");
        }
        out.write("\n");
    }

    public void closeFile() throws IOException {
        //TODO: Din kode her!
        fw = null;
        out.close();
    }
}