package homeWork;


public class HomeWorkStr2_1  {
    public static void main(String[] args) {
        String sentence = "если много мучаться - что нибудь получиться";
        char[] charArray = sentence.toCharArray();// конвертируем строку в массив символов

        for (int i = 1; i < charArray.length; i += 2) {
            charArray[i] = 'ы';
        }

        String result = new String(charArray);
        System.out.println(result);
    }
}

