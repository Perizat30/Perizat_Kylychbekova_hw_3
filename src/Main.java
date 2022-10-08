

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        double [] decimal = {1.2, 5.7, 2.7,-4.5,-3.13,3.8,-13.12,4.1,-41.83,15.4,1.2,-51.1,9.12,-31.5,5.8};
        //double [] decimal ={8.0,-2.0,-4.0,2.0,3.0,6.0}; just for check
        System.out.println("The average of positive numbers after the first negative number is:"+calculateAverage(decimal));

    }

    public static double calculateAverage(double[] decimal){
        boolean isaNumberNegative=false;
        double sum=0;
        int n=0;// number of positive numbers after  negative

        for(int i=0;i<decimal.length;i++){
            if(decimal[i]<0) {
                isaNumberNegative=true;
            }
            if(decimal[i]>0){
                if(isaNumberNegative) {
                    sum += decimal[i];
                    n++;
                }
            }

        }
        return sum/n;


/*
1. go through array
2. if i see negative number stop
3. mark that negative number
3. continue
4. take sum of positive numbers after that point
5.return the average of total positive numbers
 */

    }


}
