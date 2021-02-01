public class ReplaceAll {
            public static void main(String[] args) {
            String line="";
            int number,i;
            for (i=0;i<=100;i++){
                number=(int)(Math.random()*1000);
                line=line+String.valueOf(number)+" ";
            }
            System.out.println(line);

        line=line.replaceAll("\\s\\d\\d\\s"," -1 ");
        System.out.println(line.replaceAll("\\s\\d\\d\\s"," -1 "));
}
}
