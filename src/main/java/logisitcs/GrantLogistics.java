package logisitcs;

public class GrantLogistics extends FundCalculations{
    //Code W4-3

    public GrantLogistics(int amountAvailable) {
        super();
        currentBudget = amountAvailable;
    }

    public boolean fullfillAllRequests(int[] individualRequests) {
        int totalAmountRequested = getArraySum(individualRequests);
        return totalAmountRequested <= currentBudget;
    }
}
