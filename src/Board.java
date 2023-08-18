import java.util.ArrayList;
import java.lang.StringBuilder;
import org.apache.commons.lang3.StringUtils;

public class Board {
    private DoublyLinkedList<Block> board = new DoublyLinkedList<Block>();
    private int[] boardNumbers = {5,10,8,10,7,5,9,10,6,7,10,6,5,8,9,5,10,5,9,6,8,7,10,6,8};
    private int numPlayers;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Board(int numPlayers) {
        this.numPlayers = numPlayers;
        for (int i=0; i<this.numPlayers; i++) {
            players.add(new Player(i));
        }
        for (int boardNumber: this.boardNumbers) {
            Block block = new Block(boardNumber);
            board.addLast(block);
        }
    }

    public ArrayList<Player> getPlayers() {return players;}

    public int dice() {
        return (int) (Math.random()*6+1);
    }

    // return true if player reaches end and has enough points, else false
    public boolean move(Player p) {
        // roll the dice
        int dice = this.dice();
        // change condition of current block
        if (board.getCurrent(p.getPosition()).getElement()!=null) {
            board.getCurrent(p.getPosition()).getElement().setOccupied('-');
        }
        // update player's position
        p.updatePosition(dice);
        //p.updatePosition(10);
        
        // if reach the end
        if (p.getPosition()==26) {
            // if have enough points, return true
            if (p.enoughPoint()) {return true;}
            // go back to start
            p.updatePosition(-26);
            return false;
        }

        // get the block
        Block block = board.getCurrent(p.getPosition()).getElement();
        // check if the block is occupied
        // if block is not occupied, go back 7 blocks
        if (!block.isOccupied()) {
            this.moveBack(p);
        }
        p.addPoint(block.getPoint());
        block.setOccupied('+');
        p.setMove();
        return false;
    }

    // move back 7 position
    public void moveBack(Player p) {
        for (int i=0; i<this.numPlayers; i++) {
            // iterate over all players, if the player isn't the given player and has same position
            if ((players.get(i).getPosition()==p.getPosition())&&(players.get(i).getName()!=p.getName())) {
                Block block = board.getCurrent(p.getPosition()).getElement();
                block.setOccupied('-');
                players.get(i).updatePosition(-7);
                if (players.get(i).getPosition()!=0) {
                    block = board.getCurrent(players.get(i).getPosition()).getElement();
                    block.setOccupied('+');
                }
            }
        }
    }

    public void printBoard() {
        for (int i=0; i<board.size()+2; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<this.numPlayers; j++) {
                if (players.get(j).getPosition()==i) {sb.append("|"+StringUtils.center(String.valueOf(players.get(j).getName()), 5));}
                else {sb.append("|  -  ");}
            }
            if (i==0) {
                System.out.println("Start"+sb.toString());
            }
            else if (i==26) {
                System.out.println(" End "+sb.toString());
            }
            else {
                System.out.println(StringUtils.center(Integer.toString(boardNumbers[i-1]), 5)+sb.toString());
            }
        }
        System.out.println();
    }
}
