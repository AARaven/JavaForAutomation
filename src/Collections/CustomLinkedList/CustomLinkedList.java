package Collections.CustomLinkedList;

public class CustomLinkedList<T> {

    public CustomNode firstNode;
    public CustomNode lastNode;
    public int positionCount;
    
    
    private void swap( CustomLinkedList <T> customLinkedList, int index, int target ) {
    
    }
    
    // FIXME: 04.02.2019

    public int size() {
        return this.positionCount;
    }

    
    

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList<String >(){{
        
//            addElement( "One" );
//            addElement( "Two" );
//            addElement( "Three" );
//            addElement( "Four" );
//            addElement( "Five" );
//            addElement( "Six" );
//            addElement( "Seven" );
//            addElement( "Eight" );
//            addElement( "Nine" );
//            addElement( "Ten" );
        
        }};
        
        System.out.println(linkedList.size());
    
    
    }
}
