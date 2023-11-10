package ex03_muo_nillosgp.java;

/**
 *
 * @author Gabriel Nillos
 */
public class Singer {
    public String name;
    public int noOfPerformances;
    public double earnings;
    public Song favoriteSong;
    public static String totalPerformances;
            
    public Singer(String n, int p, double e, Song song) {
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = song;
        totalPerformances = totalPerformances + noOfPerformances;
    }
    
    public void performForAudience(int number){
        noOfPerformances = noOfPerformances + 1;
        totalPerformances = totalPerformances + 1;
        earnings = earnings + (100 * number);
        System.out.println(name + " performed to " + number + " audiences.");
    }
    
    public void performForAudience(int number, Singer singerX, Singer singerY) {
        singerX.noOfPerformances = singerX.noOfPerformances + 1;
        singerY.noOfPerformances = singerY.noOfPerformances + 1;
        totalPerformances = totalPerformances + 2;
        singerX.earnings = singerX.earnings + (50 * number);
        singerY.earnings = singerY.earnings + (50 * number);
        System.out.println(singerX.name + " and " + singerY.name + " performed to " + number + " audiences.");
    }
    
    public void changeFavSong(Song song){
        favoriteSong = song;
        
    }
    
    }
    

