package com.blackpensoftware.stronghold_soldiers.handlers;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawHandler extends JPanel{
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;	// Converts the graphics to the Graphics2D system
		g2d.fillRect(0,  0, 200, 200);
	}// End of drawPanel
}// End of class