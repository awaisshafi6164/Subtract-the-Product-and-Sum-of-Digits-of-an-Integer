
public class Solution {
	public int hammingWeight(int n) {
		int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            System.out.println(n);
            n /= 10;
            System.out.println(sum);
            System.out.println(product);
        }
        return product - sum;
	}
}
