package com.sgp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDates {

	public static Date converteStringDate(String data) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     Date datas = sdf.parse(data);
	     return datas;
	}

	
}
