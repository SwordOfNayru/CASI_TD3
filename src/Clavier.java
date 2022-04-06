import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clavier {
	private static Clavier instance;
	private BufferedReader bufIn = null;
	private StringTokenizer st = null;

	public static synchronized Clavier getInstance() {
		if (instance == null)
			instance = new Clavier();
		return instance;
	}

	private Clavier() {
		if (bufIn == null)
			bufIn = new BufferedReader(new InputStreamReader(System.in));
	}

	public synchronized void read() {
		try {
			String s = bufIn.readLine();
			st = new StringTokenizer(s);
		} catch (IOException e) {
			System.out.println("erreur read " + e.getMessage());
			System.exit(2);
		}
	}

	private synchronized void flushTotal() {
		st = null;
		bufIn = null;
	}

	private synchronized void flush() {
		st = null;
	}

	public synchronized int lireInt() {
		if (st == null)
			read();
		while (!st.hasMoreTokens())
			read();
		String ss = st.nextToken();
		int i = Integer.parseInt(ss);
		return (i);
	}

	public synchronized long lireLong() {
		if (st == null)
			read();
		while (!st.hasMoreTokens())
			read();
		String ss = st.nextToken();
		long i = Long.parseLong(ss);
		return (i);
	}

	public synchronized float lireFloat() {
		if (st == null)
			read();
		while (!st.hasMoreTokens())
			read();
		String ss = st.nextToken();
		float f = Float.parseFloat(ss);
		return (f);
	}

	public synchronized double lireDouble() {
		if (st == null)
			read();
		while (!st.hasMoreTokens())
			read();
		String ss = st.nextToken();
		double f = Double.parseDouble(ss);
		return (f);
	}

	public synchronized String lireString() {
		if (st == null)
			read();
		while (!st.hasMoreTokens())
			read();
		return (st.nextToken());
	}

	public synchronized String lireLigne() {
		String s = "";
		if ((st == null) || (!st.hasMoreTokens())) {
			try {
				s = bufIn.readLine();
			} catch (IOException e) {
				System.out.println("lireString" + " " + e.getMessage());
				System.exit(2); // Une erreur s'est produite, on sort du programme.
			}
			return s;
		} else {
			System.out.println("Autre cas");
			return (st.nextToken(System.getProperty("line.separator")));
		}
	}
}
