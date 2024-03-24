package entities;

public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.00) {
			return 0.15 * getAnualIncome() - 0.5 * healthExpenditures;
		} else {
			return 0.25 * getAnualIncome() - 0.5 * healthExpenditures;
		}
	}
	
}
