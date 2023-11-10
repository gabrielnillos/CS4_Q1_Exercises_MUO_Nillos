package ex04_muo_nillosgp;

/**
 * @author Gabriel Nillos
 */

import java.util.Scanner;
//import java.util.Random;

public class RockPaperScissors{
    
    public static void main(String[] args){
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");
		
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
		
        int roundsToWin = 2;
        int option;
        int playerMoveNum;
        int computerMoveNum;
        Move computerMove = null;
        Move playerMove = null;
        int winNum;
        int computerWins;
        int playerWins;
        int roundNumber;
        
        Scanner sc = new Scanner(System.in);
        //Random randomNum = new Random();
        
        
        for(int i = 0; i < 100; i++){
            i--;
            
            computerWins = 0;
            playerWins = 0;
            roundNumber = 0;
            
            System.out.print("Welcome to Rock, Paper, Scissors. Please choose an option:\n1. Start game\n2. Change number of rounds\n3. Exit application\n> ");
            option = sc.nextInt();
            
            if (option == 1){
                System.out.println("\nThis match will be first to win " + roundsToWin + " wins.\n");
                for(int j = 0; j != roundsToWin; j++){
                    if (roundsToWin - j == 1) {
                        System.out.println("\n>>> Final Round <<<");
                        System.out.println("===================\n");
                    }
                    
                    else {
                        roundNumber = roundNumber + 1;
                        System.out.println("\n>>> Round "  + roundNumber + " <<<");
                        System.out.println("===============\n");
                    }
                    
                    computerMoveNum = (int) Math.floor(Math.random()*3) + 1;
                
                    System.out.print("The computer has selected its move. Select your move:\n1. Rock\n2. Paper\n3. Scissors\n> ");
                    playerMoveNum = sc.nextInt();
                
                    switch(computerMoveNum){
                        case 1 -> computerMove = rock;
                        case 2 -> computerMove = paper;
                        case 3 -> computerMove = scissors;
                    }
                
                    switch(playerMoveNum){
                        case 1 -> playerMove = rock;
                        case 2 -> playerMove = paper;
                        case 3 -> playerMove = scissors;
                    }
                
                winNum = Move.compareMoves(computerMove, playerMove);
                
                    switch (winNum) {
                        case 0 -> {
                            computerWins++;
                            System.out.println("\nComputer: " + computerMove.getName() + "            Player: " + playerMove.getName() + "\n\nScores: " + computerWins + " - " + playerWins + "\n");
                        }
                        case 1 -> {
                            playerWins++;
                            System.out.println("\nComputer: " + computerMove.getName() + "            Player: " + playerMove.getName() + "\n\nScores: " + computerWins + " - " + playerWins + "\n");
                        }
                    default -> System.out.println("\nComputer: " + computerMove.getName() + "            Player: " + playerMove.getName() + "\n\nScores: " + computerWins + " - " + playerWins + "\n");
                    }
                
                }
                
                if (computerWins > playerWins){
                System.out.println("Computer Wins!\n");}
                else if (computerWins < playerWins){
                System.out.println("Player Wins!\n");}
                else {
                System.out.println("Tied!\n");}
            }
            
            
            else if (option == 2){
                 System.out.print("\nHow many wins are needed to win a match?\n> ");
                 roundsToWin = sc.nextInt();
                 System.out.println("\nNew setting has been saved!\n");
            }
            
            
            else if (option == 3){
                System.out.println("\nThank you for playing!\n");
                break;
            }
            
            
            else {System.out.println("Choose a number from 1 to 3");}
            
            
        }
                
		
		
	}
}