
public class Stack01 {
    public static void main(String[] args) {

        int[] carriage = {1, 2, 3, 4, 5};

        StackLinkedList stack = new StackLinkedList();

        for (int car : carriage) {
            System.out.println("Siding onto dead-end track: Car " + car);
            stack.push(car);
        }

        System.out.println();
        System.out.println("Stack -> " + stack);

        System.out.println();

        while (!stack.isEmpty()) {
            int car = (Integer) stack.pop();
            System.out.println("Exiting a dead-end: Car " + car);
        }

        System.out.println();
        System.out.println("Stack -> " + stack);
    }
}