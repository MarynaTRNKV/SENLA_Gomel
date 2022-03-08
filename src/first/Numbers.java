package first;

public class Numbers {
    public static void main(String[] args) {
        String str = "365 days 12 months";
        char[] chars = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 48; j < 58; j++) {
                if (chars[i] == (char) j) {
                    sum += Character.digit(chars[i], 10);
                }
            }
        }
        System.out.println(sum);
    }
}
