// Last updated: 9/16/2025, 9:32:55 AM
    class Solution {
        public int[] asteroidCollision(int[] arr) {
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<arr.length;i++){
                boolean flag=true;
                while(!st.isEmpty() && arr[i]<0 && st.peek()>0)
                {
                    int peek=st.peek();
                    if(peek==arr[i]*-1){
                        st.pop();
                        flag=false;
                        break;
                    }

                    else if(peek==arr[i]|| peek*arr[i]>0|| peek<0 && arr[i]>0){
                        break;
                    }

                    else if(Math.abs(peek)> Math.abs(arr[i]))
                    {
                        flag=false;
                        break;
                    }

                    // else if(Math.abs(peek)< Math.abs(arr[i]))
                    // {
                        st.pop();
                    // }

                }
                if(flag){
                    st.push(arr[i]);
                }


            }

            int res[]=new int[st.size()];
            int j=0;
            for(int i:st){
                res[j++]=i;

            }
            return res;
        }
    }