package Collections.CustomLinkedList;

public class CustomLinkedList<T> implements CustomIterator {

    private CustomNode firstNode;
    private CustomNode lastNode;
    private int positionCount;

    public void addElement(T value) {
        CustomNode nodeLink = new CustomNode(value);
        if (this.firstNode == null) {
            this.firstNode = nodeLink;
            this.lastNode = nodeLink;
        } else {
            this.lastNode.nextNode = nodeLink;
            this.lastNode = nodeLink;
        }
        this.positionCount++;
    }

    public boolean removeElement(T value) {
        CustomNode nodePrev = null;
        CustomNode nodeCurrent = this.firstNode;

        while (nodeCurrent != null) {
            if (nodeCurrent.nodeValue.equals(value)) {
                if (nodePrev != null) {
                    nodePrev.nextNode = nodeCurrent.nextNode;
                    if (nodeCurrent.nextNode == null) {
                        this.lastNode = nodePrev;
                    }
                } else {
                    this.firstNode = this.firstNode.nextNode;
                    if (this.firstNode == null) {
                        this.lastNode = null;
                    }
                }
                this.positionCount--;
                return true;
            }
            nodePrev = nodeCurrent;
            nodeCurrent = nodeCurrent.nextNode;
        }
        return false;
    }

    public void removeAllElements() {
        this.firstNode = null;
        this.lastNode = null;
        this.positionCount = 0;
    }

    @Override
    public boolean hasNext() {
        return this.lastNode.nextNode != null;
    }

    @Override
    public Object next() {
        return this.lastNode.nextNode.nodeValue;
    }

    public void forEachRemaining() {
        CustomNode currentNode = this.firstNode;
        while (currentNode != null) {
            System.out.println("Element of list : " +currentNode.nodeValue);
            currentNode = currentNode.nextNode;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();

        System.out.println(linkedList);

        String firstValue = "firstValue";
        String secondValue = "secondValue";
        String thirdValue = "thirdValue";
        String fourthValue = "fourthValue";
        String fifthValue = "fifthValue";

        linkedList.addElement(firstValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(secondValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(thirdValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(fourthValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(fifthValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(fifthValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(fourthValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(thirdValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(secondValue);
        System.out.println(linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(firstValue);

        linkedList.forEachRemaining();

    }
}