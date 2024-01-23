package JrxmlTOJasper.JrxmlTOJasper;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	String a = null;

	// String sourceFileName =
	// "/home/saranga/Desktop/Test/purchasereceiptserialv14_2.jrxml";
	// FIILES/JASPER-ORG/GOLDPLUS/V3final/salesordergoldplus.jrxml";
	String sourceFileName = null;//
	// "/home/saranga/Desktop/PLAYNATION/invoice_7.jrxml"; //play
	// String sourceFileName =
	// "/home/saranga/Desktop/PLAYNATION/salesorderwithdeposit.jrxml";/home/saranga/Desktop/test/V6
	// sourceFileName = "/home/saranga/Documents/OCTOPUS
	// FIILES/JASPER-ORG/BIR/xreading-customermizedBIRv8.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/GOLDPLUS/Salesorder/V7/salesorder_goldplus_ipad.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/NewJasper/invoiceoctopus100_3.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/ELUSH/2020-02-25/invoice_elush_A7_4.jrxml";

	// Octo repair 65 /26
	// sourceFileName ="/home/saranga/Desktop/FINAL/invoiceoctopus65.jrxml";
	// sourceFileName = "/home/saranga/Desktop/QUE/invoiceoctopus26.jrxml";

	// Octo repair CN65 /26
	// sourceFileName =
	// "/home/saranga/Desktop/Remova/SFORM/invoiceoctopus6.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/Remova/TEST/invoiceoctopus12.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/Remova/SG/invoiceoctopus1.jrxml";

	// OCTOREPAIR FINAL QUO:38 SFORM
	// sourceFileName =
	// "/home/saranga/Desktop/Remova/SFORM/invoiceoctopus6.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/Remova/QUE/invoiceoctopus38.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/QUOTATION/invoiceoctopus26.jrxml";

	// OCTOREPAIR PURCHASING
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalone/LatestUploadedlist/Purchaserecipt-Batch/Long/purchasereceiptbatch.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalone/LatestUploadedlist/Purchaserecipt/Long/purchasereceipt.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalone/LatestUploadedlist/Purchaserecipt/purchasereceipt.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalonenew/purchasereceiptserial.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalone/LatestUploadedlist/Purchaserecipt-Serial/Long/purchasereceiptserial.jrxml";
	// CRM APP
	// sourceFileName=
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/CRMApp/V6/invoiceCRMapp_2.jrxml";

	// PR
	/// sourceFileName =
	// "/home/saranga/Desktop/NewFolder/serialnumber.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/NewFolder/purchasereceiptserialv14.jrxml";

	// PO
	/// sourceFileName =
	// "/home/saranga/Desktop/NewFolder/serialnumber.jrxml";
	// sourceFileName = "/home/saranga/Desktop/PO/purchaseorder.jrxml";

	// DO
	// sourceFileName = "/home/saranga/Desktop/DO/deliveryorder.jrxml";

	// Elush
	// sourceFileName =
	// "/home/saranga/Desktop/ELUSH/2020-02-25/2020-06-03/invoice_elush_A7.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/ELUSH/2020-02-25/2020-06-03/payment_elush.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/ELUSH/2020-02-25/2020-06-03/payment_elush_ccxtn.jrxml";

	// tesst
	// sourceFileName="/home/saranga/Desktop/v6/invoiceoctopus100_3.jrxml";

	// sourceFileName =
	// "//home/saranga/Documents/elushnew/invoice_elush_A7.jrxml";
	// sourceFileName =
	// "/home/saranga/Documents/Invoice/payment_elush.jrxml";
	// sourceFileName =
	// "/home/saranga/Documents/Invoice/payment_elush_ccxtn.jrxml";
	// Remova final
	// sourceFileName =
	// "/home/saranga/Desktop/20200715OctoReair/invoiceoctopus6.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/20200715OctoReair/invoiceoctopus39.jrxml";

	// Minoshin Final report
	// sourceFileName =
	// "/home/saranga/Desktop/Test/purchasereceiptserialv145.jrxml";
	// Planation

	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PLAYNATION/Invoice/invoice_15.jrxml";
	// sourceFileName = "/home/saranga/Desktop/bb/new/invoice_star1.jrxml";

	// sourceFileName =
	// "/home/saranga/Desktop/newfile/invoice_goldplus_v1.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/NTUC/purchaseorderNTUC4.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PLAYNATION/Xreading/xreading-customermized.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/PurchaseRecipt/finalone/LatestUploadedlist/Purchaserecipt/Long/purchasereceiptlong.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/80mminvoice/invoice_goldplus_ipad_v82.jrxml";
	// sourceFileName =
	// "/home/eleos/CodeBase/octopusupdates/scripts/resources/jaspers-ipad/PRTN/purchasereturnserial.jrxml";
	// sourceFileName ="/home/saranga/Desktop/CRMAPP/invoiceCRMapp_3.jrxml";
	// sourceFileName =
	// "/home/saranga/Desktop/DarkGen/invoiceCRMappv15.jrxml";
	// sourceFileName =
	// "/home/saranga/octopusupdates/resources/jaspers-ipad/Purchase
	// Order/MINOSHIN/purchaseorder.jrxml";
	// .
	// sourceFileName="/home/eleos/Desktop/newchange/80/invoice_starv101_2.jrxml";
	// sourceFileName="/home/eleos/CodeBase/octopusupdates/scripts/resources/jaspers-ipad/StockReceive/stockreceiptwithoutfont.jrxml";
	// sourceFileName="/home/eleos/CodeBase/octopusupdates/scripts/resources/jaspers-ipad/ELUSH/Invoice/invoice_elush_A7_V9.jrxml";
	// sourceFileName.equals(" true");
	// sourceFileName="/home/eleos/Desktop/quo/invoiceoctopus39.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/invoice_suns_158.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/eleos/core/defaultjaspers/stockissueV1.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/eleos/core/so/stockissue.jrxml";
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/invoice_club21_80mm_v3.jrxml";
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/stockreceiptV101.jrxml";
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus267.jrxml";
	// //quotationoctorepair
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus220-serviceform.jrxml";
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/serviceform-repairapp164.jrxml";
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus272-service.jrxml";
	// //quotationoctorepair
	// sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus68-released.jrxml";
	// sourceFileName =
	// "/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus280.jrxml";
	//sourceFileName = "/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/invoiceoctopus288-serviceform.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/eleos/core/defaultjaspers/stockissue-food5.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/eleos/core/defaultjaspers/stockreceipt-food1.jrxml";
	//sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/eleos/core/defaultjaspers/STOCK_ISSUEV1.jrxml";
	sourceFileName="/Users/eleos/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/test/purchasereceiptV4.jrxml";
	System.out.println("Compiling Report Design ..." + sourceFileName);
	try {

	    String jasperReport = JasperCompileManager.compileReportToFile(sourceFileName);
	} catch (JRException e) {
	    e.printStackTrace();
	}
	System.out.println("Compilation Done!!! ...");
    }
}
