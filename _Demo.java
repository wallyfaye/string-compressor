class _Demo {
	public static void main(String[] args){
		if (args.length < 1){
			System.out.println("Please specify two  strings to test");
			System.exit(0);
		}
		StringCompressor str = new StringCompressor(args[0]);
		System.out.println("The result of \"" + args[0] + "\" is: " + str.res);
	}
}
