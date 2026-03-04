package Equipamentos;

public class Equipamentos {
	private String name;
	private int codigoID;

	public Equipamentos() {

	}

	public Equipamentos(int codigoID, String name) {
		this.name = name;

		this.codigoID = codigoID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCodigoID() {
		return codigoID;
	}

	public void setCodigoID(int codigoID) {
		this.codigoID = codigoID;
	}

}
