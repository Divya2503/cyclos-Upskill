package com.training.dataproviders;

import java.util.List;
import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

import com.training.readexcel.CYTC083PaymentApachePOIExcelRead;
import com.training.readexcel.CYTC084PaymentApachePOIExcelRead;
import com.training.readexcel.CYTC085PaymentApachePOIExcelRead;


public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 

		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[2]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getPassword(); 

			result[count ++] = obj; 
		}


		return result;
	}

	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C://Test data/Cyclos Test Data.xlsx"; 
		return new CYTC083PaymentApachePOIExcelRead().getExcelContent(fileName); 	
	}

	@DataProvider(name = "excel-inputs2")
	public Object[][] getExcelData2(){
		String fileName ="C://Test data/Cyclos Test Data.xlsx"; 
		return new CYTC084PaymentApachePOIExcelRead().getExcelContent(fileName); 

	}


	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		String fileName ="C://Test data/Cyclos Test Data.xlsx";
		return new CYTC085PaymentApachePOIExcelRead().getExcelContent(fileName); 

	}




	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C://Test dataCyclos Test Data.xlsx/Testing.xlsx", "Sheet1"); 
	}
}
