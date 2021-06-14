package oop.assignment2.ex25;

public class passwordStrengthDetector {

    public int passwordValidator(String password)
    {
        int count = 0;
    // the password only contains numbers and is fewer than 8 nums -- very weak
        if (password.matches("[a-zA-Z]+") == false && password.length() < 8)
            return 0;
        // password is fewer than 8 chars -- weak
        if( password.matches("[a-zA-Z]+") == true && password.length() < 8)
            return 1;

        else if( password.length() >= 8 )
            count += 3;
        else
            count += 2;

// contains number
        if( password.matches("(?=.*[0-9]).*") )
            count += 1;

// contains lowercase letter
        if( password.matches("(?=.*[a-z]).*") )
            count += 1;

//contains uppercase letter
        if( password.matches("(?=.*[A-Z]).*") )
            count += 1;

// contains special character
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            count += 2;

        return count;



    }
}
