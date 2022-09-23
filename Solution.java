class Solution {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
		
		int prod = 1;
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int index = Integer.parseInt(String.valueOf(ch));
			prod = prod * index;
			sum = sum + index;
		}
		return prod - sum; 
    }
}
