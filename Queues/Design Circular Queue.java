class MyCircularQueue {
     
      int []cq;
        int front=0; 
        int rear=-1;
        int len=0; 
    public MyCircularQueue(int k) {
       
        cq=new int[k];
    }
    
    public boolean enQueue(int value) {
         if(!isFull()){
            rear=(rear+1)%cq.length;
            cq[rear]=value;
            len++;
            return true;
         }
         return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
              front=(front+1)%cq.length;
             len--;
             return true;
        }
        return false;
    }
    
    public int Front() {
        return isEmpty() ? -1 : cq[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1: cq[rear];
    }
    
    public boolean isEmpty() {
        return (len==0);
    }
    
    public boolean isFull() {
        return (cq.length==len);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
