package model;

public class Bunnies extends PetShelter{
	private String typePlant;

	//constructor

	public Bunnies(String pHIdentifier, double pLenght, double pWeight, Status pStatus, String pTypePlant){
		super(pHIdentifier, pLenght, pWeight, pStatus);
		typePlant = pTypePlant;
	}
}