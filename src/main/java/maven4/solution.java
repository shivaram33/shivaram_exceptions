package maven4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class solution {
	private static Logger logger = LogManager.getLogger(HouseConstructionEstimation.class);
	public static void main(String []args)
	{
		logger.info("This is a class for testing");
		logger.info("Testing the HouseConstructionEstimation:");
		HouseConstructionEstimation h=new HouseConstructionEstimation();
		double d=h.Calculation("High Standard Materials", 200, "Fully_Auto_Home");
		logger.info(d);
		logger.info("Testing the Interest:");
		Interest in=new Interest();
		logger.info("SImple Interest=");
		double p=in.Simple(10000, 2, 5);
		logger.info(p);
		logger.info("Compound Interest");
		p=in.Compound(10000, 2, 5);
		logger.info(p);
	}
}
