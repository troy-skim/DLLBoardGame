import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Printing out the boards\n--------------------------------------------------");
        System.out.println("One Player");
        int onePlayerTotalMoves = 0;
        int onePlayerAWins = 0;
        for (int i=0; i<1000; i++) {
            Board board = new Board(1);
            ArrayList<Player> players = board.getPlayers();
            Player A = players.get(0);
            while (true) {
                if (board.move(A)) {
                    onePlayerAWins++;
                    break;
                }
            }
            onePlayerTotalMoves += A.getMove();
            if (i%100==0) {
                board.printBoard();
            }
        }
        System.out.println("\n");

        System.out.println("Two Players");
        int twoPlayerATotalMoves = 0;
        int twoPlayerAWins = 0;
        int twoPlayerBTotalMoves = 0;
        int twoPlayerBWins = 0;
        for (int i=0; i<1000; i++) {
            Board board = new Board(2);
            ArrayList<Player> players = board.getPlayers();
            Player A = players.get(0);
            Player B = players.get(1);
            while (true) {
                boolean Awin = board.move(A);
                boolean Bwin = board.move(B);
                if (Awin) {
                    twoPlayerAWins++;
                    break;
                }
                else if (Bwin) {
                    twoPlayerBWins++;
                    break;
                }
            }
            twoPlayerATotalMoves += A.getMove();
            twoPlayerBTotalMoves += B.getMove();
            if (i%100==0) {
                board.printBoard();
            }
        }
        System.out.println("\n");
        
        System.out.println("Three Players");
        int threePlayerATotalMoves = 0;
        int threePlayerAWins = 0;
        int threePlayerBTotalMoves = 0;
        int threePlayerBWins = 0;
        int threePlayerCTotalMoves = 0;
        int threePlayerCWins = 0;
        for (int i=0; i<1000; i++) {
            Board board = new Board(3);
            ArrayList<Player> players = board.getPlayers();
            Player A = players.get(0);
            Player B = players.get(1);
            Player C = players.get(2);
            while (true) {
                boolean Awin = board.move(A);
                boolean Bwin = board.move(B);
                boolean Cwin = board.move(C);
                if (Awin) {
                    threePlayerAWins++;
                    break;
                }
                else if (Bwin) {
                    threePlayerBWins++;
                    break;
                }
                else if (Cwin) {
                    threePlayerCWins++;
                    break;
                }
            }
            threePlayerATotalMoves += A.getMove();
            threePlayerBTotalMoves += B.getMove();
            threePlayerCTotalMoves += C.getMove();
            if (i%100==0) {
                board.printBoard();
            }
        }
        System.out.println("\n");

        System.out.println("Four Players");
        int fourPlayerATotalMoves = 0;
        int fourPlayerAWins = 0;
        int fourPlayerBTotalMoves = 0;
        int fourPlayerBWins = 0;
        int fourPlayerCTotalMoves = 0;
        int fourPlayerCWins = 0;
        int fourPlayerDTotalMoves = 0;
        int fourPlayerDWins = 0;
        for (int i=0; i<1000; i++) {
            Board board = new Board(4);
            ArrayList<Player> players = board.getPlayers();
            Player A = players.get(0);
            Player B = players.get(1);
            Player C = players.get(2);
            Player D = players.get(3);
            while (true) {
                boolean Awin = board.move(A);
                boolean Bwin = board.move(B);
                boolean Cwin = board.move(C);
                boolean Dwin = board.move(D);
                if (Awin) {
                    fourPlayerAWins++;
                    break;
                }
                else if (Bwin) {
                    fourPlayerBWins++;
                    break;
                }
                else if (Cwin) {
                    fourPlayerCWins++;
                    break;
                }
                else if (Dwin) {
                    fourPlayerDWins++;
                    break;
                }
            }
            fourPlayerATotalMoves += A.getMove();
            fourPlayerBTotalMoves += B.getMove();
            fourPlayerCTotalMoves += C.getMove();
            fourPlayerDTotalMoves += D.getMove();
            if (i%100==0) {
                board.printBoard();
            }
        }
        System.out.println("\n");

        System.out.println(StringUtils.center("Player in game", 15)+"|"+StringUtils.center("A average moves / % winning", 30)+"|"+StringUtils.center("B average moves / % winning", 30)+"|"+StringUtils.center("C average moves / % winning", 30)+"|"+StringUtils.center("D average moves / % winning", 30));
        System.out.println(StringUtils.center("A", 15)+"|"+StringUtils.center((int)onePlayerTotalMoves/1000+" / "+String.format("%.2f",(float)onePlayerAWins/10)+"%", 30)+"|"+StringUtils.center("-", 30)+"|"+StringUtils.center("-", 30)+"|"+StringUtils.center("-", 30));
        System.out.println(StringUtils.center("A, B", 15)+"|"+StringUtils.center((int)twoPlayerATotalMoves/1000+" / "+String.format("%.2f",(float)twoPlayerAWins/10)+"%", 30)+"|"+StringUtils.center((int)twoPlayerBTotalMoves/1000+" / "+String.format("%.2f",(float)twoPlayerBWins/10)+"%", 30)+"|"+StringUtils.center("-", 30)+"|"+StringUtils.center("-", 30));
        System.out.println(StringUtils.center("A, B, C", 15)+"|"+StringUtils.center((int)threePlayerATotalMoves/1000+" / "+String.format("%.2f",(float)threePlayerAWins/10)+"%", 30)+"|"+StringUtils.center((int)threePlayerBTotalMoves/1000+" / "+String.format("%.2f",(float)threePlayerBWins/10)+"%", 30)+"|"+StringUtils.center((int)threePlayerCTotalMoves/1000+" / "+String.format("%.2f",(float)threePlayerCWins/10)+"%", 30)+"|"+StringUtils.center("-", 30));
        System.out.println(StringUtils.center("A, B, C, D", 15)+"|"+StringUtils.center((int)fourPlayerATotalMoves/1000+" / "+String.format("%.2f",(float)fourPlayerAWins/10)+"%", 30)+"|"+StringUtils.center((int)fourPlayerBTotalMoves/1000+" / "+String.format("%.2f",(float)fourPlayerBWins/10)+"%", 30)+"|"+StringUtils.center((int)fourPlayerCTotalMoves/1000+" / "+String.format("%.2f",(float)fourPlayerCWins/10)+"%", 30)+"|"+StringUtils.center((int)fourPlayerDTotalMoves/1000+" / "+String.format("%.2f",(float)fourPlayerDWins/10)+"%", 30));
    }
}
