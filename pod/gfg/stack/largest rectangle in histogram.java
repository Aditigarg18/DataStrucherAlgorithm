class Solution {
    public static int getMaxArea(int arr[]) {
Stack<Integer> st = new Stack<>();
int max_area = 0;
for (int i = 0; i < arr.length; i++) {
    while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
        int height = arr[st.pop()];
        int next_small_elem = i;
        int prev_small_elem = (st.isEmpty()) ? -1 : st.peek();
        int width = next_small_elem - prev_small_elem - 1;
        max_area = Math.max(height * width, max_area);
    }
    st.push(i);
}
while (!st.isEmpty()) {
    int height = arr[st.pop()];
    int next_small_elem = arr.length;
    int prev_small_elem = (st.isEmpty()) ? -1 : st.peek();
    int width = next_small_elem - prev_small_elem - 1;
    max_area = Math.max(max_area, height * width);
}
return max_area;

    }
}
