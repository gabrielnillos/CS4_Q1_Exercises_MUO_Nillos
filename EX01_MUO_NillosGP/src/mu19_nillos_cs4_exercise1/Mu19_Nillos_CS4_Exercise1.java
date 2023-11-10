package mu19_nillos_cs4_exercise1;
/**
 * @author Gabriel Nillos
 */
public class Mu19_Nillos_CS4_Exercise1 {

    public static void main(String[] args) {
        
        boolean ageComparison;
        int ageSum;
        boolean statusComparison;
        
        Admiral admiral1 = new Admiral();
        Admiral admiral2 = new Admiral();
        Admiral admiral3 = new Admiral();
        
        admiral1.name = "Akainu";
        admiral2.name = "Kuzan";
        admiral3.name = "Kizaru";
        
        admiral1.age = 55;
        admiral2.age = 49;
        admiral3.age = 58;
        
        admiral1.devilFruit = "Magma Fruit";
        admiral2.devilFruit = "Ice Fruit";
        admiral3.devilFruit = "Light Fruit";
        
        admiral1.status = "Promoted";
        admiral2.status = "Quit";
        admiral3.status = "Retained";
        
  
        System.out.println("Admiral 1");
        System.out.println("Name: " + admiral1.name);
        System.out.println("Age: " + admiral1.age);
        System.out.println("Devil Fruit: " + admiral1.devilFruit);
        System.out.println("Status: " + admiral1.status + "\n");
        
        System.out.println("Admiral 2");
        System.out.println("Name: " + admiral2.name);
        System.out.println("Age: " + admiral2.age);
        System.out.println("Devil Fruit: " + admiral2.devilFruit);
        System.out.println("Status: " + admiral2.status + "\n");
        
        System.out.println("Admiral 3");
        System.out.println("Name: " + admiral3.name);
        System.out.println("Age: " + admiral3.age);
        System.out.println("Devil Fruit: " + admiral3.devilFruit);
        System.out.println("Status: " + admiral3.status + "\n");
        
        ageComparison = (admiral3.age > admiral1.age && admiral3.age > admiral2.age);
        System.out.println("Admiral 3 is the oldest admiral: " + ageComparison);
        ageSum = admiral3.age + admiral2.age + admiral1.age;
        System.out.println("Total of ages: " + ageSum);
        statusComparison = (admiral3.status != admiral2.status && admiral1.status != admiral2.status && admiral3.status != admiral1.status);
        System.out.println("They all have different statuses: " + statusComparison);
        
    }
    
}
