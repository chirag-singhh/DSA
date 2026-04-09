class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for(int i = 1; i < temperatures.length;i++){
            int currTemp = temperatures[i];
            while(!st.isEmpty()){
                int idx = st.peek();
                int stTop = temperatures[idx];

                if(stTop < currTemp){
                    ans[idx] = i - idx;
                    st.pop();
                }
                else{
                    break;
                }

                
            }
            st.push(i);
        }
        return ans;
    }
}