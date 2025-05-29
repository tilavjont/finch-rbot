public class FinchMove {
	public static void main(String[] args) {
      Finch m = new Finch();
      
      while(m.getDistance() < 5) {
          int note = (int)(Math.Random*104)+32;
        	int beat = (int)(Math.Random*17);
        	m.setBeak(162, 0, 255);
        	m.playNote(note, beat);
            m.setMotors(50, 50);
      }
      

      
      m.stopAll();
      m.disconnect();
}
}
