package pl.movietheater;

public class Siting {
    private int sitNumber;
    private int sitRow;
    private String status;

    public Siting(int sitNumber, int sitRow, String status) {
        this.sitNumber = sitNumber;
        this.sitRow = sitRow;
        this.status = status;
    }

    public Siting(int sitNumber, int sitRow) {
        this.sitNumber = sitNumber;
        this.sitRow = sitRow;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    public int getSitRow() {
        return sitRow;
    }

    public void setSitRow(int sitRow) {
        this.sitRow = sitRow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
