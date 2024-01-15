public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "HeLLLlo World i LoVe You";
        System.out.println(camelCase(s));
    }

    public static String capVowelsLowRest (String string) {
        String newString = " ";
        for (int i = 0; i<string.length();i++){
            if (IsVowel(string.charAt(i))){
                newString+=Character.toUpperCase(string.charAt(i));
            } else {
                newString+=Character.toLowerCase(string.charAt(i));
            }
        }

        return newString;
    }
    private static boolean IsVowel (char ch){
        char vowel = Character.toLowerCase(ch);
        return vowel == 'a' || vowel == 'e' || vowel == 'i' ||
                 vowel == 'o' || vowel == 'u' || vowel == 'o' ;
    }

    public static String camelCase (String string) {
        String newString = "";
		for (int i = 0; i < string.length(); i++) {
			while (string.charAt(i) == ' ') {
				i++;
			}
			char ch = string.charAt(i);
			if ((newString != "") && (string.charAt(i-1) == ' ')) { 
				if (ch >= 'a' && ch <= 'z'){
                    ch = Character.toUpperCase(ch);
					newString+= ch ;
				} else {
					newString+= string.charAt(i);
				}
			} else {
				if ((ch >= 'A') && (ch <= 'Z')){
					ch = Character.toLowerCase(ch);
                    newString+=ch;
				} else {
					newString+= string.charAt(i);
				}
			}
		} return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
