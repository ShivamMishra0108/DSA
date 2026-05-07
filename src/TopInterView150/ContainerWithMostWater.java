package TopInterView150;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int i=0;
        int j= height.length-1;
        int maxArea = 0;

        while(i<j){
            int curArea = Math.min(height[i],height[j])*(j-i);
            maxArea = Math.max(curArea,maxArea);

            if(height[i]<height[j])i++;
            else j--;
        }
        return maxArea;
    }
}
