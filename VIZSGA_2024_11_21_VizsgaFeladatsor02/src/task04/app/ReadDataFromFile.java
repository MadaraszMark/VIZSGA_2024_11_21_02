package task04.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	public List<FootWear> readDataFromCsv() {
		List<FootWear> footWearList = new ArrayList<FootWear>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("task04_data/fit_shoes.csv"), "UTF-8"));
			String header = br.readLine();
            while(br.ready()) {
                String row = br.readLine();
                footWearList.add(getFootWearFromRow(row));
            }
            br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("A kódolás hibás!");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Nem található a fájl!");
		} catch (IOException e) {
			System.out.println("I/O hiba történt!");
			//e.printStackTrace();
		}
		return footWearList;
	}
	
	public FootWear getFootWearFromRow(String row) {
		String[] rowData = row.split(";");
        boolean saleTemp = rowData[5].equals("1");
        return new FootWear(
				Integer.parseInt(rowData[0]), 
				rowData[1], 
				rowData[2], 
				Double.parseDouble(rowData[3]), 
				Byte.parseByte(rowData[4]), 
				saleTemp);
	}

}
