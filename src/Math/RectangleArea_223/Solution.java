package Math.RectangleArea_223;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rec1=Math.abs(A-C)*Math.abs(B-D);
        int rec2=Math.abs(E-G)*Math.abs(F-H);
        
        //Pure comparison based judgment in CS!!!!!!!!!!!
        int left=Math.max(A,E);
        int right=Math.min(C,G);
        int top=Math.min(D,H);
        int bottom=Math.max(F,B);
        
        int overLap=0;
        if(left<right && top>bottom)
            overLap=Math.abs(left-right)*Math.abs(top-bottom);
        
        return rec1+rec2-overLap;
    }
}