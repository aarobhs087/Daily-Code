//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for( long i: arr)   pq.add(i);
        long sum=0;
        while(!pq.isEmpty()){
            long x=pq.poll();
            if(pq.isEmpty()){
                break;
            }
            long y=pq.poll();
            sum+=x+y;
            pq.add(x+y);
        }
        return sum;
    }
}
