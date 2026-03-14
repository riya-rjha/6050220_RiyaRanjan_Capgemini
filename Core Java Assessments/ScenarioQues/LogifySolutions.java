import java.io.*;

public class LogifySolutions {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./ScenarioQues/demo.txt");
            System.out.println("I/O operation completed successfully");
            fr.close();
        } catch (IOException e) {
            System.err.println("An I/O error occurred");
        } finally {
            System.out.println(System.getProperty("user.dir"));
            System.out.println("Program has run successfully");
        }

        System.out.println(010);
        System.out.println(012);
    }
}
