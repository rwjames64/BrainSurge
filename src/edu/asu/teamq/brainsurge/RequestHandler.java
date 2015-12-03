package edu.asu.teamq.brainsurge;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.asu.teamq.brainsurge.authentication.AuthenticationHandler;
import edu.asu.teamq.brainsurge.authentication.AuthenticationHandlerImpl;
import edu.asu.teamq.brainsurge.authentication.User;
import edu.asu.teamq.brainsurge.content.Content;
import edu.asu.teamq.brainsurge.content.ContentHandler;
import edu.asu.teamq.brainsurge.content.ContentHandlerImpl;
import edu.asu.teamq.brainsurge.view.View;
import edu.asu.teamq.brainsurge.view.ViewImpl;

/**
 * The RequestHandler handles all requests for BrainSurge and serves as the
 * Controller. Requests are parsed to the page requested and the parameters
 * entered and sent to the appropriate components to process the request.
 */
@WebServlet("/")
public class RequestHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AuthenticationHandler authenticationHandler;
	private ContentHandler contentHandler;
	private View view;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestHandler() {
        super();

        authenticationHandler = new AuthenticationHandlerImpl();
        contentHandler = new ContentHandlerImpl();
        view = new ViewImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getServletPath().substring(1);
		Map<String, String[]> params = request.getParameterMap();
		
		User user = authenticationHandler.getUser("");
		Content content = contentHandler.get(user, page, params);
		response.getWriter().print(view.format(content, user));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
