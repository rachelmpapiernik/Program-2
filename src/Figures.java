import java.util.Scanner;

public class Figures {
	
	public static void main(String[] args) {
		
		System.out.println("Programming Fundamentals");
		System.out.println("Summer 2020");
		System.out.println("Name: Rachel Papiernik");
		System.out.println("PROGRAMMING ASSIGNMENT 2 \n");

		// Declaration of variables
		int size, choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the size of the figure(odd number):");
		size = scan.nextInt();
		while (size % 2 == 0) {
			System.out.println("\nInvalid figure size-must be an odd number");
			System.out.println("\nEnter the size of the figure:");
			size = scan.nextInt();

		}
		do {
			System.out.println("\nMENU: \n1.Print Box \n2.Print diamond \n3.Print X \n4.Quit Program");
			System.out.println("\n Please select an option:");
			choise = scan.nextInt();
			switch (choise) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printx(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Invalid option");
				scan.close();
			}

		} while (choise != 4);

	}

	// Method to print the box
	static void printBox(int size) {
		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	// Method to print the diamond
	static void printDiamond(int size) {
		int i, j, mid;
		size = size + 1;
		mid = (size / 2);
		for (i = 1; i <= mid; i++) {
			for (j = 1; j <= (mid - i); j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
		for (i = mid + 1; i < size; i++) {
			for (j = 1; j <= i - mid; j++) {
				System.out.print(" ");
			}
			if (i == size - 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * (size - i) - 3; j++) {

					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	// Method to print the X
	static void printx(int size) {
		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size; j++) {
				if (j == i) {
					System.out.print("X");
				} else if (j == size - (i - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
	}

	// Method to quit
	static void quit() {
		System.out.println("\nGood bye!");
		System.exit(0);
		
	}
}