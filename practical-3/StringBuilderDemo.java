public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
