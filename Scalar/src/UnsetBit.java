public static int unsetBit(int A,int i) {
		if((A & (1<<i)) > 0) {
			return (A ^ (1<<i));
		}
		return A;
	}
