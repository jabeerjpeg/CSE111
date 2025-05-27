package task18_MovieManagerTester;

public class Movie {
    public String title;
    public String director;
    public double rating;
    public String [] arr1= new String[3];
    public int count;

    public void setMovieDetails(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    public void setMovieDetails(String title, String director) {
        this.title = title;
        this.director = director;
    }
    public void updateRating (double p){
        this.rating = p;
        System.out.println("Updated rating of \"" +this.title +"\" to "+p );
    }

    public void addActors(String name){
        this.arr1[count]=name;
        System.out.println("Added actor \" "+ arr1[count]+"\" to \"" +this.title +"\".");
        count++;
    }
    public void addActors(String name1,String name2){
        addActors(name1);
        addActors(name2);

    }
    public void addActors(String name1,String name2, String name3){
        addActors(name1);
        addActors(name2);
        addActors(name3);

    }

    public void showInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Rating: " + this.rating);
        System.out.print("Actors: ");
        for(int i=0;i<count;i++){
            if(i<count-1){
            System.out.print(arr1[i] +", ");
        }
            else{
            System.out.print(arr1[i]);}
        }
        System.out.println();

    }
}
