public class Regex {

        public static void main(String args[])
        {
            String text = "aab";
            String pattern = "c*a*b";
            System.out.println(isMatch(text, pattern));
        }

        public static boolean isMatch(String text, String pattern)
        {
            if(pattern.isEmpty())
            {
                return text.isEmpty();
            }
            boolean matchFound = false;
            if(!text.isEmpty() && text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.')
            {
                matchFound = true;
            }

            if(pattern.length() >= 2 && pattern.charAt(1) == '*')
            {
                return isMatch(text, pattern.substring(2)) || (matchFound && isMatch(text.substring(1), pattern));
            }
            else
            {
                return isMatch(text.substring(1), pattern.substring(1));
            }
        }
    }

