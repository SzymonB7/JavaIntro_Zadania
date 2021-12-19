package pl.movietheater;

public class Siting {
    private final int sitNumber;
    private final int sitRow;
    private boolean isSitTaken;

    public Siting(int sitNumber, int sitRow, boolean isSitTaken) {
        this.sitNumber = sitNumber;
        this.sitRow = sitRow;
        this.isSitTaken = isSitTaken;
    }

    public boolean isSitTaken() {
        return isSitTaken;
    }

    public void setSitTaken(boolean sitTaken) {
        isSitTaken = sitTaken;
    }
    public int getSitNumber() {
        return sitNumber;
    }

    public int getSitRow() {
        return sitRow;
    }
}

