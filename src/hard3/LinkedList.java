package hard3;

import java.util.Arrays;

public class LinkedList<E> extends AbstractList<E> {

    private Link<E> head;
    private Link<E> tail;

    private static class Link<E> {
        E element;
        Link<E> next;
        Link<E> prev;

        Link(E element) {
            this.element = element;
        }
    }

    @Override
    public void add(E element) {
        Link<E> newLink = new Link<>(element);
        if (head == null) {
            head = tail = newLink;
        } else {
            tail.next = newLink;
            newLink.prev = tail;
            tail = newLink;
        }
        size++;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return getLink(index).element;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Link<E> link = getLink(index);
        if (link.prev != null) {
            link.prev.next = link.next;
        }
        if (link.next != null) {
            link.next.prev = link.prev;
        }
        if (link == head) {
            head = link.next;
        }
        if (link == tail) {
            tail = link.prev;
        }
        size--;
    }

    private Link<E> getLink(int index) {
        Link<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
