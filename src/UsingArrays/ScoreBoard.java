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
    public void add(GameEntry e) {
        int newScore = e.getScore();

        if(numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if(numEntries < board.length)
                numEntries++;
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            while(j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;      // when done add a entry
        }
    }

}
