package Validation;

public class ValidationClass {
	int isValid; 
	
	
	
	public ValidationClass(int isValid) {
		this.isValid = isValid;
	}
	
	
	
	public int getIsValid() {
		return isValid;
	}



	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}



	public static boolean validateNumber3(String userInput) {
		
        try {
            int isValid;
        	isValid = Integer.parseInt(userInput);
            if ((isValid < 0) || (isValid > 3)) {
                System.out.println("You did not enter a number between 1 and 3. Please try again!");
        	    return true;
            }
           
            return false;
        }

        catch (NumberFormatException e) {
    	    return true;
        }

	}
	
	public static boolean validateNumber2(String userInput) {

	       try {

	           int isValid = Integer.parseInt(userInput);
	           if ((isValid < 0) || (isValid > 2)) {
	               System.out.println("You did not enter a number between 1 and 3. Please try again!");
	        	   return true;
	           }
	           
	           return false;
	       }

	       catch (NumberFormatException e) {
	    	   return true;
	       }

	}
	
}
