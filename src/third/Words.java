package third;

public class Words {
    private int countVowels;
    private String word;

    public Words(int countVowels, String word) {
        this.countVowels = countVowels;
        this.word = word;
    }

    public int getCountVowels() {
        return countVowels;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "В слове " +  word + " количество гласных звуков " + countVowels;

    }
}
