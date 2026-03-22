/*
* String => It is immutable, which means that once a String object is created, it cannot be changed. 
* Any operation that modifies a String will create a new String object.
* StringBuilder => It is mutable, which means that it can be modified after it is created. 
* It is more efficient for concatenating multiple strings. Not Thread-safe, so it should be used in a single-threaded environment.
* StringBuffer => It is also mutable and thread-safe, which means that it can be safely used in a multi-threaded environment.
 */
public class StringOperations {

    public static void main(String[] args) {
        String str = "Hello";
        str = str + " World"; // This creates a new String object
        System.out.println(str); // Output: Hello World

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World"); // Modifies the existing StringBuilder object
        System.out.println(stringBuilder.toString()); // Output: Hello World

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World"); // Modifies the existing StringBuffer object
        System.out.println(stringBuffer.toString()); // Output: Hello World
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(System.identityHashCode(a)); // e.g., 12345
        System.out.println(System.identityHashCode(b)); // same: 12345 → same object
        System.out.println(System.identityHashCode(c)); // different: 67890 → new object

        String original = "Hello";
        String modified = original.replace('H', 'J'); // This creates a new String object
        System.out.println("original: " + original); // Output: Hello
        System.out.println("modified: " + modified); // Output: Jello

    }
}
