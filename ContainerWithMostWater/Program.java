import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program{
    public static void main(String[] args) {
        int height[] = {1,1};
        int leftLine = 0;
        int rightLine = height.length - 1;
        int ans = 0;

        while(leftLine < rightLine){
            int width = rightLine - leftLine;
            int ht = Math.min(height[leftLine], height[rightLine]);
            int waterHeld = width * ht;
            ans = Math.max(waterHeld, ans);
            if(leftLine < rightLine) leftLine++;
            else rightLine--;
        }
        System.out.println(ans);

    }
}