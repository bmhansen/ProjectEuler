class Multiples {

	public static void main(String[] args) {
		long total = 0;
		int max = Integer.parseInt(args[0]);
		for (long i = 0; i < max; i++){
			if (i%3 == 0 || i%5 == 0){
				if (total + i < total){
					System.out.print("OVERFLOW");
				}
				total += i;
			}
		}
		System.out.println(total);
	}
}