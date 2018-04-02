package com.brainacad.prj2;

import com.brainacad.prj2.Commands.*;
import com.brainacad.prj2.StringParser.CommandParser;
import com.brainacad.prj2.StringParser.ICommandParser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String result = "";
        while (true) {
            System.out.println("Введите данные: ");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            ICommandParser parser = new CommandParser(userInput);
            ICommandExec strTr = CommandFactory.create(
                    parser.getCommand()
                    ,parser.getData());
            result = strTr.exec();
            System.out.println(parser.getCommand() + ": " + result);
            if (CommandNames.exit.equals(parser.getCommand()))
            {
                break;
            }

        }

    }
}

//import java.util.StringTokenizer;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

////        String st = new String();
////        String st1 = new String(" Hello");
////        String st2 = new String(new char[2]);
////        String st3 = new String(new byte[10]);
////
////        st1.concat(" world! ");
////        st2 = st1 + " Ok!";
////        st1.contains("ll");    // вернет тру если есть совпадение
////        System.out.println(st1.trim());
//
//        //System.out.println(st1.indexOf("ll"));
//        //System.out.println(st1.lastIndexOf("l"));
//
//        String str1 = "Hello world!";
//        String str2 = str1;
//
//        System.out.println(str1.equals(str2));
//
//        str2 = str2 + "_";
//        System.out.println(str1.equals(str2));
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("abcde");
//        sb.append("12345");
//        sb.insert(5,"!");
//
//        String st = "123";
//        String st1 = "123";
//
//        System.out.println(sb.toString());
//
//        StringTokenizer strTok = new StringTokenizer("Go home!", " ");
//        //strTok.nextToken(); //
//        System.out.println(strTok.nextElement());
//        System.out.println(strTok.nextElement());
//
//        Pattern pt = Pattern.compile(".*@.*");
//        Matcher mt = pt.matcher("sdfeaijvzsoi@fdsfsadf.com");
//
//        System.out.println(mt.matches());