package com.work;

import java.math.BigDecimal;

public class SCBean {
	private String firstNum;
	private String secondNum;
	private String lastNum;
	private char operator1;
	private char operator2;
	private String result;


	/*
	 * 返回值说明:
	 * 0 表示正常返回
	 * 1 表示除数为零
	 * 2 表示模为零
	 */
	public int init(){
		BigDecimal first = new BigDecimal(firstNum);
        BigDecimal second = new BigDecimal(secondNum);
        BigDecimal last = new BigDecimal(lastNum);
		//处理运算得到结果,好暴力啊!
		switch (operator1) {
		    case '+':
		        switch (operator2) {
		            case '+':
		                result = first.add(second).add(last).toString();
		                break;
		            case '-':
		                result = first.add(second).subtract(last).toString();
		                break;
		            case '*':
		                result = first.add(second.multiply(last)).toString();
		                break;
		            case '/':
		                if (0==last.doubleValue()) {
		                    return 1;
		                } 
		                result = first.add(second.divide(last,10,BigDecimal.ROUND_HALF_UP)).toString();
		                break;
		            case '%':
		                if (0==last.doubleValue()) {
		                    return 2;
		                }
		                result = first.add(second.remainder(last)).toString();
		                break;
		            default:
		                break;
		        }
		        break;
		    case '-':
		        switch (operator2) {
		            case '+':
		                result = first.subtract(second).add(last).toString();
		                break;
		            case '-':
		                result = first.subtract(second).subtract(last).toString();
		                break;
		            case '*':
		                result = first.subtract(second.multiply(last)).toString();
		                break;
		            case '/':
		                if (0==last.doubleValue()) {
		                    return 1;
		                }
		                result = first.subtract(second.divide(last,10,BigDecimal.ROUND_HALF_UP)).toString();
		                break;
		            case '%':
		                if (0==last.doubleValue()) {
		                	return 2;
		                }
		                result = first.subtract(second.remainder(last)).toString();
		                break;
		            default:
		                break;
		        }
		        break;
		    case '*':
		        switch (operator2) {
		            case '+':
		                result = first.multiply(second).add(last).toString();
		                break;
		            case '-':
		                result = first.multiply(second).subtract(last).toString();
		                break;
		            case '*':
		                result = first.multiply(second).multiply(last).toString();
		                break;
		            case '/':
		                if (0==last.doubleValue()) {
		                	return 1;
		                }
		                result = first.multiply(second).divide(last,10,BigDecimal.ROUND_HALF_UP).toString();
		                break;
		            case '%':
		                if (0==last.doubleValue()) {
		                	return 2;
		                }
		                result = first.multiply(second).remainder(last).toString();
		                break;
		            default:
		                break;
		        }
		        break;
		    case '/':
		        if (0==second.doubleValue()) {
		        	return 1;
		        }
		        switch (operator2) {
		            case '+':
		                result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).add(last).toString();
		                break;
		            case '-':
		                result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).subtract(last).toString();
		                break;
		            case '*':
		                result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).multiply(last).toString();
		                break;
		            case '/':
		                if (0==last.doubleValue()) {
		                	return 1;
		                }
		                result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).divide(last,10,BigDecimal.ROUND_HALF_UP).toString();
		                break;
		            case '%':
		                if (0==last.doubleValue()) {
		                	return 2;
		                }
		                result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).remainder(last).toString();
		                break;
		            default:
		                break;
		        }
		        break;
		    case '%':
		        if (0==second.doubleValue()) {
		        	return 2;
		        }
		        switch (operator2) {
		            case '+':
		                result = first.remainder(second).add(last).toString();
		                break;
		            case '-':
		                result = first.remainder(second).subtract(last).toString();
		                break;
		            case '*':
		                result = first.remainder(second).multiply(last).toString();
		                break;
		            case '/':
		                if (0==last.doubleValue()) {
		                	return 1;
		                }
		                result = first.remainder(second).divide(last,10,BigDecimal.ROUND_HALF_UP).toString();
		                break;
		            case '%':
		                if (0==last.doubleValue()) {
		                	return 2;
		                }
		                result = first.remainder(second).remainder(last).toString();
		                break;
		            default:
		                break;
		        }
		        break;
		    default:
		        break;
		}
		return 0;
	}
	
	public String getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}
	public String getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(String secondNum) {
		this.secondNum = secondNum;
	}
	public String getLastNum() {
		return lastNum;
	}

	public void setLastNum(String lastNum) {
		this.lastNum = lastNum;
	}
	public char getOperator1() {
		return operator1;
	}
	public void setOperator1(String operator1) {
		this.operator1 = operator1.charAt(0);
	}
	public char getOperator2() {
		return operator2;
	}
	public void setOperator2(String operator2) {
		this.operator2 = operator2.charAt(0);
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
