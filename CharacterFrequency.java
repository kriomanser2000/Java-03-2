import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line: ");
        String input = scanner.nextLine();
        scanner.close();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : input.toCharArray())
        {
            if (charCountMap.containsKey(ch))
            {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            }
            else
            {
                charCountMap.put(ch, 1);
            }
        }
        System.out.println("Number of occurrences of each character: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
