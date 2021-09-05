package String.Self;

public class MyStringClass {
    String s = "Hello world!";

    public void m() {
        // Hello world!!!
        System.out.println(s + "!!");
        // 12
        System.out.println(s.length());
        // 4
        System.out.println(s.indexOf("o"));
        // 7
        System.out.println(s.lastIndexOf("o"));
        // (пробел)
        System.out.println(s.charAt(5));
        // Hello java!
        System.out.println(s.replace("world", "java"));
        // -32
        System.out.println(s.compareTo("hello Java"));
        // true
        System.out.println(s.startsWith("H"));
        // false
        System.out.println(s.endsWith("d"));
        // HELLO WORLD!
        System.out.println(s.toUpperCase());
        // hello world!
        System.out.println(s.toLowerCase());
        // 5545 (строка)
        System.out.println(String.valueOf(5545));
    }

}