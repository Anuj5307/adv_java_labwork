package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Tofindage")
public class AgeCalculation extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("html");
		   PrintWriter time=response.getWriter();

		int year=Integer.parseInt(request.getParameter("year"));
		int month=Integer.parseInt(request.getParameter("month"));
		int day=Integer.parseInt(request.getParameter("day"));

		LocalDate today=LocalDate.now();
		int yea=LocalDate.now().getYear();
		LocalDate past=LocalDate.of(year,month,day);
		
		Month mont=LocalDate.now().getMonth();
		time.println("today:"+today);
		time.println("past:"+past);
		time.println("present months:"+mont);
		time.println("years:"+yea);
		
		//int hours=Integer.parseInt(request.getParameter("hours"));
		//LocalDate hour=LocalDate.now().getHour();
		
		
		//Period period=Period.between(past,today);
		int years=Period.between(past,today).getYears();
		int months=Period.between(past,today).getMonths();
		int days=Period.between(past,today).getDays();
		
		time.write("Years :=" +years +" "+"Months:="+months +" "+"days:="+days);
		
		
	}

}
