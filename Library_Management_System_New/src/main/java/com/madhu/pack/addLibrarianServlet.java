import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddLibrarianServlet")
public class AddLibrarianServlet extends HttpServlet {
    private LibraryService libraryService = new LibraryService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Librarian librarian = new Librarian(name, email, password);
        libraryService.addLibrarian(librarian);

        response.sendRedirect("admin-dashboard.jsp");
    }
}
