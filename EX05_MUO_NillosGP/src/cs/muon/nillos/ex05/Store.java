package cs.muon.nillos.ex05;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<>();
    storeList.add(this);
    
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index+1 <= itemList.size() && index >= 0){
        this.earnings += itemList.get(index).getCost();
        System.out.println(itemList.get(index).getName() + " is sold for " + itemList.get(index).getCost());
    }
    else {
        System.out.println("There are only " + itemList.size() + " items in the store");
    	
    }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      /*for(int i = 1; i <= itemList.size(); i++){
          if(itemList.get(i-1).getName().equals(name)){
            this.earnings += itemList.get(i-1).getCost();
            System.out.println(itemList.get(index).getName() + "has been succesfully sold from " + this.name);
          }
          else {
            System.out.println(this.name + " does not sell this item");
          }
      }*/
        Item item = null;
        String existInd = "";
        for(int i=0; i < itemList.size(); i++){
        item = (Item) itemList.get(i);
          
         if (item.getName().equals(name)) {
              this.earnings += item.getCost();
              existInd = "Y";
         } 
      }
     if (!existInd.equals(""))
    	 System.out.println(this.name + " earned " + this.earnings);
     else	 
    	 System.out.println(this.name + " does not sell this item");
     
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
     Item item = null;
      String existInd = "";
      
      //double earning = 0;
      for (int x=0; x<this.itemList.size(); x++){
    	   item = (Item) this.itemList.get(x);
    	   if (item.getName().equals(i.getName())){
    		   System.out.println("store:"+this.getName() + " item:" + item.getName());
    		   this.earnings += item.getCost();
    		   existInd = "Y";
    	   }
      }
      if (!existInd.equals(""))
     	 System.out.println(this.name + " earned " + this.earnings);
      else	 
     	 System.out.println(this.name + " does not sell " + i.getName());
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  
 // public Item getItem () {
   //   return item;
  //}
  public void addItem(Item i){
      this.itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
        Item item = null;
        if (itemList.size() > 0) {
                 for (int x=0; x<itemList.size(); x++){
                          item = (Item) itemList.get(x);
                          if (item.getType().equals(type)) {
		System.out.println(item.getName() + " as " + type);
                          }
                   }
        }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
        Item item = null;
        for (int x=0; x< itemList.size(); x++){
	item = (Item) itemList.get(x);
                  if (item.getCost() <= maxCost) {
                        System.out.println(item.getName() + " less than " + maxCost);
	}
        }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
        Item item = null;
        for (int x=0; x< itemList.size(); x++){
                item = (Item) itemList.get(x);
                        if (item.getCost() >= minCost) {
                          System.out.println(item.getName() + " greater than " + minCost);
                        }
        }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
        for (int x=0; x<storeList.size(); x++){
        System.out.println(((Store) storeList.get(x)).getName() + " earned " + ((Store) storeList.get(x)).getEarnings());
  }
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
