package cashbook;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ExpenseManager{

    void addExpense(Expense expense)throws SQLException{
        String insertExpenseQuery="insert into expense(title,amount,date,notes) value(?,?,?,?)";

        Connection connection= ConnectionUtil.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(insertExpenseQuery);
        preparedStatement.setString(1,expense.getExpenseTitle());
        preparedStatement.setInt(2,expense.getExpenseAmount());
        preparedStatement.setDate(3,expense.getExpenseDate());
        preparedStatement.setString(4,expense.getNotes());

        int inserted = preparedStatement.executeUpdate();
        System.out.println("Expenses added in the table:"+inserted);
         connection.close();
    }

    List<Expense> getAllExpenses()throws SQLException {
        Connection connection= ConnectionUtil.getConnection();
        Statement statement=connection.createStatement();
        ResultSet result =statement.executeQuery("select * from expense");
        List<Expense> expenseList=new ArrayList<>();
        while (result.next()){
            Expense expense=new Expense();
            expense.setExpenseId(result.getInt("id"));
            expense.setExpenseTitle(result.getString("title"));
            expense.setExpenseAmount(result.getInt("amount"));
            expense.setNotes(result.getString("notes"));
            expense.setExpenseDate(result.getDate("date"));

            expenseList.add(expense);

        }
        connection.close();

        return expenseList;
    }
}
