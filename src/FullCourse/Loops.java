package FullCourse;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,60};
        int sum = 0;
        int nmb = 10;
        int multiplier = 1;

        for (int index = 0; index < numbers.length; index ++) {
            sum+= numbers[index];
            //System.out.println(sum);
        }
        System.out.println(sum);

        //ForNestedLoop
          for (int number = 1; number <= 10; number++){
            for (int count = 1; count <= 10; count++){
                System.out.printf("%d X %d = %d \n", number, count, number * count);
            }
        }


        //While Loop
//        while(multiplier <= 10){
//            System.out.printf("%d X %d = %d \n", nmb, multiplier, nmb * multiplier);
//            multiplier++;
//        }



//        //DoWhile Loop
//        do {
//            System.out.printf("%d X %d = %d \n", nmb, multiplier, nmb * multiplier);
//            multiplier++;
//        } while(multiplier <= 10);
    }

}

