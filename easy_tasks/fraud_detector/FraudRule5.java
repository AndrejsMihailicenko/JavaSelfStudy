package easy_tasks.fraud_detector;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        Transaction transaction = t;
        return trader.getCity().equals("Germany")&&transaction.getAmount() > 1000;
    }
}
