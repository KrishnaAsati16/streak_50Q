import java.util.Stack;

public class array19 {    
      public static int trap(int[] height) {
        int n = height.length;
        int water = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
        
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();

                if (stack.isEmpty()) break;

                int distance = i - stack.peek() - 1; // width 
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                water += distance * boundedHeight;
            }
            stack.push(i);
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Rain Water: " + trap(height));
    }

    
}
