// Encapsulation: encapsulation of data(accountHolder and balance )
// The only way to interact with the balance is through the public methods getBalance(), deposit(), and withdraw(). This enforces control over how the balance is accessed and modified.

fun main() {
    val account = BankAccount("John Doe", 5000.0)
    println("Initial Balance: ${account.getBalance()}")

    account.deposit(1500.0)//Deposit some paise
    println("Balance after deposit: ${account.getBalance()}")

    
    account.withdraw(2000.0)// Withdraw some money
    println("Balance after withdrawal: ${account.getBalance()}")


    try {    // Attempt an invalid withdrawal
        account.withdraw(6000.0)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // Accessing private property directly (Uncommenting the below line will cause a compile-time error)
    // println(account.balance)
}

// Advanced encapsulation example: Bank Account
class BankAccount(private var accountHolder: String, private var balance: Double) {

    // Getter for balance (read-only access)
    fun getBalance(): Double {
        return balance
    }

    
    fun deposit(amount: Double) {// Method to deposit money, with validation
        if (amount <= 0) {
            throw IllegalArgumentException("Deposit amount must be greater than zero")
        }
        balance += amount
    }
    
    fun withdraw(amount: Double) {// Method to withdraw money, with validation
        if (amount <= 0) {
            throw IllegalArgumentException("Withdrawal amount must be greater than zero")
        } 
        if (amount > balance) {
            throw IllegalArgumentException("Insufficient balance")
        }
        balance -= amount
        println("Withdrawel successful")
    }
}
