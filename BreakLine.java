public class BreakLine {
    public static void main(String[] args) {
        String text= "coffee tea juice tea coffee coca pepsi tea water water";
       String [] words = text.split(" ");
        int i = 0;
        int j;
       for (i=0;i<=words.length-1;i++) {
           if (words[i]!=null){
               int count=1;
               for (j=i+1;j<=words.length-1;j++) {
              if ( words[i].equals(words[j])){
                  count++;
                  words[j]=null;}}
                  System.out.println("words "+words[i]+ " appears "+count);


              }
           }}}





