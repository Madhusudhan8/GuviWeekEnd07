import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LibrarianLoginServlet")
public class LibrarianLoginServlet extends HttpServlet {
    private LibraryService libraryService = new LibraryService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (libraryService.authenticateLibrarian(email, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);

            response.sendRedirect("librarian-dashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid email or password.");
            request.getRequestDispatcher("librarian-login.jsp").forward(request, response);
        }
    }
}
