// Last updated: 9/16/2025, 9:33:20 AM
class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {
        left=new PriorityQueue<>((a,b)->b-a);
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        
        if(right.size()>left.size()) {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size()){
            return left.peek();
        }
        return (left.peek() + right.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */