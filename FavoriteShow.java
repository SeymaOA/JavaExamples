/* Program that: Reads the name of the user's favorite show, asks number of seasons, asks number of episodes, 
ask average mins. in each episodes,
 asks how many episodes user watched, calculates watched episodes, 
 calculates remaining hours to finish tv show, Outputs appropriate messages 
*/

import java.util.Scanner;

public class FavoriteShow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String favShow;  // user's favorite show name
      int totalSeasons; // total seasons of the tv show
      
      int totalEpisodes; // Total number of episodes in each season
      double averageLength;  // Average minutes of on each episode
      
      int watchedEpisodes;
      
      double watchedHours;
      double remaining;
      double totalHours;
      
      
      System.out.println("Enter your favorite tv show's name: ");
      favShow = scnr.nextLine();
      System.out.println("I'm glad " + favShow + " is your favorite tv show!");
      System.out.println();
      
      System.out.println("Enter total number of seasons in " + favShow + ":");
      totalSeasons = scnr.nextInt();
     
      
      System.out.println("Enter total number of episodes in each season: ");
      totalEpisodes = scnr.nextInt();
      System.out.println();
      
      System.out.println("Enter average minutes in each episode: ");
      averageLength = scnr.nextDouble();
      System.out.println();
      
      System.out.println("How many episodes you watched total?: ");
      watchedEpisodes = scnr.nextInt();
      
      watchedHours = (averageLength / 60)  * watchedEpisodes;
      
      totalHours = (totalSeasons * totalEpisodes * averageLength) / 60.0;
      
      remaining = totalHours - watchedHours;
      
      
      System.out.printf("You have watched total %.1f hours of your favorite tv show.\n", watchedHours);
      System.out.printf("You have remaining %.1f hours to finish this tv show.", remaining);

   }
}

