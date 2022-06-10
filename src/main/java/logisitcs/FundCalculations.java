package logisitcs;

public class FundCalculations {
    //Code W4-4
    protected int currentBudget;

    public FundCalculations() {
        currentBudget = 0;
    }

    protected int getArraySum(int[] arr) {
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return arraySum;
    }
}
