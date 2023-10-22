package UsingArrays;

/**
   - This class maintains a sequence of high scores
   -  A scoreboard is limited to a certain number of high scores that can be saved; once that
      limit is reached, a new score only qualifies for the scoreboard if it is strictly higher
      than the lowest “high score” on the board.
   - Since that limit may vary, we allow it to be specified as a parameter to our Scoreboard constructor.
   - Internally, we will use an array named board to manage the GameEntry instances that represent the high scores.
   - The array is allocated with the specified maximum capacity, but all entries are initially null.
   - As entries are added, we will maintain them from highest to lowest score, starting at index 0 of the array.
 */
public class ScoreBoard {
    private int numEntries = 0; // number of actual entries
    private GameEntry[] board; // array of game entries (names and scores)

    // Constructs an empty scoreboard with the given capacity for storing entries
    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    // Attempt to add a new score to the collection (if it is high enough)
    public void add(GameEntry entry) {
        int newScore = entry.getScore();

        if(numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if(numEntries < board.length)
                numEntries++;
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            while(j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1];
                j--;
            }
            board[j] = entry;      // when done add an entry
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index:" + index);

        GameEntry temp = board[index];

        for(int i = index; i < numEntries - 1; i++)
            board[i] = board[i + 1];

        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }


    // Testing the ScoreBoard class
    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard(6);
        GameEntry e1 = new GameEntry("Dickens", 1000);
        GameEntry e2 = new GameEntry("Micah", 800);
        GameEntry e3 = new GameEntry("Eli", 1100);
        GameEntry e4 = new GameEntry("Charles", 810);
        GameEntry e5 = new GameEntry("Alvin", 800);
        GameEntry e6 = new GameEntry("Angelo", 750);
        board.add(e1);
        board.add(e2);
        board.add(e3);
        board.add(e4);
        board.add(e5);
        board.add(e6);
        System.out.println(board.remove(5));
    }

}
