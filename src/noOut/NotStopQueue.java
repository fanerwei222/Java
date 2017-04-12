package noOut;

import java.util.PriorityQueue;

/**
 * Created by fanwei on 2017/3/24.
 */
public class NotStopQueue {
    private int queueSize = 10;
    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(queueSize);

    public static void main(String[] args)
    {
        NotStopQueue notStopQueue = new NotStopQueue();
        Producer producer = notStopQueue.new Producer();
        Consumer consumer = notStopQueue.new Consumer();

        producer.start();
        consumer.start();
    }

    class Consumer extends Thread
    {
        @Override
        public void run() {
            consume();
        }

        private void consume()
        {
            while (true)
            {
                synchronized (priorityQueue)
                {
                    while (priorityQueue.size() == 0)
                    {
                        try {
                            System.out.println("队列空，等待数据");
                            priorityQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            priorityQueue.notify();
                        }
                    }
                    priorityQueue.poll(); //每次移走队首元素
                    priorityQueue.notify();
                    System.out.println("从队列取走一个元素，队列剩余"+priorityQueue.size()+"个元素");
                }
            }
        }
    }

    class Producer extends Thread
    {
        @Override
        public void run() {
            produce();
        }

        private void produce()
        {
            while (true)
            {
                synchronized (priorityQueue)
                {
                    while (priorityQueue.size() == queueSize)
                    {
                        try {
                            System.out.println("队列满，等待有空余空间");
                            priorityQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            priorityQueue.notify();
                        }
                    }
                    priorityQueue.offer(1);
                    priorityQueue.notify();
                    System.out.println("向队列取中插入一个元素，队列剩余空间："+(queueSize-priorityQueue.size()));
                }
            }
        }
    }
}
