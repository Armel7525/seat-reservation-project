package com.cognixia.jump.seatresevation;

import java.util.Scanner;

public class SeatReservation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char grid[][] = { 
				{ 'o', 'o', 'o', 'o', 'o' }, 
				{ 'o', 'o', 'o', 'o', 'o' }, 
				{ 'o', 'o', 'o', 'o', 'o' },
				{ 'o', 'o', 'o', 'o', 'o' }, 
				{ 'o', 'o', 'o', 'o', 'o' } 
				};

		System.out.println("Welcome!");
		System.out.println("\n===================");
		System.out.println("SEATS RESEVERVATION");
		System.out.println("===================\n");

		for (int row = 0; row < grid.length; row++) {

			for (int col = 0; col < grid[row].length; col++) {

				System.out.print(grid[row][col] + " ");
			}

			System.out.println();
		}

		while (true) {

			System.out.println("\nWhich seat do you want to reserve?");
			System.out.println("Row:");
			int x = sc.nextInt();
			System.out.println("Column:");
			int y = sc.nextInt();

			String storedInput = sc.nextLine();
			System.out.println("Name of person sitting here:" + storedInput);
			sc.nextLine();

			System.out.println();
			System.out.println("=================");
			System.out.println("SEATS RESEVERED");
			System.out.println("=================\n");

			if (x > 0 && y > 0) {

				int res = grid[x][y];

				for (int row = 0; row < grid.length; row++) {
					for (int col = 0; col < grid[row].length; col++) {
						grid[x][y] = 'x';
						System.out.print(grid[row][col] + " ");

					}

					System.out.println();

				}
				
				if (res == grid[x][y]) {
					System.out.println("\nSEAT ALREADY RESERVED");
				
				}
			}

			System.out.println("\nAre you finished reserving seats? (y/n)");
			char yn = sc.next().charAt(0);

			// if (grid[x][y] == 'x') {

			// System.out.println("SEAT ALREADY RESERVED");

			// }

			if (yn == 'n' /* && grid[x][y]== 'x' */) {
				continue;
			}

			if (yn == 'y') {

				System.out.println("Ok. Enjoy the movies!");
				break;
			}
			
			sc.close();
			
		}
	}
}
