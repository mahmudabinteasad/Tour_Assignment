import java.util.Arrays;
public class StudentHeights {
    public static void main(String[] args) {
        int[] heights = {160, 150, 170, 155, 165, 180};
        Arrays.sort(heights);
        System.out.println("Students arranged by height:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }
}