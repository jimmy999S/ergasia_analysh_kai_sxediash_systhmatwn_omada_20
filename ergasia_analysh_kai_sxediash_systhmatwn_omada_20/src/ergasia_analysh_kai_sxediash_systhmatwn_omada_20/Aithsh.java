package ergasia_analysh_kai_sxediash_systhmatwn_omada_20;

public class Aithsh {
	String onomaAiton;
	String linkSeAithsh;
	boolean isPreApproved;
	boolean isApproved;
	boolean isActive;
	
	public Aithsh(String a, String l, boolean pr, boolean ap, boolean ac) {
		onomaAiton = a;
		linkSeAithsh = l;
		isPreApproved = pr;
		isApproved = ap;
		isActive = ac;
	}
	
	String getOnomaAiton() {
		return onomaAiton;
	}
	
	String getLinkSeAithsh() {
		return linkSeAithsh;
	}
	
	boolean checkIfPreApproved() {
		return isPreApproved;
	}
	
	boolean checkIfApproved() {
		return isApproved;
	}
	
	void preApprove() {
		isPreApproved = true;
	}
	
	void Approve() {
		isApproved = true;
	}
	
	boolean checkIfActive() {
		return isActive;
	}
	
	void toggleActive() {
		if (isActive) {
			isActive = false;
		} else {
			isActive = true;
		}
	}
}
