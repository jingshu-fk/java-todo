package com.shushu;

/*
多态的用法
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
	//totalTax()方法利用多态秩序和income交互。	
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
	
	//构造方法初始化
	public Income(double income) {
		this.income = income;
	}
	
//final可以使父类的方法不能被重写	public final double getTax()
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
//子类可以这样调用父类的被重写方法			super.getTax();
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