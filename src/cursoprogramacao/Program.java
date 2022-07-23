package cursoprogramacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Enter departament's name: ");
		String departamentName = input.nextLine();
		System.out.print("Enter woker data:");
		System.out.print("Name: ");
		String workerName = input.nextLine();
		System.out.print("Level: ");
		String workerLevel = input.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = input.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

		System.out.print("How many contracts to this worker? ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract # " + i + " data:");
			System.out.print("Date (dd/mm/yyyy): ");
			Date contractDate = sdf.parse(input.next());
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			System.out.print("Duraction (hours) : ");
			int hours = input.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
			System.out.println();
			System.out.print("Enter month and year to calculate income (MM/YYYY): ");
			String monthAndYear = input.next();
			int month = Integer.parseInt(monthAndYear.substring(0,2));
			int year = Integer.parseInt(monthAndYear.substring(3));
			System.out.print("Name: "+worker.getName());
			System.out.println("Departament: "+worker.getDepartament().getName());
			System.out.println("Income for "+monthAndYear+" : "+String.format("%.2f", worker.income(year, month)));
			
				
		input.close();
	}

}
