package TwoD.RectangleArea_223;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int Area1=Math.abs(C-A)*Math.abs(D-B);
        int Area2=Math.abs(G-E)*Math.abs(H-F);
        int AreaOverlap=0;
        
        //Get overlap square vertex info(the key info is the two-corner):
        int left=Math.max(A, E);
        int right=Math.min(C, G);
        int top=Math.min(D, H);
        int bottom=Math.max(B, F);
        if(left<right && top>bottom)
        	AreaOverlap=Math.abs(left-right)*Math.abs(top-bottom);
        
        return Area1+Area2-AreaOverlap;
    }
}