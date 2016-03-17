package com.blackpensoftware.stronghold_soldiers.handlers;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameHandler {
	String mainframe_title = "";
	
	int mainframe_xPos = 0,
		mainframe_yPos = 0,
		mainframe_width = 100,
		mainframe_height = 100;
	
	Color mainpanel_bgcolor = Color.WHITE;
	
	JFrame mainframe = new JFrame("");
	DrawHandler draw_handler = new DrawHandler();
	
	public void genFrame(){
		mainframe.setVisible(true);
		mainframe.add(draw_handler);
	}// End of genFrame method
	
	public void setSize(int width, int height){
		mainframe_width = width;
		mainframe_height = height;
		mainframe.setSize(mainframe_width, mainframe_height);
	}// End of setSize method
	
	public void setBackground(Color bgColor){
		mainpanel_bgcolor = bgColor;
		draw_handler.setBackground(mainpanel_bgcolor);
	}// End of setBackground method
	
	public void setLocation(int xPos, int yPos){
		mainframe_xPos = xPos;
		mainframe_yPos = yPos;
		draw_handler.setLocation(mainframe_xPos, mainframe_yPos);
	}// End of setLocation method
	
	public void setTitle(String title){
		mainframe_title = title;
		mainframe.setTitle(mainframe_title);
	}// End of setTitle method
}// End of class 
