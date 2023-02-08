import javax.swing.text.StyledEditorKit.ForegroundAction;

public class test7 {
    public static void main(String[] args){
        StringBuilder strBuilder = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++ ){
            strBuilder.append("=");
        }
        System.out.println(strBuilder.replace(0, 10000, "равно"));
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder time:" + (end1 - start1));

        long start2 = System.currentTimeMillis();
        String str = new String();
        
        for(int i = 0;i < 10000; i++ ){
            str += "=";

        }
        System.out.println(str.replace("=", "равно"));
        long end2 = System.currentTimeMillis();
        System.out.println("String time:" + (end2 - start2));

        System.out.println("Difference:" + ((end2 - start2) - (end1 - start1)));

        




    }
}
