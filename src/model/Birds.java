package model;

public class Birds extends PetShelter{
	
	// relationships

	private ShelterBirds shelterBirds;

	//constructor
	public Birds(String pHIdentifier, double pLenght, double pWeight, Status pStatus, ShelterBirds pShelterBirds){
		super(pHIdentifier, pLenght, pWeight, pStatus);
		shelterBirds = pShelterBirds;
	}
}