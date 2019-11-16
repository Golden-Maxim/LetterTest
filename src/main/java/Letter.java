import java.util.Random;
import java.util.Scanner;

public class Letter {


// just for see alphabet
//{"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"}


        public static char computerLetter(){
            Random rnd = new Random();
            return (char)(rnd.nextInt((90 - 65) + 1) + 65);
        }

        public static boolean checkLengthString(String inputString){
            if(inputString.length() > 1) {
                System.out.println("Error! String has more than one letter!");
                return false;
            } else {
                return true;
            }
        }

        public static boolean checkLatinLetter(char letter){
            return (int)letter < 65 || (int)letter > 90;
        }

        public static boolean compareLetter(int a , int b)
        {
            if(a == b){
                System.out.println("YOU WON!!!");
                return true;
            }
            else
            {
                System.out.println("Try again!");
                return false;
            }
        }

        public static boolean lowHightLetter(int a , int b)
        {
            if(a > b){
                System.out.println("Too high!");
                return true;
            }
            else
            {
                System.out.println("Too low!");
                return false;
            }
        }

        public static void messageStartGame()
        {
            System.out.println("Game Guess the letter");
            System.out.println("Please enter the letter: ");
        }

        public static void messageWrongAlphabet()
        {
            System.out.println("Please to get acquainted with the " +
                    "rule of the game, it's not a symbol of Latin " +
                    "alphabet, enter symbol one more times");
        }


        public static void main(String[] args) {

            int triesCount = 0;
            char userLetter;
            String inputString = "";

            char compLetter = computerLetter();
            messageStartGame();

            Scanner scanner = new Scanner(System.in);

            do {
                triesCount++;

                inputString = scanner.next();
                userLetter = inputString.charAt(0);

                if(!checkLengthString(inputString)){
                    continue;
                }

                userLetter = Character.toUpperCase(userLetter);

                if(checkLatinLetter(userLetter)){
                    messageWrongAlphabet();
                    continue;
                }

                compareLetter((int)userLetter,(int)compLetter);
                lowHightLetter((int)userLetter,(int)compLetter);

            } while (userLetter != compLetter);

            System.out.println("Count of trys:" + triesCount);

        }
    }


