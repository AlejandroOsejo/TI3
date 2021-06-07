package model;

public class AddPet{

	public static final int MAXPET = 120;

	private String specie;
	private String name;
	private int age;
	private String race;

	//RelationShips

	private Owner owner;
	private Priority priority;
	private State state;

	//Constructor

	public AddVeterinary(String pSpecie, String pName, int pAge, String pRace, Owner pOwner, Priority pPriority, State pState){
		specie = pSpecie;
		name = pName;
		age = pAge;
		race = pRace;
		owner = pOwner;
		priority = pPriority;
		state = pState;
	}

	//Get

	public String getSpecie(){
		return specie;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getRace(){
		return race;
	}
	public Owner getOwner(){
		return owner;
	}
	public Priority getPriority(){
		return priority;
	}
	public State getState(){
		return state;
	}

	//Set

	public void setSpecie(String pSpecie){
		specie = pSpecie;
	}
	public void setName(String pName){
		name = pName;
	}
	public void setLastName(int pAge){
		age = pAge;
	}
	public void setIdVeterinary(String pRace){
		race = pRace;
	}
	public void setOwner(Owner pOwner){
		owner = pOwner;
	}
	public void setPriority(Priority pPriority){
		priority = pPriority;
	}
	public void setState(State pState){
		state = pState;
	}

	//toString
}