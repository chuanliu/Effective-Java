package thread.jack.com;

public class Producer extends Thread {
	Queue queue;
	Producer (Queue queue){
		this.queue=queue;
	}

	public void  run() {
		for(int i=1; i<5; i++){
			queue.put(i);
		}
	}
}
