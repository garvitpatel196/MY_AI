package remotepc;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.JavaStreamingAudioPlayer;

public class TextToSpeech extends JavaStreamingAudioPlayer {

    // Default voice is Kevin16
    private static final String VOICENAME = "kevin16";
    private Voice voice;
    VoiceManager voiceManager;
    JavaStreamingAudioPlayer jcp;
    
    public void speak(String Text) throws InstantiationException {
        
        // Taking instance of voice from VoiceManager factory.
        voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICENAME);
        // Allocating voice
        voice.allocate();
        // word per minute
        voice.setRate(150);
        voice.setPitch(110);
        // open up standard input
        jcp = (JavaStreamingAudioPlayer) voice.getDefaultAudioPlayer();
        voice.speak(Text);     
    }

    public void Pause() throws InterruptedException, InstantiationException {
        
        jcp.pause();
    }

    public void Stop() {
        jcp.cancel();
    }

    public void Resume() {

        jcp.resume();
    }

    public void Restart(String str) {
        voice.speak(str);
    }

}
