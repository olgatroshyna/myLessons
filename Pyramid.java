import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Number = sc.nextInt();
        int i, j, variable;
        double horizon, vertical, radius;
        float centre = (float) (Number / 2 + 0.5);
        for (i = 1; i <= Number; i++) {
            for (j = 1; j <= Number; j++) {
                horizon = Math.abs(centre - j);
                vertical = Math.abs(centre - i);
                radius = Math.max(horizon, vertical);
                variable= (int) Math.round(centre - radius);
                System.out.print(variable);
            }
            System.out.println();
        }
    }
}
