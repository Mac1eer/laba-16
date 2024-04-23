import java.io.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\output.txt")); BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"))) {
            String check;
            StringBuilder code = new StringBuilder();
            while ((check = reader.readLine()) != null) {
                code.append(check).append("\n");
            }
            String noComments = code.toString().replaceAll("(//.*|/\\*[\\s\\S]*?\\*/)","");
            writer.write(noComments);
        } catch (IOException e) {
            System.err.println();
        }
    }}
