import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class PrimeFactorsTest {

	PrimeFactors primeFactors = new PrimeFactors();

	@Test public void
	prime_factor_of_small_prime_is_that_prime() {
		assertThat(primeFactors.of(3), is(equalTo(listOf(3))));
	}

	@Test
	public void
	prime_factor_of_larger_prime_is_that_prime() {
		assertThat(primeFactors.of(13), is(equalTo(listOf(13))));
	}

	@Test
	public void
	prime_factors_of_number_that_is_a_prime_squared_is_that_prime_twice() {
		assertThat(primeFactors.of(4), is(equalTo(listOf(2, 2))));
	}

	@Test public void
	prime_factors_of_number_that_is_multiple_of_two_different_primes_is_list_of_those_primes_in_order() {
		assertThat(primeFactors.of(6), is(equalTo(listOf(2, 3))));
	}

	@Test public void
	prime_factors_of_number_that_is_multiple_of_four_primes_is_those_primes_in_order() {
		assertThat(primeFactors.of(60), is(equalTo(listOf(2, 2, 3, 5))));
	}

	@Test public void
	prime_factors_of_1_is_empty_list() {
		assertThat(primeFactors.of(1), is(equalTo(listOf())));
	}

	@Test public void
	prime_factors_of_large_number() {
		long bigNumber = (long)Math.pow(2,60) - 1;
		assertThat(primeFactors.of(bigNumber), is(equalTo(listOf(3, 3, 5, 5, 7, 11, 13, 31, 41, 61, 151, 331, 1321))));
	}

	@Ignore("Intentionally slow -- useful for later algorithmic optimization")
	@Test public void
	prime_factors_of_large_prime() {
		long largePrime = (1L << 31) - 1;
		assertThat(primeFactors.of(largePrime), is(equalTo(Arrays.asList(largePrime))));
	}

	private List<Long> listOf(int ... ints) {
		List<Long> res = new ArrayList<Long>(ints.length);
		for (int i : ints) {
			res.add((long)i);
		}
		return res;
	}

}
