public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Wazzzup!");

        sb.append(" World");
        System.out.print(sb);

        sb.replace(2,4, "rakamakafa");
        System.out.print(sb);

        sb.delete(2,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
