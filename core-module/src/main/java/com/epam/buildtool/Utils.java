package com.epam.buildtool;
import org.example.StringUtils;

public class Utils {
    StringUtils stringUtils= new StringUtils();
    public boolean isAllPositiveNumbers(String[] inputs)
    {
        boolean result=false;
        for (String s1:inputs)
        {
            if (stringUtils.isPositiveNumber(s1))
            {
                result=true;
                continue;
            }
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }
}
