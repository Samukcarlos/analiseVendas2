package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entiets.Sale;

public class Program {

	private static final String Logan = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //abrindo o arquivo
			List<Sale> list = new ArrayList<>();
			Set<Sale> set = new HashSet<>();
			String line = br.readLine(); 
			while (line != null) { 
				
				String[] fields = line.split(","); 
				
				set.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				
				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				
				line = br.readLine();	
				}
			
			Double logan = list.stream()
				   .filter(p->p.getSeller().equals("Logan"))
			       .map(p-> p.getTotal())	
			       .reduce(0.0, (x,y)-> x+y);
			
			Double padme  = list.stream()
					   .filter(p->p.getSeller().equals("Padme Amidala"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double rachel = list.stream()
					   .filter(p->p.getSeller().equals("Rachel Roth"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double victor = list.stream()
					   .filter(p->p.getSeller().equals("Victor Von Doom"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double kal = list.stream()
					   .filter(p->p.getSeller().equals("Kal-El"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double anakin = list.stream()
					   .filter(p->p.getSeller().equals("Anakin"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double wanda = list.stream()
					   .filter(p->p.getSeller().equals("Wanda Maximoff"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);
			
			Double barry = list.stream()
					   .filter(p->p.getSeller().equals("Barry Allen"))
				       .map(p-> p.getTotal())	
				       .reduce(0.0, (x,y)-> x+y);			
			
			System.out.println("Total de vendas por vendedor: ");
			System.out.println("Logan "+ " - "+ logan);
			System.out.println("Logan "+ " - "+ padme);
			System.out.println("Logan "+ " - "+ rachel);
			System.out.println("Logan "+ " - "+ victor);
			System.out.println("Logan "+ " - "+ kal);
			System.out.println("Logan "+ " - "+ anakin);
			System.out.println("Logan "+ " - "+ wanda);
			System.out.println("Logan "+ " - "+ barry);
			
			System.out.println(set.toString());
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}

		


