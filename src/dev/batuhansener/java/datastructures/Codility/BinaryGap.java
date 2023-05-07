package dev.batuhansener.java.datastructures.Codility;

public class BinaryGap {
    public static void main(String[] args){
        BinaryGap binaryGap = new BinaryGap();
        int gap = binaryGap.Solution(32);
        System.out.println(gap);
    }

    public int Solution(int N){
        String sBinary = Integer.toString(N, 2);
        boolean started = false;
        int counter = 0, maxCount = 0;

        //System.out.println(sBinary);
        for (int i=0 ; i < sBinary.length() ; i++){
            String s = sBinary.substring(i, i+1);
            //System.out.println(s);
            if (s.equalsIgnoreCase("1")){
                if (started){
                    if (counter > maxCount){
                        maxCount = counter;
                    }
                }
                counter = 0;
                started = true;
            }else if(s.equalsIgnoreCase("0")){
                counter++;
            }
        }
        return maxCount;
    }
}
