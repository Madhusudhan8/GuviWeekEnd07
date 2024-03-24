import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LibrarianDashboardServlet")
public class LibrarianDashboardServlet extends HttpServlet {
    private LibraryService libraryService = new LibraryService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Book> books = libraryService.getAllBooks();
        request.setAttribute("books", books);
        request.getRequestDispatcher("librarian-dashboard.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case "add":
                addBook(request, response);
                break;
            case "delete":
                deleteBook(request, response);
                break;
            case "edit":
                editBook(request, response);
                break;
            case "issue":
                issueBook(request, response);
                break;
            case "return":
                returnBook(request, response);
                break;
            default:
                doGet(request, response);
                break;
        }
    }

    private void addBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        libraryService.addBook(title, author, isbn);
        response.sendRedirect("LibrarianDashboardServlet");
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("id"));

        libraryService.deleteBook(bookId);
        response.sendRedirect("LibrarianDashboardServlet");
    }

  }
