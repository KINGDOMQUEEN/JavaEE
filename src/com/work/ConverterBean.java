package com.work;

public class ConverterBean {
	private String source = "";
	private String destination = "";
	private String s_input = "";
	private String d_output = "";

	public void init() {
		setD_output(converter(source, destination, s_input));
	}

	public String converter(String source, String destination, String s_input) {
		switch (source) {
		    case "decimalism":
		        switch (destination) {
		            case "decimalism":
		                d_output = s_input;
		                break;
		            case "binary":
		            	d_output = Integer.toBinaryString(Integer.parseInt(s_input));
		                break;
		            case "octonary":
		            	d_output = Integer.toOctalString(Integer.parseInt(s_input));
		                break;
		            case "hexadecimal":
		            	d_output = Integer.toHexString(Integer.parseInt(s_input));
		                break;
		            default:
		                break;
		        }
		        break;
		    case "binary":
		        switch (destination) {
		            case "decimalism":
		            	d_output = "" + Integer.parseInt(s_input, 2);
		                break;
		            case "binary":
		                d_output = s_input;
		                break;
		            case "octonary":
		            	d_output = Integer.toOctalString(Integer.parseInt(s_input, 2));
		                break;
		            case "hexadecimal":
		            	d_output = Integer.toHexString(Integer.parseInt(s_input, 2));
		                break;
		            default:
		                break;
		        }
		        break;
		    case "octonary":
		        switch (destination) {
		            case "decimalism":
		            	d_output = "" + Integer.parseInt(s_input, 8);
		                break;
		            case "binary":
		            	d_output = Integer.toBinaryString(Integer.parseInt(s_input, 8));
		                break;
		            case "octonary":
		                d_output = s_input;
		                break;
		            case "hexadecimal":
		            	d_output = Integer.toHexString(Integer.parseInt(s_input, 8));
		                break;
		            default:
		                break;
		        }
		        break;
		    case "hexadecimal":
		        switch (destination) {
		            case "decimalism":
		            	d_output = "" + Integer.parseInt(s_input, 16);
		                break;
		            case "binary":
		                d_output = Integer.toBinaryString(Integer.parseInt(s_input, 16));
		                break;
		            case "octonary":
		            	d_output = Integer.toOctalString(Integer.parseInt(s_input, 16));
		                break;
		            case "hexadecimal":
		                d_output = s_input;
		                break;
		            default:
		                break;
		        }
		        break;
		    default:
		        break;
		}
		return d_output;

	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getS_input() {
		return s_input;
	}

	public void setS_input(String s_input) {
		this.s_input = s_input;
	}

	public String getD_output() {
		return d_output;
	}

	public void setD_output(String d_output) {
		this.d_output = d_output;
	}
	
}
