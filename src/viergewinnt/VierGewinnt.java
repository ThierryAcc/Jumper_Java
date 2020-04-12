package viergewinnt;
import java.util.Scanner;

public class VierGewinnt {

	static final String WON = "Du hast gewonnen";
	static final String ENEMYWON = "Gegner hat gewonnen";

	static int countSpieler = 0;
	static int countGegner = 0;
	static final int X = 6;
	static final int Y = 7;
	static int[][] spielfeld = new int[X][Y];
	static boolean spieler;
	static boolean running = true;
	static int gegnerwert = 3;
	static int spielerwert = 1;

	public static void main(String[] args) {
		printSpielfeld();
		spielen();
	}

	public static void spielen() {
		Scanner s = new Scanner(System.in);

		while (running) {
			System.out.println("In welches y möchtest du deine Münze legen (0-6) ?");

			int y = 1000;
			try {
				y = Integer.valueOf(s.nextLine());
			} catch (Exception e) {
				System.out.println(e);
			}

			while (!(y == 0 || y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6)) {
				System.out.println("Please type a number between 0 and 6");
				try {
					y = Integer.valueOf(s.nextLine());
				} catch (Exception e) {
					System.out.println(e);
				}
			}

			while (spielfeld[0][y] != 0) {
				System.out.println("Das Feld ist voll, bitte ein anderes y wählen");
				try {
					y = Integer.valueOf(s.nextLine());
				} catch (Exception e) {
					System.out.println(e);
				}
			}

			// MÜNZE LEGEN
			zug(y);

			spieler = !spieler;

			printSpielfeld();
		}

		s.close();
	}

	public static void zug(int y) {
		for (int i = X - 1; i >= 0; i--) {
			if (spielfeld[i][y] == 0) {
				if (spieler) {
					spielfeld[i][y] = gegnerwert;
				} else {
					spielfeld[i][y] = spielerwert;
				}

				siegesCheck(i, y);

				System.out.println("MÜNZE GESETZT BEI spielfeld[" + i + "]" + "[" + y + "]");
				break;
			}

		}
	}

	// links oben nach rechts unten
	public static void diagonalLORU(int x, int y) {
		countSpieler = 0;
		countGegner = 0;

		for (int i = 0; (x + i < 6) && (y + i < 7); i++) {
			int x2 = (x + i);
			int y2 = (y + i);
			if (spielfeld[x2][y2] == spielerwert) {
				System.out.println("[" + x2 + "]" + "[" + y2 + "]");
				countSpieler++;
				System.out.println("Addition: " + countSpieler);
			} else if (spielfeld[x2][y2] == gegnerwert) {
				System.out.println("[" + x2 + "]" + "[" + y2 + "]");
				countGegner++;
				System.out.println("Addition: " + countGegner);
			}
			else {
				break;
			}
		}

		for (int i = 1; (x - i > 0) && (y - i > 0); i++) {
			int x2 = (x - i);
			int y2 = (y - i);
			if (spielfeld[x2][y2] == spielerwert) {
				countSpieler++;
			} else if (spielfeld[x2][y2] == gegnerwert) {
				countGegner++;
			} else {
				break;
			}
		}

		gewonnen(countSpieler, WON);
		gewonnen(countGegner, ENEMYWON);
	}

	// links unten nach rechts oben
	public static void diagonalLURO(int x, int y) {
		countSpieler = 0;
		countGegner = 0;

		for (int i = 0; (x - i > 0) && (y + i < 7); i++) {
			int x2 = (x - i);
			int y2 = (y + i);
			if (spielfeld[x2][y2] == spielerwert) {
				countSpieler++;
			} else if (spielfeld[x2][y2] == gegnerwert) {
				countGegner++;
			} else {
				break;
			}
		}

		for (int i = 0; (x + i < 6) && (y - i > 0); i++) {
			int x2 = (x + i);
			int y2 = (y - i);
			if (spielfeld[x2][y2] == spielerwert) {
				countSpieler++;
			} else if (spielfeld[x2][y2] == gegnerwert) {
				countGegner++;
			} else {
				break;
			}
		}

		gewonnen(countSpieler, WON);
		gewonnen(countGegner, ENEMYWON);
	}

	// vertikal
	public static void vertikal() {
		for (int i = 0; i < Y; i++) {
			countSpieler = 0;
			countGegner = 0;
			for (int j = 0; j < X; j++) {
				if (spielfeld[j][i] == spielerwert) {
					countSpieler++;
					gewonnen(countSpieler, WON);
				} else {
					countSpieler = 0;
				}
				if (spielfeld[j][i] == gegnerwert) {
					countGegner++;
					gewonnen(countGegner, ENEMYWON);

				} else {
					countGegner = 0;
				}
			}
		}
	}

	// horizontal
	public static void horizontal() {
		for (int i = 0; i < X; i++) {
			countSpieler = 0;
			countGegner = 0;
			for (int j = 0; j < Y; j++) {
				if (spielfeld[i][j] == spielerwert) {
					countSpieler++;
					gewonnen(countSpieler, WON);
				} else {
					countSpieler = 0;
				}
				if (spielfeld[i][j] == gegnerwert) {
					countGegner++;
					gewonnen(countGegner, ENEMYWON);

				} else {
					countGegner = 0;
				}
			}
		}
	}

	public static void siegesCheck(int x, int y) {
		System.out.println("Siegescheck\n-------------------");

		diagonalLORU(x, y);
		diagonalLURO(x, y);
		vertikal();
		horizontal();
	}

	public static void gewonnen(int countSpieler, String message) {
		if (countSpieler >= 4) {
			System.out.println(message);
			running = false;
		}
	}

	public static void printSpielfeld() {
		for (int i = 0; i < X; i++) {
			System.out.println();
			for (int j = 0; j < Y; j++) {
				System.out.print(spielfeld[i][j] + " ");
			}
		}
		System.out.println("\n");
	}
}
