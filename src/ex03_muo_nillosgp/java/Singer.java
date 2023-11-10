package ex03_muo_nillosgp.java;

/**
 *
 * @author Gabriel Nillos
 */
public class Singer {
    public String name;
    public int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    public static String totalPerformances;
            
    public Singer(String name, int performances, double earnings, Song song) {
        this.name = name;
        this.noOfPerformances = performances;
        this.earnings = earnings;
        this.favoriteSong = song;
        totalPerformances = totalPerformances + noOfPerformances;
    }
    
    public void performForAudience(int number){
        noOfPerformances = noOfPerformances + 1;
        totalPerformances = totalPerformances + 1;
        earnings = getEarnings() + (100 * number);
        System.out.println(name + " performed to " + number + " audiences.");
    }
    
    public void performForAudience(int number, Singer singerY) {
        this.noOfPerformances = this.noOfPerformances + 1;
        singerY.noOfPerformances = singerY.noOfPerformances + 1;
        totalPerformances = totalPerformances + 2;
        this.earnings = this.getEarnings() + (50 * number);
        singerY.earnings = singerY.getEarnings() + (50 * number);
        System.out.println(this.name + " and " + singerY.name + " performed to " + number + " audiences.");
    }
    
    public void setFavoriteSong(Song song){
        favoriteSong = song;
        
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    
    public double getEarnings() {
        return earnings;
    }

    
    
    
    }
    

