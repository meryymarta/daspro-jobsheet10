import java.util.Scanner;
public class AssignmentSurveyCompany12 {
    public static void main(String[] args) {
        int respondent = 10;
        int question = 6;
        int[][]surveyResult = new int[10][6];
    
        Scanner input12 = new Scanner(System.in);

        for(int i = 0; i < respondent; i++) {
            System.out.println("Input respon for respondent " + (i+1) + "(1-5):");
            for (int j = 0; j < question; j++){
                int response;
                System.out.print("Question " + (j + 1) + ": ");
                response = input12.nextInt();
              while(response < 1 || response > 5) {
                    System.out.println("Input not valid. Input number between 1 and 5");
                    response = input12.nextInt(); 
                }
                    surveyResult[i][j] = response;
            }
        }
                // display survey
                System.out.println("display Survey");
                for(int i = 0; i < 10; i++) {
                    System.out.print("Responden " + (i + 1) + ": ");
                    for (int j = 0; j < 6; j++){
                        System.out.print(surveyResult[i][j] + " ");
                    }
                    System.out.println();
                }
            
            // Average Per Respondent
            System.out.println("Average for each respondent");
                for(int i = 0; i < 10; i++) {
                    double sum = 0;
                    for (int j = 0; j < 6; j++) {
                        sum += surveyResult[i][j];

                    }
                    double  average = sum / surveyResult[i].length;
                    System.out.printf("Responden %d: %.2f%n", (i + 1), average);

                    }
                   
                   // Average Per Question
                    System.out.println("Average for each question:");
                    for(int j = 0; j < 6; j++) {
                        double sum = 0;
                        for(int i = 0; i < 10; i++) {
                            sum += surveyResult[i][j];
                        }
                        double average = sum / 10;
                        System.out.printf("Question %d: %.2f%n", (j + 1), average);
                    }
                   
                   //Overall Average
                    double totalSum = 0;
                    for(int i = 0; i < 10; i++) {
                        for(int j = 0; j < 6; j++) {
                            totalSum += surveyResult[i][j];
                            
                        }
                    }
                    double overallAverage = totalSum / (10 * 6 );
                    System.out.printf("overall average: %.2f%n", overallAverage);
                   }
            }
    

        
        
        
             
           
    

