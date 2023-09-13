import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(0, 3);
        System.out.print("Enter your move(Stone/Paper/Scissor):");
        String move = scan.next();
        if ((move.equalsIgnoreCase("stone")) || (move.equalsIgnoreCase("paper"))
                || (move.equalsIgnoreCase("scissor"))) {
            if ((move.equalsIgnoreCase("stone"))) {
                switch (x) {
                    case (0): {
                        System.out.print("Computer: Stone\nMatch draw.");
                        break;
                    }
                    case (1): {
                        System.out.print("Computer: Paper\nYou Lost.");
                        break;
                    }
                    case (2): {
                        System.out.print("Computer: Scissor\nYou won.");
                        break;
                    }
                }
            } else if ((move.equalsIgnoreCase("paper"))) {
                switch (x) {
                    case (0): {
                        System.out.print("Computer: Stone\nYou lost.");
                        break;
                    }
                    case (1): {
                        System.out.print("Computer: Paper\nMatch draw.");
                        break;
                    }
                    case (2): {
                        System.out.print("Computer: Scissor\nYou lost.");
                        break;
                    }
                }
            } else if ((move.equalsIgnoreCase("scissor"))) {
                switch (x) {
                    case (0): {
                        System.out.print("Computer: Stone\nYou lost.");
                        break;
                    }
                    case (1): {
                        System.out.print("Computer: Paper\nYou won.");
                        break;
                    }
                    case (2): {
                        System.out.print("Computer: Scissor\nMatch draw.");
                        break;
                    }
                }
            }
        } else {
            System.out.print("Invalid move.");
        }
        scan.close();
    }
}
