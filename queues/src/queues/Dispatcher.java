package queues;
import java.util.*;
public class Dispatcher {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue (2, new Comparator<Integer>() {
			public int compare (Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		q.offer(7);
		q.offer(9);
		System.out.println(q);
		q.offer(1);
		q.offer(6);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
	}

}
