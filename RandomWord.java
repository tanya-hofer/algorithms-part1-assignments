import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    //Write a program RandomWord.java that reads a sequence of words from standard input
    //and prints one of those words uniformly at random. Do not store the words in an array or list.
    // Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i
    // to be the champion, replacing the previous champion. After reading all of the words,
    // print the surviving champion.
    public static void main(String[] args) {
        String champion = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (StdRandom.bernoulli(1.0/i) == true) {
                champion = word;
            }
            i++;
        }
        StdOut.println(champion);
    }
}
