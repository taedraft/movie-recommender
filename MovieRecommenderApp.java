import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MovieRecommenderApp
{


    //sorting
    public static List<String> BubbleSort(List<String> MoviesAL){ 
    boolean MoviesALChanged; 
    do { 
      MoviesALChanged = false; 
      for (int i = 0; i < MoviesAL.size() - 1; i++) { 
        if (MoviesAL.get(i).compareTo(MoviesAL.get(i + 1)) > 0) { 
          // swap movies[i] and movies[i + 1] 
          String temp = MoviesAL.get(i); 
          MoviesAL.set(i, MoviesAL.get(i + 1)); 
          MoviesAL.set(i + 1, temp); 
          MoviesALChanged = true; 
        } 
      } 
    } while (MoviesALChanged); 
  
    return MoviesAL;
   } 
    public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList MoviesAL = new ArrayList();
      String Name, phoneNum;
      String MovieCategory, MovieTitle;
      double Rating;
      
      
      ArrayList <String> ActionMovies = new ArrayList <>();
      ArrayList <String> RomanceMovies = new ArrayList <> ();
      ArrayList <String> FictionMovies = new ArrayList <> ();
      ArrayList <String> HorrorMovies = new ArrayList <> ();
      ArrayList <String> FamilyMovies = new ArrayList <> ();
      
      ActionMovies.add("Skyscrapper");
      ActionMovies.add("Venom");
      ActionMovies.add("The Hunger Game");
      ActionMovies.add("Peninsula");
      ActionMovies.add("Top Gun:Maverick");

      
      
      RomanceMovies.add("Emansipation");
      RomanceMovies.add("Greyhound");
      RomanceMovies.add("Hunt");
      
      
      FictionMovies.add("The Adam Project");
      FictionMovies.add("Lucy");
      FictionMovies.add("Transformers");
      FictionMovies.add("Pacific Rim");
      FictionMovies.add("Mute");
     
      
      HorrorMovies.add("The Conjuring");
      HorrorMovies.add("The Visit");
      HorrorMovies.add("Annebelle Comes Home");
      HorrorMovies.add("A Quiet Place");
      HorrorMovies.add("It");
      

      FamilyMovies.add("The Boss Baby");
      FamilyMovies.add("Corpse Bride");
      FamilyMovies.add("Cinderella");
      FamilyMovies.add("Sonic The Hedgehog");
      FamilyMovies.add("How To Train Your Dragon: The Hidden World");
            
      
      System.out.println("--------WELCOME TO MOVIE RECOMMENDER--------");
      
      System.out.println("Please Enter your name: ");
      Name = input.nextLine();
      
      System.out.println("Please enter your phone number: ");
      phoneNum = input.nextLine();
      
      System.out.println("Please choose your Movie category: ");
      
      System.out.println("\t\t-----MOVIE CATEGORY -----");
       System.out.println("\t\t[1] ACTION MOVIE");
       System.out.println("\t\t[2] ROMANCE MOVIE");
       System.out.println("\t\t[3] FICTION MOVIE");
       System.out.println("\t\t[4] HORROR MOVIE");
       System.out.println("\t\t[5] FAMILY MOVIE");
       System.out.println("\t\t-----------END-------------");
    
       //get user input
       System.out.println("Enter Movie Category (Action,Romance,Fiction,Horror,Family): ");
       MovieCategory = input.nextLine();
    
       //using switch statement, pass selected movie into 'MoviesAL'
       switch (MovieCategory)
       {
         case "Action":
            MoviesAL = ActionMovies;
            break;
            
         case "Romance":
            MoviesAL = RomanceMovies;
            break;
            
         case "Fiction":
            MoviesAL = FictionMovies;
            break;
            
          case "Horror":
            MoviesAL = HorrorMovies;
            break;
            
          case "Family":
            MoviesAL = FamilyMovies;
            break;
         default:
           System.out.println("NONE");

      }
      
      for(int i=0; i<MoviesAL.size(); i++)
      {
         System.out.println(MoviesAL.get(i));
      }

      BubbleSort(MoviesAL);
      System.out.println("\n****After Sorting****");
      for(int i=0; i<MoviesAL.size(); i++)
      {
         System.out.println(MoviesAL.get(i).toString());
      }
      
      
     for(int i=0; i<ActionMovies.size(); i++){
     
       MovieRecommender s = (MovieRecommender) ActionMovies.get(i);
       if(s.getMovieTitle().equalsIgnoreCase("Skyscrapper"))
       {
          System.out.println("\n\tYear: 2018 \n\tRating view: **** (4.0)");
       }
       else if(s.getMovieTitle().equalsIgnoreCase("Venom"))
       {
          System.out.println("\n\tYear: 2018 \n\tRating view: **** * (4.5)");
       }
       else if(s.getMovieTitle().equalsIgnoreCase("The Hunger Game"))
       {
          System.out.println("\n\tYear: 2012 \n\tRating view: **** * (4.5)");
       }
       else if(s.getMovieTitle().equalsIgnoreCase("Peninsula"))
       {
          System.out.println("\n\tYear: 2020 \n\tRating view: *** ******** (3.8)");
       }
       else if(s.getMovieTitle().equalsIgnoreCase("Top Gun:Maverick"))
       {
          System.out.println("\n\tYear: 2022 \n\tRating view: **** ******** (4.8)");
       }
     }

      //String message = "Do you like the movie recommender we provide? ";
      //Review.showPopUp(message);

   
}
}


      
          
   

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   
       

      


      
      

      