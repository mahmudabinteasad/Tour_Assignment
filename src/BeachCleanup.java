public class BeachCleanup {
    public static void main(String[] args) {
        int[] beachSections = {1, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        System.out.println("Before cleanup:");
        printBeach(beachSections);
        for (int i = 0; i < beachSections.length; i++) {
            if (beachSections[i] == 1) {
                beachSections[i] = 0;
            }
        }
        System.out.println("After cleanup:");
        printBeach(beachSections);
    }
    public static void printBeach(int[] beachSections) {
        for (int section : beachSections) {
            System.out.print(section + " ");
        }
        System.out.println();
    }
}