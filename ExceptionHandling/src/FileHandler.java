import java.io.File;
import java.io.IOException;

class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File loaded successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("data.txt");
        } catch (IOException e) {
            System.out.println("Error while loading file: " + e.getMessage());
        }
    }
}

