/**
 * @author your_name
 * This class contains main method for testing
 */
import java.util.Random;
import java.util.Scanner;


public class Driver3 {

    private static Random rand = new Random();
    private static DLLStack dllStack = new DLLStack();
    private static LLStack llStack = new LLStack();
    private static VectorStack vectorStack = new VectorStack();

    private static DLLQueue dllQueue = new DLLQueue();
    private static LLQueue llQueue = new LLQueue();
    private static VectorQueue vectorQueue = new VectorQueue();

    //test the stack adding with data.length operation push
    // return the miliseconds to run function
    public static long testStackAdding(Stack s, String[] data)
    {
        long start = System.currentTimeMillis();
        for (int i=0; i < data.length; i++)
        {
            s.push(data[i]);
        }
        return System.currentTimeMillis() - start;
    }

    //test the quuee adding with data.length operation enqueue
    // return the miliseconds to run function
    public static long testQueueAdding(Queue q, String[] data)
    {
        long start = System.currentTimeMillis();
        for (int i=0; i < data.length; i++)
        {
            q.enqueue(data[i]);
        }
        return System.currentTimeMillis() - start;
    }

    //test the stack removing with n operation pop
    // return the miliseconds of n operation pop
    public static long testStackRemoving(Stack s, int n)
    {
        long start = System.currentTimeMillis();
        for (int i=0; i < n; i++)
        {
            s.pop();
        }
        return System.currentTimeMillis() - start;
    }

    //test the queue removing with n operation dequeue
    // return the miliseconds of n operation dequeue
    public static long testQueueRemoving(Queue q, int n)
    {
        long start = System.currentTimeMillis();
        for (int i=0; i < n; i++)
        {
            q.dequeue();
        }
        return System.currentTimeMillis() - start;
    }

    //test removing method pop and dequeue
    public static void testRemoving()
    {
        int initializeItems =10000;
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you wish to add?");
        int n = input.nextInt();
        if ( n > initializeItems )
        {
            initializeItems = n + 10000;
        }
        prepareData(initializeItems);

        long vectorStackTime = testStackRemoving(vectorStack, n);
        long llStackTime = testStackRemoving(llStack, n);
        long dllStackTime = testStackRemoving(dllStack, n);

        long vectorQueueTime = testQueueRemoving(vectorQueue, n);
        long llQueueTime = testQueueRemoving(llQueue, n);
        long dllQueueTime = testQueueRemoving(dllQueue, n);

        System.out.println("\nMilliseconds to pop " + n +
            " items onto a stack which contained " +
                    initializeItems + " items.");

        System.out.printf("%15s %15s %15s\n",
                "Stack Vector", "Stack LL", "Stack DLL");
        System.out.printf("%15d %15d %15d\n",
                vectorStackTime, llStackTime, dllStackTime);

        System.out.println("\nMilliseconds to dequeue " + n +
            " items from a queue which contained " +
                    initializeItems + " items.");

        System.out.printf("%15s %15s %15s\n",
                "Queue Vector", "Queue LL", "Queue DLL");
        System.out.printf("%15d %15d %15d\n",
                vectorQueueTime, llQueueTime, dllQueueTime);
    }

    //test adding method push and enqueue
    public static void testAdding()
    {
        int initializeItems =10000;
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you wish to add?");
        int n = input.nextInt();
        prepareData(initializeItems);
        //generate data for adding,
        //all stacks and queues must use the same testign data
        String[] data = generateDataForAdding(n);
        long vectorStackTime = testStackAdding(vectorStack, data);
        long llStackTime = testStackAdding(llStack, data);
        long dllStackTime = testStackAdding(dllStack, data);

        long vectorQueueTime = testQueueAdding(vectorQueue, data);
        long llQueueTime = testQueueAdding(llQueue, data);
        long dllQueueTime = testQueueAdding(dllQueue, data);

        System.out.println("\nMilliseconds to push " + n +
            " items onto a stack which contained " +
                    initializeItems + " items.");

        System.out.printf("%15s %15s %15s\n",
                "Stack Vector", "Stack LL", "Stack DLL");
        System.out.printf("%15d %15d %15d\n",
                vectorStackTime, llStackTime, dllStackTime);

        System.out.println("\nMilliseconds to enqueue " + n +
            " items into a queue which contained " +
                    initializeItems + " items.");

        System.out.printf("%15s %15s %15s\n",
                "Queue Vector", "Queue LL", "Queue DLL");
        System.out.printf("%15d %15d %15d\n",
                vectorQueueTime, llQueueTime, dllQueueTime);
    }

    //add n random string to stacks and queues
    public static void prepareData(int n)
    {
        //add 100000 random String
        for (int i = 0; i< n; i++)
        {
            String str = rand.nextInt() + "";

            dllStack.push(str);
            llStack.push(str);
            vectorStack.push(str);

            dllQueue.enqueue(str);
            llQueue.enqueue(str);
            vectorQueue.enqueue(str);
        }
    }
    //generate and return n random strings
    private static String[] generateDataForAdding(int n)
    {
        String[] results = new String[n];
        for (int i=0; i < n; i++)
        {
            results[i] = rand.nextInt() + "";
        }
        return results;
    }

    public static void main(String[] args)
    {
         System.out.println("Welcome to Project 3.");
         System.out.println("Do you want to test adding or removing items?");
         Scanner input = new Scanner(System.in);
         String command = input.nextLine().trim();

         if ( command.equalsIgnoreCase("adding") )
         {
             testAdding();
         }
         else if ( command.equalsIgnoreCase("removing") )
         {
             testRemoving();
         }
         else
         {
             System.out.println("Unknown command");
         }
    }
}
