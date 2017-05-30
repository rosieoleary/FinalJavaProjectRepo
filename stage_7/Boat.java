package rosieOLeary;
import java.util.ArrayList;

public class Boat implements Vehicle {
	
	private String name;
	private String countryoforigin;
	private double size;
	public int speed;
	private ArrayList<Person>BoatPersonList=new ArrayList<Person>();
	private Marina marina;
	
	public Boat(String name, String countryoforigin, double size) {
		super();
		this.name = name;
		this.countryoforigin = countryoforigin;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryoforigin() {
		return countryoforigin;
	}
	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
	@Override
	public void accelerate() {
		speed= speed+1;
		
	}
	@Override
	public void deccelerate() {
		speed=speed-1;
		
	}

	public ArrayList<Person> getBoatPersonList(){
		return BoatPersonList;
	}
	public void addtoBoatPersonList(Person p){
		if (p.getBoatrole().contains("Captain")){
			if (BoatPersonList.size() != 0) {
				boolean containscaptain = false;
				int i=0;
				while (i<BoatPersonList.size()){
					if (BoatPersonList.get(i).getBoatrole().contains("Captain")){
						containscaptain=true;	
					}
					i=i+1;
				}
				if (containscaptain==true){
					System.out.println("This boat already has a captain.");
				}
				else {
					BoatPersonList.add(p);
					System.out.println(p.getFirstname()+" "+p.getSurname()+" is a "+p.getBoatrole()+" of "+name);
				}
				}
			else{
				BoatPersonList.add(p);
				System.out.println(p.getFirstname()+" "+p.getSurname()+" is a "+p.getBoatrole()+" of "+name);
				}
			}
		else {
			BoatPersonList.add(p);
			System.out.println(p.getFirstname()+" "+p.getSurname()+" is a "+p.getBoatrole()+" of "+name);
		}
	}
	
	public Marina getBoatMarina(){
		return marina;
	}
	public void setBoatMarina(Marina marina){
		this.marina = marina;
		System.out.println(name + " is docked at "+marina.getName());
	}
}

	
	

