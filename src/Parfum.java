import java.awt.*;

public class Parfum {
	private String nom;
	static final Parfum CASSIS = new Parfum("CASSIS");
	static final Parfum CHOCOBLANC = new Parfum("CHOCOBLANC");
	static final Parfum CHOCOLAIT = new Parfum("CHOCOLAIT");
	static final Parfum CHOCONOIR = new Parfum("CHOCONOIR");
	static final Parfum FRAISE = new Parfum("FRAISE");
	static final Parfum FRAMBOISE = new Parfum("FRAMBOISE");

	public Parfum(String p) {
		nom = p;
	}

	public String toString() {
		return nom;
	}
}
