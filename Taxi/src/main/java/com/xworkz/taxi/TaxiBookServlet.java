package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(value ="/book")
public class TaxiBookServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	TaxiService service = new TaxiServiceImpl();
	
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	
	TaxiDto book = service.bookTaxi();	
	writer.println("Taxi booked successfully<br>");
	
	if(book!=null) {
		writer.println(book.getId());
		writer.println(book.getTaxiNo());
		writer.println(book.getLocation());
		writer.println(book.getEarnings());
	}else {
		writer.println("Taxi is not available");
	}
	
	
	
}

}
