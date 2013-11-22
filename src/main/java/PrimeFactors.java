import java.util.LinkedList;
import java.util.List;

class PrimeFactors {

	List<Long> of(long toFactor) {
		List<Long> factors = new LinkedList<Long>();
		for (long divisor = 2; divisor <= toFactor; divisor++) {
			if (toFactor % divisor == 0) {
				factors.add(divisor);
				toFactor = toFactor / divisor;
				divisor--; // So we repeat this candidate
			}
		}
		return factors;
	}

}
