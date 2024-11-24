import java.util.Scanner;
public class CinemaWithScanner12 {
    public static void main(String[] args) {
     Scanner input12 = new Scanner(System.in);
      int row, column;
      String name, next;

      String[][] audience = new String[4][2];

      while(true) {
        System.out.print("Enter a name: ");
        name = input12.nextLine();
        System.out.print("Enter row number: ");
        row = input12.nextInt();
        System.out.print("Enter column number: ");
        column = input12.nextInt();
        input12.nextLine();

        audience[row - 1][column - 1] = name;
        System.out.print("Are there any other audiences to be added? (y/n): ");
        next = input12.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }


      }

        
    }
    
}
