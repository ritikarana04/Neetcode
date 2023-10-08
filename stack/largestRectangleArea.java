class Solution {
    public int largestRectangleArea(int[] heights) {
        


    
        int max = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        // Next Smaller Right = O(n)
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left = O(n)
        s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current area: width = j - i - 1 = nsl[i] - nsr[i] - 1
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int curr = height * width;
            max = Math.max(curr, max);
        }
        return max;
        
    }
}

    /*public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // Heights in histograms
        largestRectangleArea(arr);
    }
}

    }
}*/
