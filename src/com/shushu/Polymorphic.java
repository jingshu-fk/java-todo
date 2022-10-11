package com.shushu;

/*
��̬���÷�
*/

public class Polymorphic {
	public static void main(String[] args) {
	Income[] incomes = new Income[] {
		new Income(3000),
		new Salary(7500),
		new StateCoil(15000)
	};
	System.out.println(totalTax(incomes));
}		
	//totalTax()�������ö�̬�����income������	
	public static double totalTax(Income... incomes) {
		double total = 0;
		for (Income income:incomes) {
			total = total + income.getTax();
		}
		return total;
	}	
}


class Income {
	protected double income;
	
	//���췽����ʼ��
	public Income(double income) {
		this.income = income;
	}
	
//final����ʹ����ķ������ܱ���д	public final double getTax()
	public double getTax() {
		return income * 0.1;
	}
}

class Salary extends Income {
	public Salary(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		if (income < 5000) {
//��������������ø���ı���д����			super.getTax();
			return 0;
		} else {
			return (income-5000) * 0.2;
		}	
	}
}


class StateCoil extends Income {
	public StateCoil(double income) {
		super(income);
	}
	@Override 
	public double getTax() {
		return 0;
	}
}