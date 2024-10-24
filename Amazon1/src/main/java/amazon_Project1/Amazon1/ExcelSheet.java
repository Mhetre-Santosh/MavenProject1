package amazon_Project1.Amazon1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
	static String usr;
	static String pwd;
	static String Incorrct_usr;
	static String Incorrect_pwd;
	
	public void LoginData() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Santosh\\eclipse-workspace\\SeleniumBasics\\DDT\\Santosh DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);

		 usr = w1.getSheet("Login Sheet").getRow(1).getCell(0).getStringCellValue();
		 pwd = w1.getSheet("Login Sheet").getRow(1).getCell(1).getStringCellValue();
		 Incorrct_usr = w1.getSheet("Login Sheet").getRow(1).getCell(2).getStringCellValue();
		 Incorrect_pwd = w1.getSheet("Login Sheet").getRow(1).getCell(3).getStringCellValue();

	}
}
