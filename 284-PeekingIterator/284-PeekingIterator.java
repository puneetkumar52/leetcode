// Last updated: 7/1/2026, 8:59:20 AM
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement; 
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
        if(iterator.hasNext()){
            nextElement= iterator.next();
        }
        else{
            nextElement=null;
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int ans =nextElement;
        if(iterator.hasNext()){
            nextElement= iterator.next();
        }
        else{
            nextElement=null;
        }
        return ans;
	}
	
	@Override
	public boolean hasNext() {
	    return nextElement!=null;
	}
}