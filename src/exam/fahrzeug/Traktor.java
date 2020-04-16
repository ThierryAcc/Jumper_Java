package exam.fahrzeug;

public class Traktor extends Fahrzeug implements Comparable<Traktor> {
	Owner owner;

	public Traktor(int price, Owner owner) {
		super(price);
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Traktor other = (Traktor) obj;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Traktor [owner=" + owner + ", getPrice()=" + getPrice() + "]";
	}

	@Override
	public int compareTo(Traktor o) {
		System.out.println(Integer.compare(this.getPrice(), o.getPrice()));
		return Integer.compare(this.getPrice(), o.getPrice());	
	}	

	@Override
	public void drive(int distance) {
		System.out.println(owner.getFirstName() + " drove " + distance);
	}

	@Override
	protected Traktor returnMe() {
		return this;
	}

	@Override
	public void interfaceImp() {
	}

	@Override
	public void abstractI2() {
	}

	@Override
	public void staticI2() {
	}


}
