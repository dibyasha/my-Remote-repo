
package com.flp.ems.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate{
	
  private Pattern pattern;
  private Matcher matcher;
 
  private static String DATE_PATTERN = 
          "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
	  
  public Validate(){
	  pattern = Pattern.compile(DATE_PATTERN);
  }
  
  
 
   public boolean valid_Date(String date){
	  matcher = pattern.matcher(date);
     if(matcher.matches()){
	 matcher.reset();

	 if(matcher.find()){
	
             String day = matcher.group(1);
	     String month = matcher.group(2);
	     int year = Integer.parseInt(matcher.group(3));
				 
	     if (day.equals("31") && 
		  (month.equals("4") || month .equals("6") || month.equals("9") ||
                  month.equals("11") || month.equals("04") || month .equals("06") ||
                  month.equals("09"))) {
			return false; // only 1,3,5,7,8,10,12 has 31 days
	     } else if (month.equals("2") || month.equals("02")) {
                  //leap year
		  if(year % 4==0){
			  if(day.equals("30") || day.equals("31")){
				  return false;
			  }else{
				  return true;
			  }
		  }else{
		         if(day.equals("29")||day.equals("30")||day.equals("31")){
				  return false;
		         }else{
				  return true;
			  }
		  }
	      }else{				 
		return true;				 
	      }
	   }else{
    	      return false;
	   }		  
     }else{
	  return false;
     }			    
   }
   public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		   Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		   public static boolean validate(String emailStr) {
		       Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		       return matcher.find();
		   }
		   public static boolean PhoneNumber(String argv) {

		        String phoneNumber = "9876543210";
		        String regex = "^\\+?[0-9. ()-]{10,25}$";
		        Pattern pattern = Pattern.compile(regex);
		        Matcher matcher = pattern.matcher(phoneNumber);

		        if (matcher.matches()) {
		            System.out.println("Phone Number Valid");
		            return true;
		        } else {
		            System.out.println("Phone Number must be in the form XXX-XXXXXXX");
		        }
				return false;
		    }
		    public static boolean isValid(String text) {
		        if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
		            return false;
		        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		        df.setLenient(false);
		        try {
		            df.parse(text);
		            return true;
		        } catch (ParseException ex) {
		            return false;
		        }
		    }
		    public static boolean validateLetters(String txt) {

			    String regx = "[a-zA-Z]+\\.?";
			    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
			    Matcher matcher = pattern.matcher(txt);
			    return matcher.matches();

			}
		    	
}





