package model;

public abstract class PetShelter{

	private String hIdentifier;
	private double lenght;
	private double weight;

	// Relationships

	private Status status;

	// Constructor

	public PetShelter(String pHIdentifier, double pLenght, double pWeight, Status pStatus){
		hIdentifier = pHIdentifier;
		lenght = pLenght;
		weight = pWeight;
		status = pStatus
	}

	// Gets

	public String getHIdentifier(){
		return hIdentifier;
	}
	public double getLenght(){
		return lenght;
	}
	public double getWeight(){
		return weight;
	}
	public Status getStatus(){
		return status;
	}

	// Sets

	public void setHIdentifier(String pHIdentifier){
		hIdentifier = pHIdentifier;
	}
	public void setLenght(double pLenght){
		lenght = pLenght;
	}
	public void setWeight(double pWeight){
		weight = pWeight;
	}
	public void setStatus(Status)

	// ToString

	public String toString(){

	}
}