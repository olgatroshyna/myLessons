public class BreakLine2 {
    public static void main(String[] args) {
        String text = "coffee tea juice tea coffee coca pepsi tea water water";

        System.out.println("tea "+((text).split("tea").length - 1));
        System.out.println("coca "+((text).split("coca").length - 1));
    }
}
