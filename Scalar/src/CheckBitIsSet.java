public static  boolean checkBitIsSet(int A,int i) {
		if((A & (1<<i)) > 0) {
			return true;
		}
		return false;
	}
