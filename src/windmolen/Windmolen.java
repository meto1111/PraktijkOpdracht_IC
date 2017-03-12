package windmolen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;

@XmlRootElement
public class Windmolen {

	private int windsnelheid;
	private int vermogen;
	private int bereken;
	private int uur;
	
	
	public Windmolen(int windsnelheid, int vermogen, int bereken, int uur) {
		super();
		this.windsnelheid = windsnelheid;
		this.vermogen = vermogen;
		this.bereken = bereken;
		this.uur = uur;
	}


	public int getUur() {
		return uur;
	}

	@XmlElement
	@Test
	public void setUur(int uur) {
		
		uur = (int) (uur * windsnelheid *4000);
	}


	public int getBereken() {
		return bereken;
	}

	@XmlElement
	public void setBereken(int bereken) {
		bereken = (int) (windsnelheid * vermogen /0.7);
		
	}


	public int getWindsnelheid() {
		return windsnelheid;
	}

	@XmlElement
	public void setWindsnelheid(int windsnelheid) {
		this.windsnelheid = windsnelheid;
	}


	public int getVermogen() {
		return vermogen;
	}

	@XmlElement
	public void setVermogen(int vermogen) {
		this.vermogen = vermogen;
	}


	@Override
	public String toString() {
		return "Windmolen [windsnelheid=" + windsnelheid + ", vermogen=" + vermogen + ", bereken=" + bereken + "]";
	}
	
	


	
	
	
	
	
}
