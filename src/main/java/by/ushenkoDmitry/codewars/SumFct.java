package by.ushenkoDmitry.codewars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        n = n.add(BigInteger.ONE);

        List<BigInteger> squares = new ArrayList<>();
        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;
        squares.add(BigInteger.ONE);
        while (!BigInteger.valueOf(squares.size()).equals(n)) {
            squares.add(prev.add(curr));
            prev = curr;
            curr = squares.get(squares.size()-1);
        }

        BigInteger p = squares.stream().reduce(BigInteger.ZERO, BigInteger::add).multiply(BigInteger.valueOf(4));

        return p;
    }

}
