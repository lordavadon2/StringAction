package com.brainacad.prj2.StringParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator implements IInputValidator {

    private String data;

    public InputValidator(String data) {
        this.data = data;
    }

    @Override
    public boolean validate() {
        return checkInputFormat();
    }

    private boolean checkInputFormat(){
        Pattern pattern = Pattern.compile("exit |(\\w+ \\w*)");
        Matcher matcher = pattern.matcher(this.data);
        return matcher.matches();
    }
}
