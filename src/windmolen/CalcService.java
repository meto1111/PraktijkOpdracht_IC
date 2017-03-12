package windmolen;

import javax.jws.WebService;

@WebService
public interface CalcService {

	public int berekenKracht(int windsnelheid, int vermogen);
	public int windEngerie(int uur, int windsnelheid);
}
