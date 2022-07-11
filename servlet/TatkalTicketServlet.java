package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TatkalTicketServlet")
public class TatkalTicketServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter time=response.getWriter();
		
		
	int StartTime=10;
	int EndTime=11;
	
	LocalTime Time=LocalTime.now();
	int timeRightNow=Time.getHour();
	
	if(timeRightNow>=StartTime && timeRightNow<=EndTime) {
		time.write("You are on time please book your Ticket");
		System.out.println("You are on time please book your Ticket");
	}
	else {
		time.write("Sorry Booking time is over");
		System.out.println(" Sorry Booking time is over");
	}
	
	
	}

}
