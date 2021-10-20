//package Assignment4;

class AccountOverdrawSafeDemo {
	private static Account account = new Account();

	public static void main(String[] args) {
		// AccountOverdrawSafeDemo r = new AccountOverdrawSafeDemo();
		Thread threadOne = new Thread(() -> {
			makeWithdrawal(900);
			if (account.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		});
		// Thread threadOne = new Thread(r);
		// Thread threadTwo = new Thread(r);
		Thread threadTwo = new Thread(() -> {
			makeWithdrawal(900);
			if (account.getBalance() < 0)
				System.out.println("account is overdrawn!");
		});
		threadOne.setName("kritika");
		threadTwo.setName("vaibhav");
		threadOne.start();
		threadTwo.start();
	}

	private synchronized static void makeWithdrawal(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ account.getBalance());
		}
	}
}

