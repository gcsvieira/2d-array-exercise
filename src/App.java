import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de colunas e linhas: ");
        Integer[][] biArray = new Integer[scan.nextInt()][scan.nextInt()];
        scan.nextLine();

        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                biArray[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                System.out.print(" " + biArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------");

        System.out.print("Enter a number: ");
        outputNeighbors(biArray, scan.nextInt());
        scan.nextLine();

        scan.close();
    }

    public static void outputNeighbors(Integer[][] biArray, Integer number) {

        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray.length; j++) {
                if (biArray[i][j] == number) {
                    System.out.println("Position (" + i + "," + j + "):");
                    if (j > 0)
                        System.out.println("Left: " + biArray[i][j - 1]);

                    if (i > 0)
                        System.out.println("Up: " + biArray[i - 1][j]);

                    if (j < biArray[i].length - 1)
                        System.out.println("Right: " + biArray[i][j + 1]);

                    if (i < biArray.length - 1)
                        System.out.println("Down: " + biArray[i + 1][j]);

                }
            }

        }
    }
}