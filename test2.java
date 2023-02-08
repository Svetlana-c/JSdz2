public class test2 {
    public static void main(String[] args){
        int a = 3;
        int b = 56;
    
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a+b);
        System.out.println(sum.replace(7, 8, " раано "));

        StringBuilder sumY = new StringBuilder();
        sumY
              .append(a)
              .append(" - ")
              .append(b)
              .append(" = ")
              .append(a - b);
        System.out.println(sumY.replace(7, 8, " равно "));
        

        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a*b);
        System.out.println(mult.replace(7, 8, " равно "));
    

        StringBuilder div = new StringBuilder();
        div.append(a).append(" / ").append(b).append(" = ").append(a/b);
        System.out.println(div.replace(7, 8, " равно "));
        

        
    }


}
