package com.thefg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DepositBean {

	static double ddiRate = 0.35; // demand deposit interest rate
	static double[] lumpRate = { 1.10, 1.30, 1.50, 2.10, 2.75, 2.75 };// Lump rate
																	
	private String type;
	private double capital;
	private String term;
	private Date depositDate;
	private Date withdrawDate;
	private double interest;
	private double capitalAndInterest;

	public void start() {
		long datefront = depositDate.getTime();
		long dateback = withdrawDate.getTime();
		long betweenDays = (long) ((dateback - datefront) / (1000 * 60 * 60 * 24) + 0.5);

		if (type.equals("checking")) {

			interest = ddiRate * capital * betweenDays / 360 / 100;
			
		} else if (type.equals("dwils")) {
			switch (term) {
			case "threeMonths":
				interest = capital * lumpRate[0] * 3 / 12 / 100;
				break;
			case "sixMonths":
				interest = capital * lumpRate[1] * 6 / 12 / 100;
				break;
			case "oneyear":
				interest = capital * lumpRate[2] * 1 / 100;
				break;
			case "twoyears":
				interest = capital * lumpRate[3] * 2 / 100;
				break;
			case "threeyears":
				interest = capital * lumpRate[4] * 3 / 100;
				break;
			case "fiveyears":
				interest = capital * lumpRate[5] * 5 / 100;
				break;

			default:
				break;

			}	
		}
		capitalAndInterest = capital + interest;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = Double.parseDouble(capital);
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(String depositDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(depositDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.depositDate = date;
	}

	public Date getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(String withdrawDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(withdrawDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.withdrawDate = date;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getcapitalAndInterest() {
		return capitalAndInterest;
	}

	public void setcapitalAndInterest(double capitalAndInterest) {
		this.capitalAndInterest = capitalAndInterest;
	}

}
