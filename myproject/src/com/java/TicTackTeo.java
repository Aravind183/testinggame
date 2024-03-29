package com.java;
import java.util.Random;
import java.util.Scanner;


public class TicTackTeo {

	public static void main(String[] args) {
		
		
				Scanner scanner=new Scanner(System.in);
				
				char[][] board = {{' ',' ',' '},
						          {' ',' ',' '},
						          {' ',' ',' '}};
				
				printboard(board);
				
				while(true) {
				
				    playerTurn(board,scanner);
				    if (isGameFinished(board)){
				    	break;
				    }
				    printboard(board);
				
				    computerTurn(board);
				    if (isGameFinished(board)){
				    	break;
				    }
				    printboard(board);
				
				}
				scanner.close();
				//printboard(board);
				//scanner.close();
		}






			private static boolean isGameFinished(char[][] board) {
				if(hasContentWon(board,'x')) {
					printboard(board);
					System.out.println("player wins!");
					return true;
				}
				if(hasContentWon(board,'o')) {
					printboard(board);
					System.out.println("computer wins!");
					return true;
				
				}
						
						
				 
				for(int i=0;i<board.length;i++) {
					for(int j=0; j<board[i].length;j++) {
						if(board[i][j]==' ') {
							return false;
				}
			}
		}
				printboard(board);
				System.out.println("the game ended in tie!");
				return true;
				
			}






			private static boolean hasContentWon(char[][] board,char symbol) {
				if((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
				   (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
				   (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
						
				   (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
				   (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
				   (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
						
				   (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
				   (board[0][2] == symbol && board[1][1] == symbol && board[1][0] == symbol) )
					   
			
				        return true;
			
			return false;
		}






			private static void computerTurn(char[][] board) {
				Random rand = new Random();
				int computerMove;
				
				while(true) {
				     computerMove  = rand.nextInt(9) + 1;
				    if (isValidMove(board,Integer.toString(computerMove))) {
				    	break;
				    }
				}
				System.out.println("computer choice "+ computerMove);
				placeMove(board,Integer.toString(computerMove),'o');
			}
			
			
			


			private static boolean isValidMove  (char [][] board,String poisition) {
				switch(poisition) {
				case "1":
					return (board[0][0]==' ') ;
						
				case "2":
					return (board[0][1]==' ');
				case "3":
					return (board[0][2]==' ');
				case "4":
					return (board[1][0]==' ');
				case "5":
					return (board[1][1]==' ');
				case "6":
					return (board[1][2]==' ');
					
				case "7":
					return (board[2][0]==' ');
				case "8":
					return (board[2][1]==' ');
					
				case "9":
					return (board[2][2]==' ');
				
					default:
						return false;
					
				}
				
			}
				
				private static void playerTurn(char[][] board, Scanner scanner) {
					String userInput;
					
					
					
				
					while(true) {
				        System.out.println("where would you like to paly? (1-9)");
				
			            userInput = scanner.nextLine();
				        if (isValidMove(board,userInput)){
					        break;
				}else {
					 System.out.println(userInput + "is not a valid move.");
					
				}
			}
				placeMove(board, userInput,'x');
				
			}
				
				
				private static void placeMove(char[][] board, String poistion,char symbol) {
					switch(poistion) {
					case "1":
						board[0][0]=symbol;
						break;
					case "2":
						board[0][1]=symbol;
						break;
					case "3":
						board[0][2]=symbol;
						break;
					case "4":
						board[1][0]=symbol;
						break;
					case "5":
						board[1][1]=symbol;
						break;
					case "6":
						board[1][2]=symbol;
						break;
					case "7":
						board[2][0]=symbol;
						break;
					case "8":
						board[2][1]=symbol;
						break;
					case "9":
						board[2][2]=symbol;
						break;
						default:
							System.out.println(":(");
						
					}
				}

			
			private static void printboard(char[][] board) {
				System.out.println(board[0][0]+"|" + board[0][1] + "|"+ board[0][2]);
				System.out.println("-+-+-");
				System.out.println(board[1][0]+"|" + board[1][1] + "|"+ board[1][2]);
				System.out.println("-+-+-");
				System.out.println(board[2][0]+"|" + board[2][1] + "|"+ board[2][2]);
				System.out.println("-+-+-");
			}
			
		

	}


