import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the survey about music preferences!");
		System.out.println("Which music genre do you prefer?");
		System.out.println("1. Rock");
		System.out.println("2. Pop");
		System.out.println("3. Hip-hop");
		System.out.println("4. Classical music");

		int musicChoice = scanner.nextInt();

		if (musicChoice >= 1 && musicChoice <= 4) {
			switch (musicChoice) {
				case 1:
					System.out.println("You prefer rock music. That's great!");
					break;
				case 2:
					System.out.println("You prefer pop music. Wonderful choice!");
					break;
				case 3:
					System.out.println("You prefer hip-hop music. Excellent!");
					break;
				case 4:
					System.out.println("You prefer classical music. Fantastic!");
					break;
			}
		} else {
			System.out.println("Please select a number from 1 to 4 to answer the question.");
		}

		System.out.println("How often do you listen to music?");
		System.out.println("1. Daily");
		System.out.println("2. Once a week");
		System.out.println("3. Once a month");
		System.out.println("4. Almost never");

		int listeningFrequency = scanner.nextInt();

		if (listeningFrequency >= 1 && listeningFrequency <= 4) {
			switch (listeningFrequency) {
				case 1:
					System.out.println("You listen to music daily. That's great!");
					break;
				case 2:
					System.out.println("You listen to music once a week. Wonderful!");
					break;
				case 3:
					System.out.println("You listen to music once a month. Excellent!");
					break;
				case 4:
					System.out.println("You almost never listen to music. I understand.");
					break;
			}
		} else {
			System.out.println("Please select a number from 1 to 4 to answer the question.");
		}

		System.out.println("Who is your biggest musical inspiration?");
		System.out.println("1. The Beatles");
		System.out.println("2. Madonna");
		System.out.println("3. Eminem");
		System.out.println("4. Beethoven");

		int musicalInspiration = scanner.nextInt();

		if (musicalInspiration >= 1 && musicalInspiration <= 4) {
			switch (musicalInspiration) {
				case 1:
					System.out.println("The Beatles - a great choice!");
					break;
				case 2:
					System.out.println("Madonna - a wonderful artist!");
					break;
				case 3:
					System.out.println("Eminem - an excellent hip-hop artist!");
					break;
				case 4:
					System.out.println("Beethoven - a brilliant composer!");
					break;
			}
		} else {
			System.out.println("Please select a number from 1 to 4 to answer the question.");
		}

		System.out.println("Which musical era do you prefer?");
		System.out.println("1. 1960s");
		System.out.println("2. 1980s");
		System.out.println("3. 2000s");
		System.out.println("4. 1800s");

		int musicalEra = scanner.nextInt();

		if (musicalEra >= 1 && musicalEra <= 4) {
			switch (musicalEra) {
				case 1:
					System.out.println("You prefer music from the 1960s. That's classic!");
					break;
				case 2:
					System.out.println("You prefer music from the 1980s. Wonderful choice!");
					break;
				case 3:
					System.out.println("You prefer music from the 2000s. Great!");
					break;
				case 4:
					System.out.println("You prefer music from the 1800s. Impressive!");
					break;
			}
		} else {
			System.out.println("Please select a number from 1 to 4 to answer the question.");
		}

		scanner.close();
	}
}