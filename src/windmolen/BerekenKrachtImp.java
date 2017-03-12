package windmolen;

import javax.jws.WebService;

@WebService( endpointInterface= "prefix.WSInterface")
public class BerekenKrachtImp implements CalcService {

	private int bereken;
	
	
	
	public int berekenKracht(int windsnelheid, int vermogen){
		bereken = (int) (windsnelheid * vermogen /0.7);
		
		return bereken;
	}
	
	public int windEngerie(int uur, int windsnelheid){
		
		uur = (int) (uur * windsnelheid *4000);
		
		return uur;
	}
}
