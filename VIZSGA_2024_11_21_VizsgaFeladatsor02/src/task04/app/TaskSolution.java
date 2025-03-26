package task04.app;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<FootWear> footWearList = new ArrayList<FootWear>();
	
	public void fillFootWearList() {
        ReadDataFromFile readDataObj = new ReadDataFromFile();
        footWearList = readDataObj.readDataFromCsv();
    }
	
	public void printAllFootWearData() {
		System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %n", "Azonosító", "Gyártó", "Modell", "Nettó Ár", "Kategória", "Leárazás");
        for (FootWear foot : footWearList) {
            System.out.println(foot.toStringDivider());
        }
    }
	
	public void getAverageWomenFootWear() {
		int womenCount = 0;
		double sum = 0;
		
		for (FootWear footWear : footWearList) {
			if (footWear.getCategory() == 2) {
				sum += footWear.getNetPrice();
                womenCount++;
			}
		}
		double averageWomen = sum / womenCount;
		System.out.println(averageWomen + " Ft");
		
	}
		

}
