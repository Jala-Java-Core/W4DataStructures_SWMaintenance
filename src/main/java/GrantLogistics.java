public class GrantLogistics {
    //Code W4-3
    private int currentBudget;

    public GrantLogistics(int amountAvailable) {
        currentBudget = amountAvailable;
    }

    public boolean fullfillAllRequests(int[] individualRequests) {
        int totalAmountRequested = 0;
        //Repeated code, refactor in logistics package
        for (int i = 0; i < individualRequests.length; i++) {
            totalAmountRequested += individualRequests[i];
        }
        return totalAmountRequested <= currentBudget;
    }
}
