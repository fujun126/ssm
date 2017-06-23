package com.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormat implements   Formatter<Date>{

	
	 SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public String print(Date arg0, Locale arg1) {
		return sdf.format(arg0);
	}

	@Override
	public Date parse(String arg0, Locale arg1) throws ParseException {
		return sdf.parse(arg0);
	}

	
	
	
	
	
}
