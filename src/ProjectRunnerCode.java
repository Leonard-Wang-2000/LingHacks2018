
import basic.tts.Voice;

public class ProjectRunnerCode {
	Song Havana = new Song(186);

	String testSyl = "ha";
	
	static int instant = 1000;
	static int eighthNote = 95;
	static int penta = 20;
	static int sixteenthNote = 160;
	static int triplet = 130;
	
	private Voice v;
	
	public ProjectRunnerCode(){
		v = new Voice("kevin16");
	}
	
	public void playSong(){
		Intro();
		playChorus();
		playVerse();
		playChorus();
	}
	
	public void pause(){		
		try {
			Thread.sleep(450);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Intro(){
		try {
			Thread.sleep(7600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void playVerse(){
		phrase1();	
		phrase1();
		phrase2();
		phrase1();
		
		v.setRate(triplet);
		String p = "";
		for(int i = 0; i < 5; i++){
			p += " " + testSyl;
			
		}
		v.say(p);
		
		longNote();
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 7; i++){
			p += " " + testSyl; 
			
		}
		p += ".";
		for(int i = 0; i < 7; i++){
			p += " " + testSyl; 
			
		}
		v.say(p);
		
		pause();
		
		v.setRate(sixteenthNote);
		for(int i = 0; i < 5; i++){
			p += " " + testSyl; 
			
		}
		
		longNote();
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 7; i++){
			p += " " + testSyl; 
			
		}
		p += ".";
		for(int i = 0; i < 5; i++){
			p += " " + testSyl; 
			
		}
		p += ".";
		for(int i = 0; i < 6; i++){
			p += " " + testSyl; 
			
		}
		v.say(p);
	}
	
	public void phrase1(){
		v.setRate(sixteenthNote);
		String p = "";
		for(int i = 0; i < 3; i++){
			p += " " + testSyl; 
			
		}
		p += ".";
		
		for(int i = 0; i < 3; i++){
			p += " " + testSyl; 
			
		}
		
		v.say(p);
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 4; i++){
			p += " " + testSyl; 
			
		}
		
		v.say(p);
		
		pause();
	}
	
	public void phrase2(){
		v.setRate(sixteenthNote);
		String p = "";
		for(int i = 0; i < 3; i++){
			p += " " + testSyl; 
			
		}
		v.say(p);
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 5; i++){
			p += " " + testSyl; 
			
		}
		
		v.say(p);
		
		pause();
	}
	
	public void longNote(){
		v.setRate(penta);
		String p = testSyl;
		
		v.say(p);
	}
	
	public void playChorus(){
		v.setRate(eighthNote);
		String p1 = "";
		for(int i = 0; i < 6; i++){
			p1 += " " + testSyl; 
			
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 12; i++){
			p1 += " " + testSyl; 
			
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 12; i++){
			p1 += " " + testSyl; 
			
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 9; i++){
			p1 += " " + testSyl; 
			
		}

		p1 += ".";
		for(int i = 0; i < 7; i++){
			p1 += " " + testSyl; 
			
		}
		
		p1 += ".";
		for(int i = 0; i < 6; i++){
			p1 += " " + testSyl; 
			
		}
		v.say(p1);
		
	}
	
}
