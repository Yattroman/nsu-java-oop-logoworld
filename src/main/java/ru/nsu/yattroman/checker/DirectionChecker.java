package ru.nsu.yattroman.checker;

public class DirectionChecker extends ArgsChecker{
    @Override
    public boolean check(String... args){

        if(args[0].equals("L") ||  args[0].equals("R") || args[0].equals("U") || args[0].equals("D"))
            return true;

        return false;
    }
}