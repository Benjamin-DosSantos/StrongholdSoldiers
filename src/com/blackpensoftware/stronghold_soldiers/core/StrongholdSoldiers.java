package com.blackpensoftware.stronghold_soldiers.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import com.blackpensoftware.stronghold_soldiers.handlers.DrawHandler;
import com.blackpensoftware.stronghold_soldiers.handlers.FrameHandler;

public class StrongholdSoldiers {
	public static void main(String[] args){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth(),
		    height = (int)screenSize.getHeight(),
		    xPos = 0,
			yPos = 0;
		Color bgColor = Color.DARK_GRAY;
		String frame_title = "Stronghold Soldier";
	
		FrameHandler frame = new FrameHandler();
		frame.setTitle(frame_title);
		frame.setLocation(xPos, yPos);
		frame.setBackground(bgColor);
		frame.setSize(width, height);
		frame.genFrame();
		
		
	}// End of main method
}// End of class
