import java.util.Scanner;
public class SeashellCollection {
    public static void main(String[] args) {
        int[] seashells = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < seashells.length; i++) {
            System.out.println("Enter number of seashells collected for type " + (i+1) + ":");
            seashells[i] += scanner.nextInt();
        }
        int totalSeashells = 0;
        for (int count : seashells) {
            totalSeashells += count;
        }
        System.out.println("Total number of seashells collected: " + totalSeashells);
    }
}