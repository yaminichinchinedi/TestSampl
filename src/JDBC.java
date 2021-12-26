import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost/employeedb","username","password");
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from employee");
        ){
            List<String> emp = new ArrayList<>();
            while(r.next()){


                String e = new String();
              /*  e.setId(r.getInt("id"));
                e.setName(r.getString("name"));
                e.setSalary(r.getDouble("salary"));*/

                emp.add(e);
            }

            emp.stream().forEach(System.out::println);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}

