class Max{
	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		System.out.println(max(a, b));
	}
	public static Comparable max(Comparable o1, Comparable o2) {
		if(o1.compareTo(o2) > 0) {
			return o1;
		}
		else{
			return o2;
		}
	}
}
