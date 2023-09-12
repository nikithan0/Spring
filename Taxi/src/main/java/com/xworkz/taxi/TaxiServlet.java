package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;


@WebServlet(value="/send")
public class TaxiServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String taxiNo = req.getParameter("taxiNo");
		String earnings = req.getParameter("earnings");
		String available = req.getParameter("available");
		String location = req.getParameter("location");
		String trips = req.getParameter("trips");
		System.out.println("----------------------");
		System.out.println(id);
		System.out.println(taxiNo);
		System.out.println(earnings);
		System.out.println(available);
		System.out.println(location);
		System.out.println(trips);
		
    	TaxiDto dto = new TaxiDto(Integer.valueOf(id), Integer.valueOf(taxiNo),Integer.valueOf(earnings), Boolean.valueOf(available), location, trips);
    	
    	TaxiService service = new TaxiServiceImpl();
    	System.out.println(dto);
    	boolean saving = service.save(dto);
    	System.out.println(saving);
//    	service.dtoExist(dto.getLocation());
    	
    	if(saving==true) {
    		req.getRequestDispatcher("/ReadTaxi.jsp").forward(req, resp);
    		System.out.println(" Data is valid & Succesfully saved");
		} else {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.println("Data not valid so not saved");
			req.getRequestDispatcher("taxi.jsp").include(req, resp);
    		
    		
    		
    	}
		
	}

}
