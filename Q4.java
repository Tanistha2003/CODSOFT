import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.MalformedInputException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Q4 {
    
    public static void main(String args[]) throws IOException
    {
        HashMap<Integer, String> currency=new HashMap<Integer, String>();

        currency.put(1,"USD");
        currency.put(2,"EUR");
        currency.put(3,"INR");
        currency.put(4,"GBP");
        currency.put(5,"CAD");
        currency.put(6,"AUD");
        currency.put(7,"THB");

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");
        System.out.println("1.US Dollars (USD)");
        System.out.println("2.Euro (EUR)");
        System.out.println("3.Indian Rupees (INR)");
        System.out.println("4.British Pound (GBP)");
        System.out.println("5.Canadian Dollars (CAD)");
        System.out.println("6.Australian Dollars (AUD)");
        System.out.println("7. Thai Baht (THB)");

        System.out.println("Enter your choice of currency you want to convert from");
        int ch=sc.nextInt();
        String from=currency.get(ch);

        System.out.println("Enter your choice of currency you want to convert to");
        int ch1=sc.nextInt();
        String to=currency.get(ch1);

        System.out.println("\nEnter the amount to convert");
        double amount=sc.nextDouble();
        
         sendHttpGetRequest(from,to,amount);

        System.out.println("\nThank You for using the Currency Converter");
         sc.close();
    }

    private static void sendHttpGetRequest(String from,String to, double amount) throws IOException
    {
       
       // Making Request
        String Api="969dfafe0f2644f720db0445";
        String get_URL = "https://v6.exchangerate-api.com/v6/"+Api+"/pair/"+from+"/"+to+"/"+amount;
        URL url=new URL(get_URL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        int responseCode=request.getResponseCode();

        //to check if response is correct
        if(responseCode!=HttpURLConnection.HTTP_OK)
        {
            System.out.println("Got http response code "+responseCode);
            return ;
        }
        
        //read data into response body
        InputStream in=request.getInputStream();

        BufferedReader reader = new BufferedReader( new InputStreamReader( in ) );
        StringBuilder sb = new StringBuilder();
        String line = null;
        while((line=reader.readLine()) != null) 
        sb.append(line);

        reader.close();

        // The response data as a String
        String data = sb.toString();

        
       data=data.substring(399,data.length()-3);
        System.out.println(data);
        
    }

}



