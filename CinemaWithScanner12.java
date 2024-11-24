import java.util.Scanner;
public class CinemaWithScanner12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int row, column;
        String name, next;
        int menu;

        String[][] audience = new String[4][2];

        do {
            System.out.println("CINEMA MENU");
            System.out.println("Menu 1: Input Audience Data");
            System.out.println("Menu 2: Show Audience Data ");
            System.out.println("Menu 3: Exit");
            System.out.print("Enter your menu choices: ");
            menu = input12.nextInt();
            input12.nextLine();
        
        if (menu == 1) {
            while (true) {
            System.out.print("Enter a name: ");
            name = input12.nextLine();

            System.out.print("Enter row number (1-4): ");
            row = input12.nextInt();
            if (row < 1 || row > 4 ){
            
            System.out.println("row number not availabe. enter number between 1 - 4 "); 
            break; 
        }
            System.out.print("Enter column number(1-2): ");
            column = input12.nextInt();
            if (column < 1 || column > 2) {
                System.out.println("column number not available. enter number between 1 - 2" );
                break;  
            }
            
            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audience to be added? (y/n): ");
            next = input12.nextLine();

            if (next.equalsIgnoreCase( "n")) {
                break;
            }
        }}
    
     else if (menu == 2) {
        System.out.println("Audience list");
        for (int i = 0; i < audience.length; i++) {
            for(int j = 0; j < audience[i].length; j++) {

        if (audience[i][j] == null) {
            System.out.print(" ");

            } else{ 
                System.out.print(audience[i][j] + "\t");
            }
        }
        System.out.println();
    }
    }  else if (menu == 3)  {
        System.out.println("exiting program");
    }    else {
        System.out.println("Invalid choice. Please try again!");
    }
    } while (menu != 3);

        }
    }

    
    
        
    
    

