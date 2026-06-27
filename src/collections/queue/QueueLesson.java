package collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLesson {
    /*
     *Javada Queue interface ni 2 ta klassi bor bular
     * PriorityQueue vs ArrayDeuqueue
     * PirorityQueue --> bu malumotlarni prioriteti boyicha saqlaydi
     * agar  biz custom objectlarimiz ni priorityqueue da saqlamochi bolsak, comparebleda impple olish kerak vs compareTo methodini override qilish kerak
     *
     * ArrayDequeue --> FIFO bolib malumot saqlaydi,
     *
     *
     * */
    public static void main(String[] args) {
        /*Queue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task(5,"Meduim"));
        tasks.add(new Task(8,"Swtich of Air machine"));
        tasks.add(new Task(2," Product Transfer"));
        System.out.println(tasks);*/

        Queue<Integer> nums = new ArrayDeque<>();
        nums.add(12);
        nums.add(1);
        nums.add(13);
        nums.add(135);
        System.out.println(nums);



    }
}
