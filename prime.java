public static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		int limit = (int) Math.sqrt(n);
		for (int i = 3; i <= limit; i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}

	// Main: checks a predefined list of numbers (no user input required)
	public static void main(String[] args) {
		int[] numbers = {2, 7, 10, 13, 20, 29, 31, 45, 50, 97};
		for (int num : numbers) {
			if (isPrime(num)) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}
		}
	}

}