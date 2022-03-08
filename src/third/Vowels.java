package third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char[] vowels = {'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё'};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение:  ");
        String[] words = in.nextLine().split(" ");
        char[][] letters = new char[words.length][];
        for (int i = 0; i < words.length; i++) letters[i] = words[i].toCharArray();
        int count = 0;
        List<Words> sortedList = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                for (int k = 0; k < vowels.length; k++) {
                    if (letters[i][j] == vowels[k]) {
                        count++;
                        if (count == 1) letters[i][j] = Character.toUpperCase(letters[i][j]);
                    }
                }
            }
            sortedList.add(new Words(count, toWord(letters[i])));
            count = 0;
        }

        bubbleSort(sortedList);
        System.out.println(sortedList);

        for (int i = 0; i < sortedList.size(); i++){
            System.out.print(sortedList.get(i).getWord() + " ");
        }
    }
    private static String toWord (char[] x){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            stringBuilder.append(x[i]);}
        return stringBuilder.toString();}

    public static List bubbleSort(List<Words> E) {
        for (int i = E.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (E.get(j).getCountVowels() > E.get(j + 1).getCountVowels()) {
                    Words tmp = E.get(j);
                    E.set(j, E.get(j + 1));
                    E.set(j + 1, tmp);
                }
            }
        }
        return E;
    }
}
