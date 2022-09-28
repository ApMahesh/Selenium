package seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//get number of rows
	   int Row_count = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
	   System.out.println("Rows count " +Row_count);
	 
	 //get number of columns
	   int column_count = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();
	   System.out.println("columns count " +column_count);
	   
	   
	   for (int i=1; i<=Row_count; i++)
		{
			
			//Used for loop for number of columns.
			for(int j=1; j<=column_count; j++)
			{ 
				//Prepared final xpath of specific cell as per values of i and j.
				String first_part ="//*[@id='customers']/tbody/tr[i";// "//*[@id='customers']/tbody/tr["; 
				String second_part =  "]/td[j";//"]/td["; 
				String third_part = "]";
				String final_xpath = first_part+second_part+third_part;
				System.out.println("Inside J loop");
				//Will retrieve value from located cell and print It. 
				Thread.sleep(4000);
				String Table_data = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[i]/td[j]")).getText();
				System.out.print(Table_data +" ");
				}
			System.out.println(""); 
			System.out.println(""); 
////*[@id="customers"]/tbody/tr[2]/td[1]
		
	}
	}
}
