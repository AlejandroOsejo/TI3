package model;

public class Reptiles extends Shelter{
	private String typeHabitat;

	//relationships

	private ShelterReptiles shelterReptiles;

	//constructor
	public Reptiles(String pHIdentifier, double pLenght, double pWeight, Status pStatus, String pTypeHabitat, ShelterReptiles pShelterReptiles){
		super(pHIdentifier, pLenght, pWeight, pStatus);
		typeHabitat = pTypeHabitat;
		shelterReptiles = pShelterReptiles;
	}
}