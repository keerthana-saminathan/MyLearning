package mytestday2;

public class FindPalindrome {

	public static void main(String[] args) {

		int num = 121;
		int revNum = 0;
		int remainder;

		int originalNum = num;

		while (num != 0) {
			remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num /= 10;
		}

		if (originalNum == revNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
	}

}
