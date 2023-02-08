public class test3 {
    public static void main(String[] args){
        int a = 3;
        int b = 56;
    
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a+b);
        sum.delete(7, 8);
        sum.insert(7, "равно");
        System.out.println(sum);

        StringBuilder sumY = new StringBuilder();
        sumY
              .append(a)
              .append(" - ")
              .append(b)
              .append(" = ")
              .append(a - b);
        sumY.delete(7, 8);
        sumY.insert(7, "равно");
        System.out.println(sumY);
        

        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a*b);
        mult.delete(7, 8);
        mult.insert(7, "равно");
        System.out.println(mult);
    

        StringBuilder div = new StringBuilder();
        div.append(a).append(" / ").append(b).append(" = ").append(a/b);
        div.delete(7, 8);
        div.insert(7, "равно");
        System.out.println(div);

        
    }


}
