import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String source = "Меня зовут Руслан " +
                "// Это не должно показываться\n" +
                "sdfkasjd;f jasd;f kadsjfk as;dfj sadk;f jas fd/* Это не должно показываться" +
                "Это не должно показываться" +
                "Это не должно показываться */";
        source = source.replaceAll("//[*]\n", "");
        source = source.replaceAll("/*[*]*/", "");
        System.out.println(source);
    }
}
