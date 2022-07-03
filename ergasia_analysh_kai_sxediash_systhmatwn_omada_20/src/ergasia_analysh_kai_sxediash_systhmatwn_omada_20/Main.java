package ergasia_analysh_kai_sxediash_systhmatwn_omada_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("|Plhroforiako Systhma EYDE|");
		System.out.println("---------------------------");
		System.out.println(" ");
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Melos> members = new ArrayList<Melos>();
		
		members.add( new Melos(1, "Proedros", true, true));
		
		//dhmiourgia melon se for loop gia eukolia
		
		int i;
		
		for (i=2; i<15; i++) {
			members.add( new Melos(i, "Melos"+String.valueOf(i), false, false));
		}
		
		//members.forEach(Melos -> {System.out.println(Melos.getName());});
		
		ArrayList<Aithsh> Aithseis = new ArrayList<Aithsh>();
		
		StringBuffer onAiton = new StringBuffer();
		StringBuffer linkAit = new StringBuffer();
		
		int choice = -1;
		int choice2;
		int choice3;
		
		do {
			System.out.println(" ");
			System.out.println("1. Proedros");
			System.out.println("2. Grammateia");
			System.out.println("3. Melos");
			System.out.println("4. Aithsh");
			System.out.println("0. EXIT");
	
			choice = Integer.valueOf(scanner.nextLine());
			System.out.println(" ");
			
			if (choice == 1) {
				
				System.out.println("Dialekse aithsh gia anathesh se melos");
				
				for (i=0; i<Aithseis.size(); i++) {
					if (Aithseis.get(i).checkIfPreApproved() && !Aithseis.get(i).checkIfActive() && !Aithseis.get(i).checkIfApproved()) {
						System.out.println("Aithsh " + i + ": " + Aithseis.get(i).getOnomaAiton() + " " + Aithseis.get(i).getLinkSeAithsh());
					}
				}
				
				choice2 = Integer.valueOf(scanner.nextLine());
				
				if (choice2 == -1) {
					System.out.println("akyrosh");
				} else if (choice2 >= 0 && choice2 < Aithseis.size()) {
					System.out.println("Dialekse melos");
					
					for (i=0; i<members.size(); i++) {
						if (!members.get(i).checkIfJudge()){
							System.out.println(i + ". " + members.get(i).getName());
							}
					}
					
					members.get(Integer.valueOf(scanner.nextLine())).toggleJudge();
					Aithseis.get(choice2).toggleActive();
					
				} else {
					System.out.println("akyrosh");
				}
				
			} else if (choice == 2) {
			
				System.out.println("Dialekse aithsh gia epalhtheush orthhs symplhroshs");
				
				for (i=0; i<Aithseis.size(); i++) {
					
					if ( !Aithseis.get(i).checkIfPreApproved() && !Aithseis.get(i).checkIfActive() && !Aithseis.get(i).checkIfApproved()) {
						System.out.println("Aithsh " + i + ": " + Aithseis.get(i).getOnomaAiton() + " " + Aithseis.get(i).getLinkSeAithsh());
					}
				}
				System.out.println("-1: akyrosh");
				
				choice2 = Integer.valueOf(scanner.nextLine());
				
				if (choice2 == -1) {
					System.out.println("akyrosh");
				} else if (choice2 >= 0 && choice2 < Aithseis.size()) {
					Aithseis.get(choice2).preApprove();
				} else {
					System.out.println("akyrosh");
				}
			
				
			} else if (choice == 3) {
				
				
				System.out.println("Dialekse melos");
				
				for (i=0; i<members.size(); i++) {
					if (members.get(i).checkIfJudge() && !members.get(i).checkIfPresident()) {
						System.out.println(i + ". " + members.get(i).getName());
					}
				}
				System.out.println("-1. akyro");
				
				choice2 = Integer.valueOf(scanner.nextLine());
				
				if (choice2 == -1) {
					System.out.println("akyrosh");
				} else if (choice2 >= 0 && choice2 < members.size()) {
					
					for (i=0; i<Aithseis.size(); i++) {
						
						if ( Aithseis.get(i).checkIfPreApproved() && Aithseis.get(i).checkIfActive() && !Aithseis.get(i).checkIfApproved()) {
							System.out.println("Aithsh " + i + ": " + Aithseis.get(i).getOnomaAiton() + " " + Aithseis.get(i).getLinkSeAithsh());
						}
					}
					
					choice3 = Integer.valueOf(scanner.nextLine());
					Aithseis.get(choice3).Approve();;
					Aithseis.get(choice3).toggleActive();
					members.get(choice2).toggleJudge();
					
					System.out.println(" ");
					System.out.println("Aithsh " + choice3 + ": " + Aithseis.get(choice3).getOnomaAiton() + " " + Aithseis.get(choice3).getLinkSeAithsh());
					System.out.println("exei egkrithei");
					
				} else {
					System.out.println("akyrosh");
				}
				
				
				
			} else if (choice == 4) {
				
				System.out.println("Dhmiourgia aithshs");
				
				System.out.println("Dwse onoma aiton:");
				onAiton.append(scanner.nextLine());
				
				System.out.println("Dwse link gia thn aithsh:");
				linkAit.append(scanner.nextLine());
				
				
				System.out.println("1. ypobolh");
				System.out.println("2. akyrosh");
				
				if (Integer.valueOf(scanner.nextLine()) == 1) {
					Aithseis.add(new Aithsh(onAiton.toString(), linkAit.toString(), false, false, false));
				} else {
					System.out.println("Akyrosh");
				}
				
				onAiton.delete(0, onAiton.capacity());
				linkAit.delete(0, linkAit.capacity());
				
			} else if (choice == 0) {
				;
			} else {
				System.out.println("Akyro input!!!");
			}
		
		} while (choice != 0);
		
	scanner.close();
	}

}
