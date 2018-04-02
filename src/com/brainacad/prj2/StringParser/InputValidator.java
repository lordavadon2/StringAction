package com.brainacad.prj2.StringParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator implements IInputValidator {

    private String data;

    public InputValidator(String data){
        this.data = data;
    }

    private void checkInputFormat() throws ValidationExaption {
        Pattern pattern = Pattern.compile("exit|(\\w+ \\w*)");
        Matcher matcher = pattern.matcher(this.data);
        if (!matcher.matches()) {throw new ValidationExaption("Not matches with command input pattern");}
    }

    @Override
    public boolean validate() throws ValidationExaption {
        checkInputFormat();
        return false;
    }
}
