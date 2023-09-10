package com.xworkz.college;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(value = "/save")
public class CollegeServlet extends HttpServlet {

//	private String name;
//	private String location;
//	private String noOfStudents;
//	private String noOfStaffs;
//	private CollegeDto dto;

	CollegeServiceImpl service = new CollegeServiceImpl();

	CollegeDto dto = new CollegeDto();

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();

		writer.println("<html>\r\n" + "    <head>\r\n" + "        <style>\r\n" + "            input {\r\n"
				+ "                padding: 10px;\r\n" + "                margin: 10px;\r\n" + "            }\r\n"
				+ "        </style>\r\n" + "        <title></title>\r\n" + "    </head>\r\n" + "    <body>\r\n"
				+ "        <div style=\"text-align: center;\">\r\n"
				+ "        <h1>Create An Account for college</h1>\r\n"
				+ "        <form action=\"save\" method=\"get\" >\r\n"
				+ "            <div><input type=\"text\" name=\"name\" placeholder=\"name\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"location\" placeholder=\"location\"></div>\r\n"
				+ "            <div><input type=\"number\" name=\"noOfStudents\" placeholder=\"noOfStudents\"></div>\r\n"
				+ "           <div> <input type=\"number\" name=\"noOfStaffs\" placeholder=\"noOfStaffs\"></div>\r\n"
				+ "            <div><button type=\"submit\">Create Account</button></div>\r\n" + "        </form>\r\n"
				+ "    </div>\r\n" + "    </body>\r\n" + "</html>");

		String name = req.getParameter("name");
		String location = req.getParameter("location");
		String noOfStudents = req.getParameter("noOfStudents");
		String noOfStaffs = req.getParameter("noOfStaffs");

		CollegeDto dto = new CollegeDto(name, location, noOfStudents, noOfStaffs);

		service.save(dto);
		req.getRequestDispatcher("/Test.jsp").forward(req, res);

	}

}
