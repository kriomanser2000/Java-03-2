import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputTxt = scanner.nextLine();
        String[] words = inputTxt.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        for(String word : words)
        {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Unique words: ");
        for(String word : uniqueWords)
        {
            System.out.println(word);
        }
        scanner.close();
    }
}
