package metods;

import java.text.NumberFormat;

public class Dato {

    NumberFormat nf = NumberFormat.getNumberInstance();

    private int year, month, day;
    private String ms;

    public Dato(int år, int måned, int dag) {
        year = år;
        month = måned;
        day = dag;
    }

    public String danish() {
        return day + "/" + month + " " + year;
    }

    public String danishText() {
        switch (month) {
            case 1: ms = ". Januar "; break;
            case 2: ms = ". Februar "; break;
            case 3: ms = ". Marts "; break;
            case 4: ms = ". April "; break;
            case 5: ms = ". Maj "; break;
            case 6: ms = ". Juni "; break;
            case 7: ms = ". Juli "; break;
            case 8: ms = ". August "; break;
            case 9: ms = ". September "; break;
            case 10: ms = ". Oktober "; break;
            case 11: ms = ". November "; break;
            case 12: ms = ". December "; break;
        }
        return day + ms + year;
    }

    public String iso() {
        nf.setMinimumIntegerDigits(2);
        return year + "-" + nf.format(month) + "-" + nf.format(day);
    }



}
