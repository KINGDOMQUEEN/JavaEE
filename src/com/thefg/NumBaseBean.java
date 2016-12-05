package com.thefg;

import java.util.Stack;

public class NumBaseBean {
	
	private int numBase;
	private int targetNumBase;
	private String value;
	private String targetValue;
	

	public void init() {
		setTargetValue(conversion(this.numBase, this.targetNumBase, this.value));		
	}
	
	public String conversion(int srcBase, int destBase, String num){  
        if(srcBase == destBase){  
            return num;  
        }  
        String digths = "0123456789ABCDEF";  
        char[] chars = num.toCharArray();  
        int len = chars.length;  
        if(destBase != 10){//目标进制不是十进制 先转化为十进制  
            num = conversion(srcBase,10,num); 
            
        }else{  
            int n = 0;  
            for(int i = len - 1; i >=0; i--){  
                n+=digths.indexOf(chars[i])*Math.pow(srcBase, len - i - 1);  
            }  
            return n + "";  
        }
        return baseString(Integer.valueOf(num),destBase); 
    }
	
	public String baseString(int num,int base){  
        if(base > 16){  
            throw new RuntimeException("进制数超出范围，base<=16");  
        }  
        StringBuffer str = new StringBuffer("");  
        String digths = "0123456789ABCDEF";  
        Stack<Character> s = new Stack<Character>();
        boolean isMinus = false;//判断输入的数是不是负数
        if(value.charAt(0)=='-'){
          num = Integer.valueOf(value.substring(1));
          isMinus = true;
        }
        //System.out.println(num + "..." + base);
        while(num != 0){  
            s.push(digths.charAt(num%base));  
            num/=base;  
        }  
       if(isMinus) {
    	   str.append("-");
       }
       while(!s.isEmpty()){  
           str.append(s.pop());  
       } 
       //System.out.println(num + "..." + base);
       return str.toString();  
    }
	
	
	public String getTargetValue() {
		return targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}
	public int getNumBase() {
		return numBase;
	}
	public void setNumBase(int numBase) {
		this.numBase = numBase;
	}
	public int getTargetNumBase() {
		return targetNumBase;
	}
	public void setTargetNumBase(int targetNumBase) {
		this.targetNumBase = targetNumBase;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}

