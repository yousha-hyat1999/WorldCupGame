// ---------------------------------------------------------------
// Assignment 3 
// Written by: Yousha Hyatoolla; Student ID: 40099559
// For COMP 248	Section EE - Fall 2018
// ---------------------------------------------------------------

//********************Question 1*************************************

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat; // to deal with the rounding of numbers.
public class Assignment3question1 {
	
	public static void main(String args[]) {
		
		String[] teams16 = {"Uruguay",  "Portugal", "France", "Argentina", "Brazil", "Mexico",
				"Belgium", "Japan", "Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland",
				"Colombia", "England"};
		
		int match[][]=new int[20][15]; //2D array for the scores of each match in each tournament.
		double sum1=0;
		DecimalFormat ummm=new DecimalFormat("0.0");// to deal with the rounding of numbers	
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter your favourite team: "); // the user inputs his/her favourite team.
		String team=keyboard.next();
// if the user's team is not part of the round of 16, the following message will be displayed.		
		if (team.compareToIgnoreCase(teams16[0])!=0 && team.compareToIgnoreCase(teams16[1])!=0
				&& team.compareToIgnoreCase(teams16[2])!=0 && team.compareToIgnoreCase(teams16[3])!=0
				&& team.compareToIgnoreCase(teams16[4])!=0 && team.compareToIgnoreCase(teams16[5])!=0
				&& team.compareToIgnoreCase(teams16[6])!=0 && team.compareToIgnoreCase(teams16[7])!=0
				&& team.compareToIgnoreCase(teams16[8])!=0 && team.compareToIgnoreCase(teams16[9])!=0
				&& team.compareToIgnoreCase(teams16[10])!=0 && team.compareToIgnoreCase(teams16[11])!=0
				&& team.compareToIgnoreCase(teams16[12])!=0 && team.compareToIgnoreCase(teams16[13])!=0
				&& team.compareToIgnoreCase(teams16[14])!=0 && team.compareToIgnoreCase(teams16[15])!=0) 
			
			System.out.print("Your team is not in the Round of 16");
		else { // if the user's team is part of the round of 16, the following commands will take place(i.e the tournament will begin.
			int tournament=0; // tournament counter.
			String winner = null;
			
			do { //this do-while loop will make sure that the number of tournaments is at-most 20 and will make sure that it stops if the user's favourite team wins.
				
				
			Random ranScore= new Random();
			//arrays to store the randomly generated scores per team in each match 
			int score[]=new int[16]; // for round of 16
			int score8[]=new int[8]; // for quarter-finals
			int score4[]=new int[4]; //for semi-finals
			int score2[]=new int[2]; //for the final
			// array to store the winners of each match
			String teams8[] = new String[8];// for round of 16
			String teams4[]= new String[4];// for quater-finals
			String teams2[]=new String[2];//for semi-finals
			
			
			
			System.out.println("\nRound of 16 results: ");
			
			for (int i=0, j = 0;i<16;i +=2, j++) // this for loop deals with the round of 16.
			{   //generating random scores for each team per match which will then be stored in the appropriate array.
				score[i]=ranScore.nextInt(5);
				score[i+1]=ranScore.nextInt(5);
				System.out.print("[ "+teams16[i]+" "+score[i]+":"+score[i+1]+" "+teams16[i+1]+" ]");
				// makes sure that the winner is always picked to advance.
				if(score[i] > score[i+1]) {
					teams8[j] = teams16[i];
				}else if (score[i]<score[i+1]){
					teams8[j] = teams16[i+1];
				}else {
					do { //makes sure that there is always a winner in case of a draw.
						int SCORE1=ranScore.nextInt(5);
						int SCORE2=ranScore.nextInt(5);
						score[i]=SCORE1;
						score[i+1]=SCORE2;
						if(score[i] > score[i+1]) {
							teams8[j] = teams16[i];
						}else if (score[i]<score[i+1]){
							teams8[j] = teams16[i+1];}
						
					}while (score[i]==score[i+1]);
					
				}
				match[tournament][j]=score[i]+score[i+1]; //storing the scores per match in this round per tournament.
				
				}
			System.out.println("\n\nQuarter-finals results: "); 
				
			for (int i=0, j = 0;i<8;i +=2, j++)//this for-loop deals with the quarter-finals.
			{ //generating random scores for each team per match which will then be stored in the appropriate array.
				score8[i]=ranScore.nextInt(5);
				score8[i+1]=ranScore.nextInt(5);
				System.out.print("[ "+teams8[i]+" "+score8[i]+":"+score8[i+1]+" "+teams8[i+1]+" ]");
				// makes sure that the winner is always picked to advance.
				if(score8[i] > score8[i+1]) {
					teams4[j] = teams8[i];
				}else if (score8[i]<score8[i+1]){
					teams4[j] = teams8[i+1];
				}else {
					do {//makes sure that there is always a winner in case of a draw.
						int SCORE1=ranScore.nextInt(5);
						int SCORE2=ranScore.nextInt(5);
						score8[i]=SCORE1;
						score8[i+1]=SCORE2;
						if(score8[i] > score8[i+1]) {
							teams4[j] = teams8[i];
						}else if (score8[i]<score8[i+1]){
							teams4[j] = teams8[i+1];}
						
					}while (score8[i]==score8[i+1]);
					
				}
				match[tournament][j+8]=score8[i]+score8[i+1];//storing the scores per match in this round per tournament.
				
			}
			System.out.println("\n\nSemi-finals results: ");
			
			for (int i=0,j=0;i<4;i+=2,j++)// this for-loop deals with the semi-finals.
			{//generating random scores for each team per match which will then be stored in the appropriate array.
				score4[i]=ranScore.nextInt(5);
				score4[i+1]=ranScore.nextInt(5);
				System.out.print("[ "+teams4[i]+" "+score4[i]+":"+score4[i+1]+" "+teams4[i+1]+" ]");
				// makes sure that the winner is always picked to advance.
				if(score4[i] > score4[i+1]) {
					teams2[j] = teams4[i];
				}else if (score4[i]<score[i+1]){
					teams2[j] = teams4[i+1];
				}else {
					do {//makes sure that there is always a winner in case of a draw.
						int SCORE1=ranScore.nextInt(5);
						int SCORE2=ranScore.nextInt(5);
						score4[i]=SCORE1;
						score4[i+1]=SCORE2;
						if(score4[i] > score4[i+1]) {
							teams2[j] = teams4[i];
						}else if (score4[i]<score4[i+1]){
							teams2[j] = teams4[i+1];}
						
					}while (score4[i]==score4[i+1]);
					
				}
				match[tournament][j+12]=score4[i]+score4[i+1];//storing the scores per match in this round per tournament.
			}
			System.out.println("\n\nThe Final result: ");
			
			for (int i=0,j=0;i<2;i+=2,j++)// this for=loop deals with the final.
			{//generating random scores for each team per match which will then be stored in the appropriate array.
				score2[i]=ranScore.nextInt(5);
				score2[i+1]=ranScore.nextInt(5);
				System.out.print("[ "+teams2[i]+" "+score2[i]+":"+score2[i+1]+" "+teams2[i+1]+" ]");
				//Making sure that the winner of the tournament is chosen.
				if (score2[i]>score2[i+1]) {
					winner=teams2[i];
					System.out.println("\n\nTournament "+tournament+" : The winner is "+winner+".");
					
					}
				else if (score2[i]<score2[i+1]){
					winner=teams2[i+1];
					System.out.println("\n\nTournament "+tournament+" : "+"The winner is "+winner+".");
					
				}
				else {
					do {//Making sure there is a winner in case of a draw.
						int SCORE1=ranScore.nextInt(5);
						int SCORE2=ranScore.nextInt(5);
						score2[i]=SCORE1;
						score2[i+1]=SCORE2;
						if (score2[i]>score2[i+1]) {
							winner=teams2[i];
							System.out.println("\n\nTournament "+tournament+" : "+"After extra time, the winner is "+winner+".");
							
							}
						else if (score2[i]<score2[i+1]){
							winner=teams2[i+1];
							System.out.println("\n\nTournament "+tournament+" : "+"After extra time, the winner is "+winner+".");
							
						}
						
					}while (score2[i]==score2[i+1]);
				}
				match[tournament][j+14]=score2[i]+score2[i+1]; // making sure that the total score of the final is stored in the 2D array.
			}
			
			tournament++; //after every tournament, the variable tournament is incremented by 1.
			
			}while (tournament<20 && winner.compareToIgnoreCase(team)!=0);
			// end of tournament's loop.
			//displaying after how many tournaments the user's favourite team won.
			if (winner.compareToIgnoreCase(team)==0) 
				System.out.println("\n\nIt took "+(tournament)+ " tournament(s) for "+team+" to win.");
			//if the user's team did not win in 20 tournaments, the following message will be displayed.	
				else
					System.out.println("\n\nSorry, "+team+" did not win in 20 tournaments.");
			
			System.out.print("\n\nGOAL STATS");
			
			
			for (int t=0;t<20;t++) { // this for-loop is for the printing of the total scores of every match per tournament(deals with the tournament counter).
				double sum=0;
				System.out.print("\n\n[Tournament "+t+"] [Total goals: ");
			{
			for (int w=0;w<14;w++) {// this for-loop is for the printing of the total scores of every match per tournament(deals with the number of matches(15) per tournament).
				System.out.print(+match[t][w]+",");
				sum=sum+match[t][w];}
			}
			System.out.print(match[t][14]+"]");// outside the loop so that it doesn't print a comma after the digit is printed.
			sum=sum+match[t][14];
			
			double average=sum/15;//calculating the average of goals of every tournament.
			System.out.print(" [Average: "+ummm.format(average)+"]");
			sum1=sum1+average; //adding up all the averages in the tournament.
			
			
			if ((tournament-1)==t)
				break;
			}	
			double average1=sum1/(tournament); //calculating the overall average of all score averages 
			System.out.print("\n\nAverage goals for "+tournament+" tournament(s): "+ummm.format(average1));
			int aboveAve=0;
		// printing all matches in which the number of goals scored is above the overall average(average1)	
			for (int t=0;t<tournament;t++) {
				for (int w=0;w<15;w++) {
				if (match[t][w]>average1)
					aboveAve++;}
				}	
			System.out.print("\nTotal matches in all tournaments over the average goal value: "+aboveAve);
			
	}
		
		keyboard.close();

	}
}
//**************************************************END OF THE PROGRAM*******************************************************************************
