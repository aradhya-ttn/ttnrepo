package healthycoderapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.runners.Parameterized;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;

class BMICalculatorTest {

    private String environment="prod";
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All unit tests");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After All unit tests");
    }
    @Nested
    class IsDIetRecommendedTests{
        @Test
        void ShouldReturnFalseWhenDietNotRecommended(){
            //given

            double weight=50.0;
            double height=1.92;
            //when

            boolean recommended = BMICalculator.isDietRecommended(weight,height);
            //then

            assertFalse(recommended);
        }
        @Test
        void ShouldReturnTrueWhenDietRecommended(){
            //given

            double weight=89.0;
            double height=1.72;
            //when

            boolean recommended = BMICalculator.isDietRecommended(weight,height);
            //then

            assertTrue(recommended);
        }
        @Test
        void ShouldThrowArithmeticExceptionWhenHeightIsZero(){
            //given
            double weight=50.0;
            double height=0.0;

            //when
            Executable executable=()->BMICalculator.isDietRecommended(weight,height);
            //then
            assertThrows(ArithmeticException.class,executable);
        }

    }
    @Nested
    @DisplayName("sample inner class")
    class CodersWithWorstBMI {

        @Test
        @DisplayName("Sample Method display name")

        void shouldReturnCoderNameWhenCoderListIsNotEmpty() {
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.82, 98.0));
            coders.add(new Coder(1.82, 64.7));
            //when
            Coder coderWithWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertAll(
                    () -> assertEquals(1.82, coderWithWorstBMI.getHeight()),
                    () -> assertEquals(98.0, coderWithWorstBMI.getWeight()));
        }

        @Test
        void shouldReturnCoderWithWorstBMIIn1MsWhenCoderListHas10000Elements() {
            //given
            assumeTrue(BMICalculatorTest.this.environment.equals("prod"));
            List<Coder> coders = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                coders.add(new Coder(1.0 + i, 10.0 + i));
            }
            //when
            Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertTimeout(Duration.ofMillis(50), executable);
        }

        @Test
        void shouldReturnNullWorstBMICoderWhenCOderListEmpty() {
            //given
            List<Coder> coders = new ArrayList<>();

            //when

            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertNull(coderWorstBMI);
        }

        @Test
        void shouldReturnCorrectBMIScoreArrayWhenCoderListIsNotEmpty() {
            //given

            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.82, 98.0));
            coders.add(new Coder(1.82, 64.7));
            double[] expected = {18.52, 29.59, 19.53};
            //when
            double[] bmiScores = BMICalculator.getBMIScores(coders);
            //then
            assertArrayEquals(expected, bmiScores);
        }


    }



}