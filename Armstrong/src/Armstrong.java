
public class Armstrong {
public int findArmstrong(int n,int count) {
	int sum=0;
	while(n!=0) {
	int rem=n%10;
	sum=(int)(sum+Math.pow(rem,count));
	n=n/10;
	}
	return sum;
}
}
