package easy_tasks.fraud_detector;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Transaction transaction = t;
        return transaction.getAmount() >= 1000000;
    }
}
