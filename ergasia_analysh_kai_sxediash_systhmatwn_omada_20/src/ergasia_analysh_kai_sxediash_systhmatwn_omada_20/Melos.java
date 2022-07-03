package ergasia_analysh_kai_sxediash_systhmatwn_omada_20;

//import java.util.ArrayList;

public class Melos {
	int id;
	String name;
	boolean isJudge;
	boolean isPresident;
	
	
	public Melos(int i, String n, boolean j, boolean p) {
		id = i;
		name =  n;
		isJudge = j;
		isPresident = p;
		}
	
	int getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	boolean checkIfJudge() {
		return isJudge;
	}
	
	boolean checkIfPresident() {
		return isPresident;
	}
	
	void toggleJudge() {
		if (isJudge) {
			isJudge = false;
			} else {
			isJudge = true;
			}
	}
}
