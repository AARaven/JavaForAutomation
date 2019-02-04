package Collections.CustomLinkedList;

class CustomNode<T> {
    
    T nodeValue;
    CustomNode nextNode;
    
    public T getNodeValue() {
        return this.nodeValue;
    }
    
    public void setNodeValue( T nodeValue ) {
        this.nodeValue = nodeValue;
    }
    
    public CustomNode getNextNode() {
        return this.nextNode;
    }
    
    public void setNextNode( CustomNode nextNode ) {
        this.nextNode = nextNode;
    }
    
    CustomNode( T value ) {
        this.nodeValue = value;
    }
}
