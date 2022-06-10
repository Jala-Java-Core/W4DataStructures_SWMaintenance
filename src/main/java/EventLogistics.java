public class EventLogistics {
    //Code W4-3
    protected int maxCapacity;
    private int currentBudget;

    public EventLogistics() {
        maxCapacity = 0;
        currentBudget = 0;
    }

    public void updateWithProfits(int[] siteProfits) {
        for (int i = 0; i < siteProfits.length; i++) {
            currentBudget += siteProfits[i];
        }
        maxCapacity = (int)(Math.floor((float) currentBudget * 0.75));
    }
}
