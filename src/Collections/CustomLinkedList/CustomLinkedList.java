package Collections.CustomLinkedList;

public class CustomLinkedList<T> implements CustomIterator {

    public CustomNode firstNode;
    public CustomNode lastNode;
    public int positionCount;

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

    public int size() {
        return this.positionCount;
    }

    @Override
    public boolean hasNext() {
        return this.firstNode != null;
    }

    @Override
    public void next() {
        this.firstNode = this.firstNode.nextNode;
    }

    public void forEachRemaining() {
        CustomNode currentNode = this.firstNode;
        while (currentNode != null) {
            System.out.println("Element of list : " +currentNode.nodeValue);
            currentNode = currentNode.nextNode;
        }
    }
//// TODO: create reverse method!
    public void reverseElements() {

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
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(secondValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(thirdValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(fourthValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.addElement(fifthValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(fifthValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(fourthValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(thirdValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(secondValue);
        System.out.println("Size : "+linkedList.positionCount);
        System.out.println(linkedList.firstNode.nodeValue);
        System.out.println(linkedList.lastNode.nodeValue);
        System.out.println(linkedList.lastNode.nextNode);

        linkedList.forEachRemaining();

        linkedList.removeElement(firstValue);

        linkedList.forEachRemaining();


        // test iterator:
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.hasNext()) {
                System.out.println(linkedList.firstNode.nodeValue);
                linkedList.next();
            }
        }

    }
}
