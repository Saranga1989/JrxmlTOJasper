
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JsonDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

//Class Name. This must match the class name you put in your build.gradle file
public class JasperPDFExample {
	public static void main(String[] args) {
		String invoiceitemidString = "-1,10923";
		if (invoiceitemidString.contains("-1,")) {
			System.out.print(invoiceitemidString.replace("-1,",""));
			;
		}

	}
}