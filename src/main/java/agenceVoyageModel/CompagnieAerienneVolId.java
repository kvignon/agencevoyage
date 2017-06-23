//package agenceVoyageModel;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//@Embeddable
//public class CompagnieAerienneVolId implements Serializable {
//	private CompagnieAerienne compAerienne;
//
//	public CompagnieAerienne getCompAerienne() {
//		return compAerienne;
//	}
//
//	public void setCompAerienne(CompagnieAerienne compAerienne) {
//		this.compAerienne = compAerienne;
//	}
//
//	public CompagnieAerienneVolId() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public CompagnieAerienneVolId(CompagnieAerienne compAerienne) {
//		super();
//		this.compAerienne = compAerienne;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((compAerienne == null) ? 0 : compAerienne.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CompagnieAerienneVolId other = (CompagnieAerienneVolId) obj;
//		if (compAerienne == null) {
//			if (other.compAerienne != null)
//				return false;
//		} else if (!compAerienne.equals(other.compAerienne))
//			return false;
//		return true;
//	}
//	
//	
//	
//}
