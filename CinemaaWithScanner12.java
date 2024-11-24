import java.util.Scanner;
public class CinemaaWithScanner12 {
    public static void main(String[] args) {
     
      int row, column;
      String name, next;
      int menu;

      String[][] audience = new String[4][2];
      Scanner input12 = new Scanner(System.in);

        while (true) {
        System.out.println("CINEMA MENU");
        System.out.println("Menu 1: Input audience data");
        System.out.println("Menu 2: show audience list");
        System.out.println("Menu 3: Exit");
        System.out.print("Enter your menu choices: ");
        menu = input12.nextInt();
        input12.nextLine();

        
        if(menu == 1) {
        System.out.print("Enter a name: " );
        name = input12.nextLine();
        System.out.print("Enter row number (1-4): ");
        row = input12.nextInt();
        System.out.print("Enter column number (1-2): ");
        column = input12.nextInt();
        input12.nextLine();

        if (row < 1 || row > 4 || column < 1 || column > 2) {
          System.out.println("The seat is not available");
        } else if (audience[row-1] [column-1] != null) {
          System.out.println("The seat is already occupied. chose another seat");
        } else {
        }
        audience[row - 1][column - 1] = name;
        System.out.print("Are there any other audiences to be added? (y/n): ");
        next = input12.nextLine();

        if (next.equalsIgnoreCase("n")) {
          System.out.println("Returning to main menu");
          continue;
        }
      
      }else if (menu == 2) {
        System.out.println("Seating arrangement:");
        for(int i = 0; i < audience.length; i++) {
          for(int j = 0; j < audience[i].length; j++) {
            System.out.print((audience[i][j] == null? "***" : audience[i][j]) + "\t");
          }
          System.out.println();
        }
      } else if (menu == 3) {
        System.out.println("Exiting program");
        break;
      } else {
        System.out.println("Invalid menu choice. Please try again!");
      }
      }
    }
  }
  

