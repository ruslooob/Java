package String.StringBuilder;

public class MyStringBuilderClass {
    /* Можете изменить значение sb, чтобы еще потренироваться */
    static StringBuilder sb = new StringBuilder("Hello world");
    /* API анологично StringBuffer */
    public static void main(String[] args) {
        // Hello world!!
        System.out.println(sb.append("!!"));
        // Hello, world!!
        System.out.println(sb.insert(5, ","));
        //  world!!
        System.out.println(sb.delete(0, 6));
        //  worl!!
        System.out.println(sb.deleteCharAt(5));
        // 7
        System.out.println(sb.length());
        // 2
        System.out.println(sb.indexOf("o"));
        // 2
        System.out.println(sb.lastIndexOf("o"));
        // !
        System.out.println(sb.charAt(5));
        // java!!
        System.out.println(sb.replace(0, 5, "java"));
        // 34
        System.out.println(sb.compareTo(new StringBuilder("Hello")));
        // !!avaj
        System.out.println(sb.reverse());
        // !avaj
        System.out.println(sb.substring(1));
        // !a
        System.out.println(sb.substring(1, 3));
    }
}
