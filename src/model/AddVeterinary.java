package model;

public class AddVeterinary{

	public static final int MAXVETERINARY = 7;

	private int id;
	private String name;
	private String lastName;
	private String idVeterinary;

	public AddVeterinary(int pId, String pName, String pLastName, String pIdVetrinary){
		id = pId;
		name = pName;
		lastName = pLastName;
		idVeterinary = pIdVetrinary;
	}

	//RelationShips



	//Get

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getLastName(){
		return lastName;
	}
	public String getIdVeterinary(){
		return idVeterinary;
	}

	//Set

	public void setId(int pId){
		id = pId;
	}
	public void setName(String pName){
		name = pName;
	}
	public void setLastName(String pLastName){
		lastName = pLastName;
	}
	public void setIdVeterinary(String pIdVeterinary){
		idVeterinary = pIdVeterinary;
	}

	//toString
}