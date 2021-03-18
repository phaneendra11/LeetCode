package lets.code;

public class _11_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxVolume = 0;
        int i=0, j=height.length - 1;
        
        while (i < j) {
            if (height[i] < height[j]) {
                maxVolume = Math.max(maxVolume, height[i] * (j-i));
                i++;
            } else {
                maxVolume = Math.max(maxVolume, height[j] * (j-i));
                j--;
            }
        }
        return maxVolume;
    }
    
    public static void main(String[] args) {
    	_11_ContainerWithMostWater t = new _11_ContainerWithMostWater();
    	
    	System.out.println(t.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    	
    	System.out.println(t.maxArea(new int[] {1,1}));
    	
    	System.out.println(t.maxArea(new int[] {4,3,2,1,4}));
    	
    	System.out.println(t.maxArea(new int[] {1,2,1}));
	}
	
}
