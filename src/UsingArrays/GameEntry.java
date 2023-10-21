package UsingArrays;
public class GameEntry {
    private String name; // name of the person earning the score
    private int score; // the score value

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }

    public int getScore() { return score; }

    // Return a string representation of this entry
    public String toString() { return "(" + name + ", " + score + ")"; }

}
