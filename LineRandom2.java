public class LineRandom2 {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        int number,i;
        for (i=0;i<=100;i++){
            number=(int)(Math.random()*1000);
            line.append(number).append(" ");}
        System.out.println(line);}}
            


