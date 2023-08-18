public class Block {
    private int point;
    private int numPlayers;

    // constructor 
    public Block(int point) {
        this.point = point;
        this.numPlayers = 0;
    }

    public int getPoint() {
        return this.point;
    }

    public boolean isOccupied() {
        return this.numPlayers==0;
    }

    public void setOccupied(char chr) {
        if (chr=='+') {this.numPlayers++;}
        else if (chr=='-') {this.numPlayers--;}
    }
}
