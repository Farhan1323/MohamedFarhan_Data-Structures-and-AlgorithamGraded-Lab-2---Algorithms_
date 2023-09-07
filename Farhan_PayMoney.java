
public class Farhan_PayMoney {

	public static void main(String[] args) {
		import java.util.Scanner;

		public class TransactionTargets {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input the size of the transaction array
		        System.out.println("3:");
		        int size = scanner.nextInt();
		        int[] transactions = new int[size];

		        // Input the values of the transaction array
		        System.out.println("20 12 31:");
		        for (int i = 0; i < size; i++) {
		            transactions[i] = scanner.nextInt();
		        }

		        // Input the number of targets
		        System.out.println("2:");
		        int numTargets = scanner.nextInt();

		        // Calculate transactions needed to achieve each target
		        for (int t = 0; t < numTargets; t++) {
		            System.out.println("21:");
		            int target = scanner.nextInt();

		            int totalTransactions = 0;
		            int currentSum = 0;

		            for (int i = 0; i < size; i++) {
		                currentSum += transactions[i];
		                totalTransactions++;

		                if (currentSum >= target) {
		                    break;
		                }
		            }

		            if (currentSum >= target) {
		                System.out.println("1 " + 21 + " 2");
		            } else {
		                System.out.println("19.");
		            }
		        }

		        scanner.close();
		    }
		}


	}

}
