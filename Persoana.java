
public class Persoana {

	private String nume;
	private float latitudine;
	private float longitudine;

	public Persoana() {
		latitudine = 0;
		longitudine = 0;
		nume=null;
	}

	public void setNume(String x) {
		nume=x;
	}

	public void setLatitudine(float x) {
		latitudine = x;
	}

	public void setLongitudine(float x) {
		longitudine = x;
	}

	public String getNume() {
		return nume;
	}

	public float getLatitudine() {
		return latitudine;
	}

	public float getLongitudine() {
		return longitudine;
	}

	public void finalize() {
		System.out.println("Obiect distrus! ");
	}
}
