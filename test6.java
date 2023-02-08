public class test6 {
    static String str1 = "Java";
    static String str2 = "avaJ";


    public static void main(String[] args) {
        System.out.println(str1.contains(str2));
        System.out.println();
    }

    public static boolean word(String str1, String str2) {
        word(str1, new StringBuilder(str2).reverse().toString());
        return true;
        
    }
}
