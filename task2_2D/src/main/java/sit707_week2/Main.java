package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
      SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        SeleniumOperations.alternative_registration_page("https://www.thegoodguys.com.au/UserRegistrationForm?"
				+ "new=Y&catalogId=16601&myAcctMain=&langId=-1&storeId=900");
    }
}
