
public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		def find_transaction_count(arr, target):
		    arr.sort()  # Sort the array in ascending order
		    left, right = 0, len(arr) - 1  # Initialize left and right pointers
		    transactions = 0  # Initialize the transaction count

		    while left < right:
		        if arr[left] + arr[right] <= target:
		            left += 1
		            right -= 1
		            transactions += 1
		        else:
		            right -= 1
		            transactions += 1

		    return transactions

		def main():
		    size = int(input("Enter the size of transaction array: "))
		    arr = list(map(int, input("Enter the values of array: ").split()))
		    target_count = int(input("Enter the total number of targets that need to be achieved: "))

		    for i in range(target_count):
		        target = int(input("Enter the value of target: "))
		        transactions = find_transaction_count(arr, target)
		        print(f"Target achieved after {transactions} transactions")

		if __name__ == "__main__":
		    main()

	}

}
