import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectory
{
    public static void main(String[] args)
    {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Sasa", "123-456-789");
        phoneBook.put("Sam", "987-654-321");
        phoneBook.put("Denis", "555-123-456");
        phoneBook.put("Roman", "444-555-666");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name for search number: ");
        String name = scanner.nextLine();
        String phoneNumber = phoneBook.get(name);
        if(phoneNumber != null)
        {
            System.out.println("Number phone: " + name + ": " + phoneNumber);
        }
        else
        {
            System.out.println("Guy name: " + name + " not found");
        }
        System.out.println("\nPhone book entries: ");
        for(String contactName : phoneBook.keySet())
        {
            System.out.println("Name: " + contactName + "Number: " + phoneBook.get(contactName));
        }
        scanner.close();
    }
}
