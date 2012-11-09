package business.domain_model;

public class RevenueRecognition
{
	private Money amount;
	
	private MfDate date;
	
	public RevenueRecognition(Money amount, MfDate date)
	{
		this.amount = amount;
		this.date = date;
	}
	
	public Money getAmount()
	{
		return amount;
	}
	
	boolean isRecognizableBy (MfDate asof)
	{
		return asof.after(date) || asof.equals(date);
	}
}
