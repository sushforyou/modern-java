public class StaticCounter {
    private static int count = 0; // static variable to keep track of count
    private  int anotherCount = 0; // instance variable to identify each instance

    public StaticCounter() {
        count++; // increment count each time a new instance is created
        anotherCount++; // increment instance variable for each instance
    }

    public static int getCount() {
        return count; // return the current count
    }

    public static void main(String... args) {
        StaticCounter sc1 = new StaticCounter();
        StaticCounter sc2 = new StaticCounter();
        StaticCounter sc3 = new StaticCounter();

        System.out.println("Number of instances created: " + StaticCounter.getCount()); // Output: 3
        System.out.println("sc1's anotherCount: " + sc1.anotherCount); // Output: 1
        System.out.println("sc2's anotherCount: " + sc2.anotherCount); // Output: 1
        System.out.println("sc3's anotherCount: " + sc3.anotherCount); // Output: 1
    }
}
