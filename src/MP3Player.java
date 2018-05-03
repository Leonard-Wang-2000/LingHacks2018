import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javax.swing.JComboBox;


public class MP3Player {
	private JFrame frame;
	private JTextField pathFieldSong;
	private File songFile;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					MP3Player window = new MP3Player();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MP3Player() throws Exception {
		initialize();
	}


	private void initialize() throws Exception {
		frame = new JFrame();
		frame.setTitle("MP3 Player");
		frame.setBounds(100, 100, 275, 176);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlayVersion = new JButton("Play Random Words");
		btnPlayVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() { 
			        public void run() {
			        	playSong();
			        }
			    }.start();
			    new Thread() { 
			        public void run() {
			            playVersion1();
			        }
			    }.start();
			}
		});
		btnPlayVersion.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnPlayVersion.setBounds(10, 41, 253, 55);
		frame.getContentPane().add(btnPlayVersion);
		
		JButton PlayButton = new JButton("Play HAHA");
		PlayButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		PlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() { 
			        public void run() {
			        	playSong();
			        }
			    }.start();
			    new Thread() { 
			        public void run() {
			            playVersion2();
			        }
			    }.start();
			}
		});
		PlayButton.setBounds(10, 93, 253, 55);
		frame.getContentPane().add(PlayButton);
		
		JButton OpenButtonSong = new JButton("Open");
		OpenButtonSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openSong();
			}
		});
		OpenButtonSong.setBounds(174, 9, 89, 23);
		frame.getContentPane().add(OpenButtonSong);
		
		pathFieldSong = new JTextField();
		pathFieldSong.setEditable(false);
		pathFieldSong.setForeground(Color.BLACK);
		pathFieldSong.setText("SongPath");
		pathFieldSong.setBounds(10, 9, 154, 20);
		frame.getContentPane().add(pathFieldSong);
		pathFieldSong.setColumns(10);
		

		
	}
		
	private void openSong() {
		try {
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Choose Song to Play");
			chooser.showOpenDialog(null);
			songFile = chooser.getSelectedFile();
			pathFieldSong.setText(songFile.getAbsolutePath());
			if (!songFile.getName().endsWith(".mp3")){
				JOptionPane.showMessageDialog(null, "Invalid File Type Selected", "Error", JOptionPane.ERROR_MESSAGE);
				openSong();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private void playSong(){
		try {
			AdvancedPlayer SongPlayer = new AdvancedPlayer(new FileInputStream(songFile));
			SongPlayer.play();
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
			JOptionPane.showMessageDialog(null, "No File Selected", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	
	private void playVersion1(){
		LyricSpeech lyric = new LyricSpeech();
		lyric.playSong();
	}
	private void playVersion2(){
		ProjectRunnerCode lyric = new ProjectRunnerCode();
		lyric.playSong();
	}
}