package pl.myprojects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DivisorsTest {
    private final Divisors divisors = new Divisors();

    @Test
    void shouldReturnEqualsFor16(){

        //given
        List<Integer> expectedList = List.of(-16,-8,-4,-2,-1,1,2,4,8,16);

        //when
        List<Integer> result = divisors.findDivisors(16);

        //then
        Assertions.assertEquals(result, expectedList);
    }

    @Test
    void shouldReturnEqualsForMinus4(){

        //given
        List<Integer> expectedList = List.of(-4,-2,-1,1,2,4);

        //when
        List<Integer> result = divisors.findDivisors(-4);

        //then
        Assertions.assertEquals(result, expectedList);
    }
    @Test
    void shouldReturnEqualsFor0(){

        //given
        List<Integer> expectedList = List.of();

        //when
        List<Integer> result = divisors.findDivisors(0);

        //then
        Assertions.assertEquals(result, expectedList);
    }
}