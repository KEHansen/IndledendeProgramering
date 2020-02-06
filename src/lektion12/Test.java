package lektion12;

import lektion12.WriteFile;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

//        WriteFile wf = new WriteFile();
//
//        int[] arr = {1,2,3};
//
//        wf.openFile("src/lektion12/data");
//        wf.writeInts(arr);
//        wf.writeInts(arr);
//        wf.writeInts(arr);
//        wf.closeFile();



        ReadFile rf = new ReadFile();
        rf.openFile("src/lektion12/data");
        rf.readInts();



    }

}
