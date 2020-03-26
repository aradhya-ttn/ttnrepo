package com.im;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;

public class FirstTest {
    First first= new First();
    @Test
     public void shouldRreturnTtrueWhenStringIsPallindrome(){

        //given

        String str="nitin";
        //when

        boolean pallindrome=first.isPallindrome(str);
        //then

        assertTrue( pallindrome);
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotPallindrome(){

        //given

        String str="aman";
        //when

        boolean pallindrome=first.isPallindrome(str);
        //then

        assertFalse( pallindrome);
    }
    @Test
    public void shouldReturnIntegerWhichAreNotEven(){
        //given
        List<Integer> integers=new ArrayList<>();
        integers.add(3);
        integers.add(53);
        integers.add(17);
        integers.add(33);
        integers.add(12);
        integers.add(30);
        integers.add(13);

        //when
        List<Integer> notEvenNumber=first.filterEvenElements(integers);

        //then
        Integer a[] =new Integer[]{3,53,17,33,13};
        Integer newArray[]=new Integer[a.length];
        for (int i = 0; i <a.length ; i++) {
            newArray[i]=(Integer) notEvenNumber.get(i);
        }
        assertArrayEquals(a,newArray);
    }
    @Test
    public void shouldCalculateAverageOfBigdecimalNumber(){
        //given
        List<BigDecimal> bigDecimalList=new ArrayList<>();
        bigDecimalList.add(new BigDecimal(346736543.67564346));
        bigDecimalList.add(new BigDecimal(74568476534.34325));
        bigDecimalList.add(new BigDecimal(123274132.5341534));
        bigDecimalList.add(new BigDecimal(4324.4387832));

        //when
        BigDecimal bigDecimalAverage=first.calculateAverage(bigDecimalList);
        boolean result= bigDecimalAverage instanceof BigDecimal;
        //then
        assertTrue(result);

    }
    @Test
    public void shouldReturnExceptonWhenInputIsInvalid(){
        //given
        List<BigDecimal> list=  new ArrayList<>();
        //when
        Executable executable=()->first.calculateAverage(list);

        //then
        assertThrows(RuntimeException.class,executable);
    }
    @Test
    public void shiouldReturnFalseIsStringIsReplaced(){
        //given
        String mainString="hello java";
        String subString="hello";
        String replacementString="bye";
        //when
        String newString=first.replaceSubString(mainString,subString,replacementString);
        boolean result= newString.equals(mainString);
        //then
        assertFalse(result);

    }

}