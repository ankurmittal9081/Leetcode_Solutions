// Last updated: 9/16/2025, 9:32:41 AM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<points.length;i++){
            int cord[]=points[i];
            int x=cord[0];
            int y=cord[1];
            int dis=(int)(((x*x)+(y*y))^(1/2));
            pq.add(new int []{dis,x,y});
            if(pq.size()>k) pq.poll();
        }
        int res[][] = new int[k][2];
        for(int i=0;i<res.length;i++){
            int triplet[]=pq.poll();
            int x=triplet[1];
            int y=triplet[2];
            res[i][0]=x;
            res[i][1]=y;
        }
        return res;
    }
}