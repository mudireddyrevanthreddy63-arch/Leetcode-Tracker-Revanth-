// Last updated: 11/08/2026, 14:17:04
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i = 0; i < temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
            {
                
                answer[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return answer;
    }
}