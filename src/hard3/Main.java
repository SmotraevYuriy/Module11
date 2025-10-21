package hard3;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        int element = arrayList.get(0);
        arrayList.remove(0);
        System.out.println(element);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(6);
        int element2 = linkedList.get(1);
        System.out.println(element2);
        linkedList.remove(0);
        element2 = linkedList.get(0);
        System.out.println(element2);
    }
}
