import basic.tts.Voice;

public class LyricSpeech {
	Song Havana = new Song(186);
	
	static int instant = 1000;
	static int eighthNote = 95;
	static int penta = 20;
	static int sixteenthNote = 160;
	static int triplet = 130;
	
	private Voice v;
	
	public LyricSpeech(){
		v = new Voice("kevin16");
		
		v.setVolume(v.getVolume()+40);
		v.setPitch((float) 125);
		
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
			p += " " + Havana.getOneSyllable();
		}
		v.say(p);
		
		longNote();
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 7; i++){
			p += " " + Havana.getOneSyllable();
		}
		p += ".";
		for(int i = 0; i < 7; i++){
			p += " " + Havana.getOneSyllable();
		}
		v.say(p);
		
		pause();
		
		v.setRate(sixteenthNote);
		for(int i = 0; i < 5; i++){
			p += " " + Havana.getOneSyllable();
		}
		
		longNote();
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 7; i++){
			p += " " + Havana.getOneSyllable();
		}
		p += ".";
		for(int i = 0; i < 5; i++){
			p += " " + Havana.getOneSyllable();
		}
		p += ".";
		for(int i = 0; i < 3; i++){
			String[] temp = Havana.getTwoSyllable();
			p += " " + temp[0] + temp[1];
		}
		v.say(p);
	}
	
	public void phrase1(){
		v.setRate(sixteenthNote);
		String p = "";
		for(int i = 0; i < 1; i++){
			String[] temp = Havana.getThreeSyllable();
			p += " " + temp[0] + temp[1] + temp[2];
		}
		p += ".";
		
		for(int i = 0; i < 1; i++){
			String[] temp = Havana.getThreeSyllable();
			p += " " + temp[0] + temp[1] + temp[2];
		}
		
		v.say(p);
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 2; i++){
			String[] temp = Havana.getTwoSyllable();
			p += " " + temp[0] + temp[1];
		}
		
		v.say(p);
		
		pause();
	}
	
	public void phrase2(){
		v.setRate(sixteenthNote);
		String p = "";
		for(int i = 0; i < 1; i++){
			String[] temp = Havana.getThreeSyllable();
			p += " " + temp[0] + temp[1] + temp[2];
		}
		v.say(p);
		
		v.setRate(triplet);
		p = "";
		for(int i = 0; i < 5; i++){
			p += " " + Havana.getOneSyllable();
		}
		
		v.say(p);
		
		pause();
	}
	
	public void longNote(){
		v.setRate(penta);
		String p = Havana.getOneSyllable();
		v.say(p);
	}
	
	public void playChorus(){
		v.setRate(eighthNote);
		String p1 = "";
		for(int i = 0; i < 3; i++){
			String[] temp = Havana.getTwoSyllable();
			p1 += " " + temp[0] + temp[1];
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 4; i++){
			String[] temp = Havana.getThreeSyllable();
			p1 += " " + temp[0] + temp[1] + temp[2];
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 4; i++){
			String[] temp = Havana.getThreeSyllable();
			p1 += " " + temp[0] + temp[1] + temp[2];
		}
		v.say(p1);
		
		pause();
		
		v.setRate(eighthNote);
		p1 = "";
		for(int i = 0; i < 3; i++){
			String[] temp = Havana.getThreeSyllable();
			p1 += " " + temp[0] + temp[1] + temp[2];
		}

		p1 += ".";
		for(int i = 0; i < 7; i++){
			p1 += " " + Havana.getOneSyllable();
		}
		
		p1 += ".";
		for(int i = 0; i < 3; i++){
			String[] temp = Havana.getTwoSyllable();
			p1 += " " + temp[0] + temp[1];
		}
		v.say(p1);
		
	}
	
}
