import java.util.List;
import java.util.Scanner;

public class TestComposerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Composer App");
		Scanner scannerObj = null;
		try {
			System.out.println("\n");
			scannerObj = new Scanner(System.in); // Create a Scanner object
			MemComposerDao memComposerDao = new MemComposerDao();
			while (true) {
				displayMenu();
				String code = scannerObj.next();
				if (code.equalsIgnoreCase("4")) {
					System.out.println("\n");
					System.out.println("End of line...");
					break; // will exit the loop
				} else if(code.equalsIgnoreCase("1")){
					System.out.println("\n");
					System.out.println("--DISPLAYING COMPOSER--");
					List<Composer> composers = memComposerDao.findAll();
					for (Composer composer : composers) {
						System.out.println(composer.toString());
						System.out.println("\n");
					}
				} else if(code.equalsIgnoreCase("2")){
					System.out.println("\n");
					System.out.print("Enter an id: ");
					Integer id= scannerObj.nextInt();
					Composer composer = memComposerDao.findBy(id);
					System.out.println("\n");
					System.out.println("--DISPLAYING COMPOSER--");
					System.out.println(composer.toString());
					System.out.println("\n");
				} else if(code.equalsIgnoreCase("3")){
					System.out.print("Enter an id: ");
					Integer id = scannerObj.nextInt();
					System.out.print("Enter a name: ");
					String name = readString();
					System.out.print("Enter a genre: ");
					String genre = readString();
					memComposerDao.insert(new Composer(id, name, genre));
					System.out.println("\n");
				}
			}
		} finally {
			if (scannerObj != null)
				scannerObj.close();
		}
	}
	
	private static void displayMenu() {
		System.out.print("MENU OPTIONS\n  1. View Composers\n  2. Find Composers\n  3. Add Composers\n  4. Exit\n\nPlease choose an option: ");
	}
	
	private static String readString()
	{
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	} 

}
