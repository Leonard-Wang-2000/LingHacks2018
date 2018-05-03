package basic.tts;

import com.sun.speech.freetts.VoiceManager;

public class Voice {
	private String name;
	private com.sun.speech.freetts.Voice voice;
	
	public Voice(String name){
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name);
		this.voice.allocate();
	}
	
	public void say(String text){
		this.voice.speak(text);
	}
	
	public void setRate(int rate){
		this.voice.setRate(rate);
	}
	
	public void setVolume(float vol){
		this.voice.setVolume(vol);
	}
	
	public float getVolume(){
		return this.voice.getVolume();
	}
	
	public void setPitch(float d){
		this.voice.setPitch(d);
	}
	
	public void sayMultiple(String[] text){
		for(int i = 0; i < text.length; i++){
			say(text[i]);
		}
	}
}
