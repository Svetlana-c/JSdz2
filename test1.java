
public class test1 {
    public static void main(String[] args){
        int a = 3;
        int b = 56;
    
        StringBuilder sum = new StringBuilder();
        sum.append(a).append("+").append(b).append("=").append(a+b);
        System.out.println(sum);
    
        StringBuilder sumY = new StringBuilder();
        sumY.append(a).append("-").append(b).append("=").append(a-b);
        System.out.println(sumY);

        StringBuilder mult = new StringBuilder();
        mult.append(a).append("*").append(b).append("=").append(a*b);
        System.out.println(mult);

        StringBuilder div = new StringBuilder();
        div.append(a).append("/").append(b).append("=").append(a/b);
        System.out.println(div);

        
    }


}
