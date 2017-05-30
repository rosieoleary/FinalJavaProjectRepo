package rosieOLeary;
import java.util.ArrayList;
public class Marina {
	
	private String name;
	private String address;
	private double boatcapacity;
	private ArrayList<Boat>MarinaBoatList=new ArrayList<Boat>();
	private ArrayList<Person>MarinaPersonList=new ArrayList<Person>();
	
	public Marina(String name, String address, double boatcapacity) {
		super();
		this.name = name;
		this.address = address;
		this.boatcapacity = boatcapacity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBoatCapacity() {
		return boatcapacity;
	}
	public void setBoatCapacity(double newBoatCapacity) {
		if (newBoatCapacity>0){
		this.boatcapacity = newBoatCapacity;
		System.out.println("The new boat capacity of "+name+" is "+boatcapacity);
		}
		else{
			System.out.println("You cannot have a negative number of boats");
		}
	}
	public ArrayList<Boat> getMarinaBoatList() {
		return MarinaBoatList;
	}
	public void addToMarinaBoatList(Boat b){
		double boatcapacity = this.boatcapacity- b.getSize();
		if (boatcapacity<0){
			System.out.println("Cannot add another boat to Marina, Marina is full.");
		}
		else {
			boolean isBoatEmpty = b.getBoatPersonList().isEmpty();
		
			if (isBoatEmpty==true){
				System.out.println("Boat must have at least one person associated with it.");
			}	
			else {
				MarinaBoatList.add(b);
				//b.setBoatMarina(m);
				setBoatCapacity(boatcapacity);
				for (int i=0;i<b.getBoatPersonList().size();i++){
					MarinaPersonList.add(b.getBoatPersonList().get(i));
					}
				}
			}
		}
	public void removeFromMarinaBoatList(Boat b){
		for (int i =0; i<MarinaBoatList.size();i++){
			if (MarinaBoatList.get(i).getName()==b.getName()){
				MarinaBoatList.remove(b);
				setBoatCapacity(boatcapacity+b.getSize());
				}
			}
		}
	public ArrayList<Person> getMarinaPersonList(){
		return MarinaPersonList;
		}
	public String findOldestPerson(){
		int oldestyear= 2017;
		if (getMarinaPersonList().size()>0){
			for (int i=0; i<getMarinaPersonList().size();i++){
				String[] AgeArray= (getMarinaPersonList().get(i).getDob().split("/"));
				int day = Integer.parseInt(AgeArray[0]);
				int month = Integer.parseInt(AgeArray[1]);
				int year = Integer.parseInt(AgeArray[2]);
				System.out.println(getMarinaPersonList().get(i).getFirstname()+ " was born in "+year);
			
				if (oldestyear>year){
					
					oldestyear=year;
				}
			}
			
			String oldestyear1 = Integer.toString(oldestyear);
			System.out.println("This is the oldest year: "+oldestyear1);
			for (int j=0; j<getMarinaPersonList().size(); j++){
				if (getMarinaPersonList().get(j).getDob().contains(oldestyear1)){
					String oldestname = getMarinaPersonList().get(j).getFirstname()+" "+getMarinaPersonList().get(j).getSurname();
					System.out.println(oldestname + " is the oldest person at "+ name);
					return oldestname;
					}
				else {return "This is an error";}
			
				}
			
		}
		return null;
	}
	public int howManyBoats(){
		int j =0;
		for (int i=0; i<getMarinaBoatList().size();i++){
			j= j+1;
			}
		return j;
		}
	
	
	
	

}