import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordcount1 {

    public static void main(String[] args) {
        String fileName = "example2.txt";
        String downloadsPath = System.getProperty("user.home") + "/Downloads/";
        String filePath = downloadsPath + fileName;

        try {
            String content = readTextFile(filePath);
            int wordCount = countWords(content);
            double averageWordLength = calculateAverageWordLength(content);
            System.out.println("Word Count: " + wordCount);
            System.out.println("Average Word Length: " + averageWordLength);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static double calculateAverageWordLength(String text) {
        String[] words = text.split("\\s+");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (double) totalLength / words.length;
    }
}