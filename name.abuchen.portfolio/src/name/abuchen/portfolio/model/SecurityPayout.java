package name.abuchen.portfolio.model;


public final class SecurityPayout
{
    private long[] amounts = new long[12];

    public long[] getAmounts()
    {
        return amounts;
    }

    public void setAmounts(long[] amounts)
    {
        this.amounts = amounts;
    }
    
    public long getAnnualPayoutAmount()
    {
        long sum = 0;
        for(long i : amounts)
            sum += i;
        return sum;
    }
}