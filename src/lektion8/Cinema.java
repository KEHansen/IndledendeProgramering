package lektion8;

public class Cinema {

    public String[][] cinema;

    public Cinema(int[] seatsOnRow) {
        this.cinema = new String[seatsOnRow.length][];
        for (int i = 0; i < this.cinema.length; i++) {
            this.cinema[i] = new String[seatsOnRow[i]];
        }
        for (int i = 0; i < this.cinema.length; i++) {
            for (int j = 0; j < this.cinema[i].length; j++) {
                this.cinema[i][j] = "O";
            }
        }
    }

    public int row() {
        return this.cinema.length;
    }

    public int seatsOnRow(int row) {
        int seatsOnRow = 0;
        if(row-1 >= 0 && row-1 < this.cinema.length)
            seatsOnRow = this.cinema[row-1].length;
        return seatsOnRow;
    }

    public int seats() {
        int seats = 0;
        for (int i = 0; i < this.cinema.length; i++) {
            seats =+ this.cinema[i].length;
        }
        return seats;
    }

    public int rowVacancies(int row) {
        int rowVancancies = 0;
        if (row-1 >= 0 && row < this.cinema.length) {
            for (int i = 0; i < this.cinema[row-1].length; i++) {
                if (this.cinema[row-1][i].equals("O"))
                    rowVancancies++;
            }
        }
        return rowVancancies;
    }

    public int vacancies() {
        int vacancies = 0;
        for (int j = 0; j < this.cinema.length; j++) {
            for (int i = 0; i < this.cinema[j].length; i++) {
                if (this.cinema[j][i].equals("O"))
                    vacancies++;
            }
        }
        return vacancies;
    }


    public void booking(int row, int seat) {
        if (this.cinema[row-1][seat-1].equals("#")) {
            System.out.println("The seat is already booked");
        } else {
            this.cinema[row-1][seat-1] = "#";
        }
    }

    public void release(int row, int seat) {
        if (this.cinema[row-1][seat-1].equals("#")) {
            this.cinema[row-1][seat-1] = "O";
        } else {
            System.out.println("The seat wasn't booked");
        }
    }







    public void printmatrix() {
        for (int i = 0; i < this.cinema.length; i++) {
            for (int j = 0; j < this.cinema[i].length; j++) {
                System.out.print(this.cinema[i][j]);
            }
            System.out.println();
        }
    }
}
