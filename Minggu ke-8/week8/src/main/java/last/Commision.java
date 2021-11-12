/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package last;

/**
 *
 * @author Jihan Afifah
 */
public class Commision extends Hourly {
	private double totalSale;
	private double commisionRate;
	
	public Commision (String eName, String eAddress, String ePhone, String sosSecNumber, double rate, double commisRate){
		super (eName, eAddress, ePhone, sosSecNumber, rate);
		commisionRate = commisRate;
	}
	
	public void addSales (double totalSale)
	{
		this.totalSale = totalSale * commisionRate;
	}
	
	public double pay ()
	{
		double payment = super.pay() + totalSale * commisionRate;
		totalSale = 0;
		return payment;
	}
	
	public String toString()
	{
		String result = super.toString();
		result += "\nTotal Sale : " + totalSale;
		return result;
	}
}
