import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/subscribe")
public class SubscriberServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3309/user";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Sushii@12";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userIdStr = request.getParameter("userId");
        String username = request.getParameter("username");

        if (userIdStr == null || username == null || username.trim().isEmpty()) {
            response.getWriter().println("Invalid input!");
            return;
        }

        int userId;
        try {
            userId = Integer.parseInt(userIdStr);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid userId!");
            return;
        }

        String sql = "INSERT INTO userdata (userId, username) VALUES (?, ?)";

        try (
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
        	Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement.setInt(1, userId);
            preparedStatement.setString(2, username);

            int result = preparedStatement.executeUpdate();

            if (result > 0) {
                response.getWriter().println("Subscription successful!");
            } else {
                response.getWriter().println("Subscription failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.getWriter().println("Database driver not found!");
        }
    }
}
