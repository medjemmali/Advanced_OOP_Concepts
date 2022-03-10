import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris-data.csv");
    }

    public Database readCSV(String filename) {
        String contents = "";
                /* TODO.
Change what needs to go here to start reading "filename" */
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))){
            byte[] buffer = new byte[1024];
            int lengthRead;

            while ((lengthRead = in.read(buffer)) > 0) {
                contents += new String(buffer, 0, lengthRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return new Database(contents);
    }
}
