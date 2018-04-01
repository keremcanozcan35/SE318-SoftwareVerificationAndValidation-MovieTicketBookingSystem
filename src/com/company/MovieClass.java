package com.company;
//import java.util.ArrayList;

public class MovieClass {

   private String MovieName;
   private String MovieType;
   private int MovieDuration;
   private String MovieDirector;
   private int MovieIMDB;
   private String MovieDescription;
   private int MovieSeats;
   //ArrayList<String> MovieList;

   public MovieClass(){
        MovieName=null;
        MovieType=null;
        MovieDuration=0;
        MovieDirector=null;
        MovieIMDB=0;
        MovieDescription=null;
        MovieSeats=0;
    }

   public String getMovieName(){
       return MovieName;
   }
   public void setMovieName(String movieName){
        this.MovieName=movieName;
   }

   public String getMovieType(){
       return MovieType;
   }
   public void setMovieType(String movieType){
       this.MovieType=movieType;
   }

   public int getMovieDuration(){
       return MovieDuration;
   }
   public void setMovieDuration(int movieDuration){
       this.MovieDuration=movieDuration;
   }

   public String getMovieDirector(){
       return MovieDirector;
   }
   public void setMovieDirector(String movieDirector){
       this.MovieDirector=movieDirector;
   }

   public int getMovieIMDB(){
       return MovieIMDB;
   }
   public void setMovieIMDB(int movieIMDB){
       this.MovieIMDB=movieIMDB;
   }

    public String getMovieDescription(){
       return MovieDescription;
    }
    public void setMovieDescription(String movieDescription){
       this.MovieDescription=movieDescription;
    }

    public int getMovieSeats(){
       return MovieSeats;
    }
    public void setMovieSeats(int movieSeats){
       this.MovieSeats=movieSeats;
    }


    public void MovieDisplay(){
        System.out.println("Movie name is: " +getMovieName());
        System.out.println("Movie type is: " +getMovieType());
        System.out.println("Movie duration is: " +getMovieDuration());
        System.out.println("Movie director is: " +getMovieDirector());
        System.out.println("Movie IMDB is: " +getMovieIMDB());
        System.out.println("Movie description is: " +getMovieDescription());
        System.out.println("Movie saloon has: " +getMovieSeats());
    }

    String[] MovieNames = new String[]{"Ready Player One","The Stolen Princess","Kaybedenler Kulubu","On Ikı Savascı", "Tomb Raider"};
    String[] MovieTypes = new String[]{"Action", "Animation", "Drama", "War", "Action"};
    String[] MovieDurations = new String[]{"120", "110","130", "100", "120"};
    String[] MovieDirectors = new String[]{"Steven Spielberg", "Oleh Malamuzh", "Mehmet Ada Öztekin", "Nicolai Fuglsig", "Roar Uthaug"};
    String[] MovieIMDBs = new String[]{"6.0","5.4","3.3","4.6","5.0"};
    String[] MovieDescriptions = new String[]{"Description1", "Description2", "Description3", "Description4", "Description5"};
    String[] MovieSeats = new String[]{"50", "50", "60", "60", "50"};

    /*public void currentMovieList(){
        ArrayList<String> MovieList=new ArrayList<>(); //Creating Our Movie Array List
        System.out.println("Movie List is created.");
        MovieList.add("Movie1"); //Adding New Movies Into My Array List
        MovieList.add("Movie2");
        MovieList.add("Movie3");
        MovieList.add("Movie4");
        MovieList.add("Movie5");
    }*/









    public static void main(String[] args){

        System.out.println("sfasfsdds");


    }

}
