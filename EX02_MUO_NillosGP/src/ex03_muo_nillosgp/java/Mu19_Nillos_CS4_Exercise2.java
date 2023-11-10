package ex03_muo_nillosgp.java;
/**
 * @author Gabriel Nillos
 */
public class Mu19_Nillos_CS4_Exercise2 {

    public static void main(String[] args) {
        Crew crew1 = new Crew("Luffy", 19, 141.1);
        Crew crew2 = new Crew("Chopper", 17, 44.1);
        Crew crew3 = new Crew("Robin", 30, 124.0);
        
        System.out.println("Crew 1\nName: " + crew1.name + "\nAge: " + crew1.age + "\nWeight (lb): " + crew1.weight + "\n");
        System.out.println("Crew 2\nName: " + crew2.name + "\nAge: " + crew2.age + "\nWeight (lb): " + crew2.weight + "\n");
        System.out.println("Crew 3\nName: " + crew3.name + "\nAge: " + crew3.age + "\nWeight (lb): " + crew3.weight + "\n");
        
        Song song1 = new Song("Stella by Starlight", "Miles Davis", 4.73);
        Song song2 = new Song("Bye Bye Blackbird", "Art Blakey", 7.90);
        Song song3 = new Song("On The Sunny Side Of The Street", "Dizzy Gillespie", 5.72);
        
        System.out.println("Song 1\nTitle: " + song1.title + "\nArtist: " + song1.artist + "\nDuration (mins): " + song1.duration + "\n");
        System.out.println("Song 2\nTitle: " + song2.title + "\nArtist: " + song2.artist + "\nDuration (mins): " + song2.duration + "\n");
        System.out.println("Song 3\nTitle: " + song3.title + "\nArtist: " + song3.artist + "\nDuration (mins): " + song3.duration + "\n");
        
        Singer singer1 = new Singer("Miles Davis", 98, 12000, song1);
        Singer singer2 = new Singer("Bill Evans", 73, 11500, song3);
        Singer singer3 = new Singer("Chick Corea", 69, 10900, song1);
        
        System.out.println("Singer 1\nName: " + singer1.name + "\nNo. of Performances: " + singer1.noOfPerformances + "\nEarnings (USD): " + singer1.earnings + "\nFavorite Song: " + singer1.favoriteSong.title + "\n");
        System.out.println("Singer 2\nName: " + singer2.name + "\nNo. of Performances: " + singer2.noOfPerformances + "\nEarnings (USD): " + singer2.earnings + "\nFavorite Song: " + singer2.favoriteSong.title + "\n");
        System.out.println("Singer 3\nName: " + singer3.name + "\nNo. of Performances: " + singer3.noOfPerformances + "\nEarnings (USD): " + singer3.earnings + "\nFavorite Song: " + singer3.favoriteSong.title + "\n");
        
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
               
        System.out.println(singer1.name + "'s fave song is changed to " + singer1.favoriteSong.title);
        //System.out.println("\nSinger 1\nName: " + singer1.name + "\nNo. of Performances: " + singer1.noOfPerformances + "\nEarnings (USD): " + singer1.earnings + "\nFavorite Song: " + singer1.favoriteSong + "\n");
        
        
        singer1.performForAudience(372, singer1, singer2);
        singer3.performForAudience(250, singer3, singer1);
        
    }
    
    
    
}
