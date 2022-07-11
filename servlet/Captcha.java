package com.cdac.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Captcha
 */
@WebServlet("/Captcha")
public class Captcha extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		
		
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String captcha ="";
		for(int i=0; i<=7; i++) {
			int res=(int) (Math.random() *str.length());
			captcha+=str.charAt(res);
			
		}
		//now the code for sending the captcha as an image
		BufferedImage img = new BufferedImage(150, 50, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 150, 40);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Serfi", Font.BOLD, 32));
		g.drawString(captcha, 25, 35);
		
		//FileOutputStream out = new FileOutputStream("myimage.jpg");
		ImageIO.write(img, "jpeg", out);


	
	}

}
