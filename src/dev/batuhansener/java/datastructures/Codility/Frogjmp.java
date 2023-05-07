package dev.batuhansener.java.datastructures.Codility;

public class Frogjmp {
    public static void main(String[] args) {
        System.out.println(Frogjmp.solution(10,85,30));
        System.out.println(Frogjmp.altSolution(10,85,30));
    }

    public static int solution(int x, int y, int d){
        int counter=0;
        while (x<y){
            x+=d;
            counter++;
        }
        return counter;
    }

    public static int altSolution(int x, int y, int d){
        int gap = y-x;
        int c = (int) Math.ceil((double)gap/d);
        return c;
    }
}
