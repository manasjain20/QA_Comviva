package Testing;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVWriter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricbuzz {
	public static void main(String arg[]) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		List<WebElement> rows = tables.get(0).findElements(By.tagName("tr"));
		
		String csvFile = "table_data.csv";
	        try {
	        	CSVWriter writer = new CSVWriter(new FileWriter(csvFile));
	            for (WebElement row : rows) {
	                List<WebElement> cols = row.findElements(By.tagName("td"));

	                String[] rowData = new String[cols.size()];

	                for (int i = 0; i < cols.size(); i++) {
	                    rowData[i] = cols.get(i).getText();
	                }

	                writer.writeNext(rowData);

	                for (String data : rowData) {
	                    System.out.print(data + "\t");
	                }
	                System.out.println();
	            }

	            System.out.println("Data has been written to " + csvFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	}
}
