package ex1;



public class ex2 {

    public static void main(String[] args) {
        countWords("I love java");
        reverseString("I love this shit");
        addSpaces("HeyWorldIt'sReda");
    }

    public static void addSpaces(String s) {
        var modifiedText  = new StringBuilder(s);
        for (int i = 0; i < modifiedText.length(); i++) {
            if(i!=0&& Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void reverseString(String text) {
        for (int i = text.length()-1; i >=0; i--) {
            System.out.print(text.charAt(i));

        }
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int wordCounts = words.length;
        String message = String.format("your text has %d words",wordCounts);
        System.out.println(message);
        for (String value : words) {
            System.out.println(value);
        }
    }

}
