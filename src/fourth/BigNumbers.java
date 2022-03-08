package fourth;

import java.util.Scanner;
import java.util.stream.Stream;

public class BigNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:  ");
        char[] newNumber = in.nextLine().toCharArray();
        char[][] bigNumber = new char[0][0];
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < newNumber.length; i++) {
            if(maxNumber <= newNumber[i]){
                maxNumber = newNumber[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < newNumber.length; i++) {
            if (i == maxIndex) star = (newNumber[i]);
            else star = '*';
            switch (newNumber[i]) {
                case '0': bigNumber = toDrawNumber(bigNumber,toDrawZero());
                    break;
                case '1': bigNumber = toDrawNumber(bigNumber,toDrawOne());
                    break;
                case '2': bigNumber = toDrawNumber(bigNumber,toDrawTwo());
                    break;
                case '3': bigNumber = toDrawNumber(bigNumber,toDrawThree());
                    break;
                case '4': bigNumber = toDrawNumber(bigNumber,toDrawFour());
                    break;
                case '5': bigNumber = toDrawNumber(bigNumber,toDrawFive());
                    break;
                case '6': bigNumber = toDrawNumber(bigNumber,toDrawSix());
                    break;
                case '7': bigNumber = toDrawNumber(bigNumber,toDrawSeven());
                    break;
                case '8': bigNumber = toDrawNumber(bigNumber,toDrawEight());
                    break;
                case '9': bigNumber = toDrawNumber(bigNumber,toDrawNine());
                    break;
                default:
                    System.out.println("Необходимо было ввести число!");

            }
        }

        for (int k = 0; k < 7; k++) {
            for (int i = k; i < bigNumber.length; i += 7) {
                for (int j = 0; j < bigNumber[i].length; j++) {
                    System.out.print(bigNumber[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static char[][] toDrawNumber (char [][] x, char [][] y){
        return Stream.of(x, y).flatMap(Stream::of)
                .toArray(char[][]::new);
    }
    static char star = '*';

    static char[][] toDrawZero () {
        char[][] zero = new char[7][5];
        for (int i = 0; i < zero.length; i++) {
            for (int j = 0; j < zero[i].length; j++) {
                if (i == 0 || i == 6 || j == 0 || j == 4)
                    zero[i][j] = star;
                else zero[i][j] = ' ';
            }
        }
        return zero;
    }

    static char[][] toDrawOne() {
        char[][] one = new char[7][5];
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                if (j == 2)
                    one[i][j] = star;
                else one[i][j] = ' ';
                if (i == 6) one[i][j] = star;
                one[1][1] = star;
                one[2][0] = star;
            }
        }
        return one;
    }

    static char[][] toDrawTwo() {
        char[][] two = new char[7][5];
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[i].length; j++) {
                if (i == 0) two[i][j] = star;
                else two[i][j] = ' ';
                if (i == 1 && (j == 0 || j == 4)) two[i][j] = star;
                if (i == 2 && (j == 0 || j == 3)) two[i][j] = star;
                if (i == 6) two[i][j] = star;
                two[3][2] = star;
                two[4][1] = star;
                two[5][0] = star;
            }
        }
        return two;
    }

    static char[][] toDrawThree() {
        char[][] three = new char[7][5];
        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three[i].length; j++) {
                if ((i == 0 || i == 3 || i == 6) && (j == 1 || j == 2 || j == 3)) three[i][j] = star;
                else three[i][j] = ' ';
                if ((i == 1 || i == 2 || i == 4 || i == 5) && j == 4) three[i][j] = star;
            }
        }
        return three;
    }

    static char[][] toDrawFour() {
        char[][] four = new char[7][5];
        for (int i = 0; i < four.length; i++) {
            for (int j = 0; j < four[i].length; j++) {
                if ((i == 3 || j == 3)) four[i][j] = star;
                else four[i][j] = ' ';
                four[1][2] = star;
                four[2][1] = star;
            }
        }
        return four;
    }

    static char[][] toDrawFive() {
        char[][] five = new char[7][5];
        for (int i = 0; i < five.length; i++) {
            for (int j = 0; j < five[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) five[i][j] = star;
                else five[i][j] = ' ';
                five[1][0] = star;
                five[2][0] = star;
                five[4][4] = star;
                five[5][4] = star;
            }
        }
        return five;
    }

    static char[][] toDrawSix() {
        char[][] six = new char[7][5];
        for (int i = 0; i < six.length; i++) {
            for (int j = 0; j < six[i].length; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 0) six[i][j] = star;
                else six[i][j] = ' ';
                six[4][4] = star;
                six[5][4] = star;
            }
        }
        return six;
    }

    static char[][] toDrawSeven() {
        char[][] seven = new char[7][5];
        for (int i = 0; i < seven.length; i++) {
            for (int j = 0; j < seven[i].length; j++) {
                if (i == 0 || j == 4) seven[i][j] = star;
                else seven[i][j] = ' ';
            }
        }
        return seven;
    }

    static char[][] toDrawEight() {
        char[][] eight = new char[7][5];
        for (int i = 0; i < eight.length; i++) {
            for (int j = 0; j < eight[i].length; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 0 || j == 4) eight[i][j] = star;
                else eight[i][j] = ' ';
            }
        }
        return eight;
    }

    static char[][] toDrawNine() {
        char[][] nine = new char[7][5];
        for (int i = 0; i < nine.length; i++) {
            for (int j = 0; j < nine[i].length; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 4) nine[i][j] = star;
                else nine[i][j] = ' ';
                nine[1][0] = star;
                nine[2][0] = star;
            }
        }
        return nine;
    }
}
