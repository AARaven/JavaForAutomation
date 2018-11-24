package Collections.CustomLinkedList;

public class CustomLinkedList<T>  {

    private CustomNode node;
    private int positionCount;

    public void addElement(T value) {
        this.node = new CustomNode(value);
        if (this.node.firstNode == null) {
            this.node.firstNode = this.node;
            this.node.lastNode = this.node;
        } else {
            this.node.lastNode.nextNode = this.node;
            this.node.lastNode = this.node;
        }
        this.positionCount++;
    }

    public boolean removeElement(T value) {
        CustomNode<T> previous = null;
        CustomNode<T> current = this.node.firstNode;

        while (current != null) {
            if (current.value.equals(value)) {
                if (previous != null) {
                    previous.nextNode = current.nextNode;
                    if (current.nextNode == null) {
                        this.node.lastNode = previous;
                    }
                } else {
                    this.node.firstNode = this.node.firstNode.nextNode;

                    if (this.node.firstNode == null) {
                        this.node.lastNode = null;
                    }
                }
                this.positionCount--;
                return true;
            }
            previous = current;
            current = current.nextNode;
        }
        return false;
    }

    public static void main(String[] args) {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        System.out.println(linkedList);
        String firstValue = "111 ";
        String secondValue = " 222";
        String thirdValue = " 333";

        linkedList.addElement(firstValue);
        System.out.println(linkedList.positionCount);
        linkedList.addElement(secondValue);
        System.out.println(linkedList.positionCount);
        linkedList.addElement(thirdValue);
        System.out.println(linkedList.positionCount);
        linkedList.removeElement(thirdValue);
        System.out.println(linkedList.positionCount);




    }
}