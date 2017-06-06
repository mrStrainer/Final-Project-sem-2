package ControlLayer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFunction 
{
	public static void checkName(String name) {
		String str = name;
		String searchPattern = "^[a-zA-Z]";
        
        Pattern pattern = Pattern.compile(searchPattern);
 
        Matcher m = pattern.matcher(str);

        if(m.matches())
          System.out.println(name + " exists");
        else
            System.out.println(name + " does not exist");
        	
}
