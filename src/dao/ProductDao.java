import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public List<Product> getProduct() throws ClassNotFoundException, SQLException {
        List<Product> products = new ArrayList<Product>();
        Connection con = (new Ketnoi()).connectionInfo();
        String sql = "select * from product";
        try {
            PreparedStatement prestate = con.prepareStatement(sql);
            ResultSet rs = prestate.executeQuery();

            while(rs.next()) {
                Product s = new Product();

                products.add(s);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}
