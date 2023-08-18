public class Player {
    private int point;
    private int position;
    private int move;
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char name;

    // constructor method
    public Player(int i) {
        this.point = 0;
        this.position = 0;
        this.name = alphabet[i];
        this.move = 0;
    }

    public int getMove() {return this.move;}

    public void setMove() {
        this.move++;
    }

    public int getPoint() {
        return this.point;
    }
    
    public void addPoint(int point) {
        this.point += point;
    }

    public int getPosition() {
        return this.position;
    }

    public void updatePosition(int position) {
        this.position += position;
        if (this.position > 26) {this.position=26;}
        if (this.position < 0) {this.position=0;}
    }

    public boolean enoughPoint() {
        return this.point>=44;
    }

    public char getName() {return this.name;}
}
