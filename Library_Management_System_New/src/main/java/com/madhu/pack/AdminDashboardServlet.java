import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.library.Librarian;
import com.example.library.LibraryService;

public class AdminDashboardServlet extends HttpServlet {

    private LibraryService libraryService;

    @Override
    public void init() throws ServletException {
        super.init();
        libraryService = new LibraryService(); // initialize the library service
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get the list of librarians from the library service
        List<Librarian> librarians = libraryService.getLibrarians();

        // set the librarians as an attribute of the request
        request.setAttribute("librarians", librarians);

        // forward the request to the JSP page to display the dashboard
        request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        // handle the add librarian action
        if ("addLibrarian".equals(action)) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // create a new librarian
            Librarian librarian = new Librarian(name, email, password);

            // add the librarian to the library service
            libraryService.addLibrarian(librarian);
        }

        // handle the logout action
        if ("logout".equals(action)) {
            // invalidate the session and redirect to the login page
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }

        // redirect to the dashboard
        response.sendRedirect(request.getContextPath() + "/adminDashboard");
    }

}
