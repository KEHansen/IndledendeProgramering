package lektion8;

public class Kurser {
    public static void main(String[] args) {
        String[][] kurser = {{"01904l", "01212", "02315"},
                            {"02324", "02326", "02327", "62577"},
                            {"02369", "62550"},
                            {"01920", "02346", "62410"}};

        for (int i = 0; i < kurser.length; i++) {
            System.out.println(i+1 + ". Semester");
            for (int j = 0; j < kurser[i].length; j++) {
                System.out.println(kurser[i][j] + " ");
            }
        }
    }
}
