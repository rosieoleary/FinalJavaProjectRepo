package rosieOLeary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class ReadingInInformation {

	ArrayList<Marina>MarinaList= new ArrayList<Marina>();
	ArrayList<Boat>BoatList=new ArrayList<Boat>();
	ArrayList<Person>PersonList=new ArrayList<Person>();
	

	public String bufferedCopy(String inFile) throws IOException {
		BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
		String line ="";
		String totalcontents="";
	
		while ((line = bfrIn.readLine())!=null){
			totalcontents += line + "\n";
			}
		bfrIn.close();
		return totalcontents;
	}

	public String[] createArray(String inFile) throws IOException{
		String totalcontents = bufferedCopy(inFile);
	
		String[] Array = totalcontents.split("\n");
		return Array;	
	}

	public void createMarinaObject(String inFile) throws IOException{
	
		String[] Array = createArray(inFile);
		for (int i = 0;i<Array.length;i++){
		
			if (Array[i].equals("Marinas")){
				while (Array[i+3].contains(",")){
					double boatcapacity= Double.parseDouble(Array[i+4]);
					Marina newmarina = new Marina(Array[i+2],Array[i+3],boatcapacity);
					MarinaList.add(newmarina);
					i = i+4;
					}
				}
		
			if (Array[i].equals("Boats")){
				while (Array[i+4].contains(".")){
					double boatsize = Double.parseDouble(Array[i+4]);
					Boat newboat = new Boat(Array[i+2],Array[i+3],boatsize);
					BoatList.add(newboat);
					i=i+4;		
				}
			}
			if (Array[i].equals("People")){
				String[] NameArray = new String[1];
				while (Array[i+2].contains(" ")){
					NameArray=Array[i+2].split(" ");
					String surname = "Ginger";
					if (NameArray.length==2){
						 surname = NameArray[1];
					}
					Person newperson = new Person(NameArray[0],surname,Array[i+3],Array[i+4]);
					if (Array[i+4].contains("Br")){
						PersonList.add(newperson);
						i =i+4;
					}
					else {
						VisaInformation newvisainfo = new VisaInformation(Array[i+5]);
						newperson.setVisainfo(newvisainfo);
						PersonList.add(newperson);
						i=i+5;
					}
					
					
					
				}
			}
			}
			
		}
	
	
	public void boatroleAssociation(){
		for (int i =0; i<PersonList.size();i++){
			if (PersonList.get(i).getFirstname().equals("David")&&PersonList.get(i).getSurname().equals("Green")){
				PersonList.get(i).setBoatrole("Owner");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Aquaholic")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Mary")&&PersonList.get(i).getSurname().equals("Jones")){
				PersonList.get(i).setBoatrole("Owner");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Marys Dream")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Bill")&&PersonList.get(i).getSurname().equals("Knightley")){
				PersonList.get(i).setBoatrole("Owner");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Aquaholic")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Brian")&&PersonList.get(i).getSurname().equals("Johnson")){
				PersonList.get(i).setBoatrole("Crew");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Boaty McBoatface")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Linus")&&PersonList.get(i).getSurname().equals("Torvalds")){
				PersonList.get(i).setBoatrole("Captain");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Aquaholic")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			
			if (PersonList.get(i).getFirstname().equals("Peter")&&PersonList.get(i).getSurname().equals("Jackson")){
				PersonList.get(i).setBoatrole("Captain");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Boaty McBoatface")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Peter")&&PersonList.get(i).getSurname().equals("Jackson")){
				PersonList.get(i).setAnotherBoatRole("Crew");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Santa Maria")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Adele")&&PersonList.get(i).getSurname().equals("Ginger")){
				PersonList.get(i).setBoatrole("Crew");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Boaty McBoatface")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			if (PersonList.get(i).getFirstname().equals("Emma")&&PersonList.get(i).getSurname().equals("Watson")){
				PersonList.get(i).setBoatrole("Owner");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Boaty McBoatface")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			
			if (PersonList.get(i).getFirstname().equals("Avril")&&PersonList.get(i).getSurname().equals("Lavigne")){
				PersonList.get(i).setBoatrole("Crew");
				for (int j =0; j<BoatList.size();j++){
					if (BoatList.get(j).getName().equals("Boaty McBoatface")){
						BoatList.get(j).addtoBoatPersonList(PersonList.get(i));
						}
					}
				}
			
		}
	
		for (int i =0; i<BoatList.size();i++){
			if (BoatList.get(i).getName().equals("Santa Maria")){
				for (int j=0;j<MarinaList.size();j++){
					if (MarinaList.get(j).getAddress().contains("Venice")){
						MarinaList.get(j).addToMarinaBoatList(BoatList.get(i));
					}
				}
			}
			if (BoatList.get(i).getName().equals("Marys Dream")){
				for (int j=0;j<MarinaList.size();j++){
					if (MarinaList.get(j).getAddress().contains("Monaco")){
						MarinaList.get(j).addToMarinaBoatList(BoatList.get(i));
					}
				}
			}
			if (BoatList.get(i).getName().equals("Boaty McBoatface")){
				for (int j=0;j<MarinaList.size();j++){
					if (MarinaList.get(j).getAddress().contains("Monaco")){
						MarinaList.get(j).addToMarinaBoatList(BoatList.get(i));
					}
				}
			}
			if (BoatList.get(i).getName().equals("Aquaholic")){
				for (int j=0;j<MarinaList.size();j++){
					if (MarinaList.get(j).getAddress().contains("Venice")){
						MarinaList.get(j).addToMarinaBoatList(BoatList.get(i));
					}
				}
			}
		}
	}
}


