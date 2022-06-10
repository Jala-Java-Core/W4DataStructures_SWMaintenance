package logisitcs;

public class EventLogistics extends FundCalculations {
    //Code W4-4
    protected int maxCapacity;

    public EventLogistics() {
        super();
        currentBudget = 0;
    }

    int getMaxCapacity() {
        return maxCapacity;
    }

    public void updateWithProfits(int[] siteProfits) {
        currentBudget += getArraySum(siteProfits);
        maxCapacity = (int)(Math.floor((float) currentBudget * 0.75));
    }
}
