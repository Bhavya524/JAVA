public class ExampleApplication2 {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        boolean flag = false;
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                int countofS = 0;
                int countofT = 0;
                char c = s.charAt(i);
                for (int j = 0; j < s.length(); j++) {
                    if (c == s.charAt(j)) {
                        countofS++;
                    }
                }
                for (int k = 0; k < t.length(); k++) {
                    if (c == t.charAt(k)) {
                        countofT++;
                    }
                }
                if (countofS == countofT) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                countofT = 0;
                countofS = 0;
            }
        } else
            System.out.println(flag);
        System.out.println(flag);


    }
}
