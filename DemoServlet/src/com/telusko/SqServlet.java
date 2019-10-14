package com.telusko;

import java.io.IOException;

import javax.servlet.http.*;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{

		
		int k = 0;
		
//		HttpSession session = req.getSession();
//		
//		k = (int)session.getAttribute("k");
		
		Cookie cookies [] = req.getCookies();
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		res.getWriter().println("result is : " + k);
	}
}
