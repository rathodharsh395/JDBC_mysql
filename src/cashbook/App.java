package cashbook;
import java.sql.Date;
import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws SQLException {
        ExpenseManager expenseManager=new ExpenseManager();
        expenseManager.addExpense(acceptExpense());

        List<Expense> allexpenses= expenseManager.getAllExpenses();
        for(Expense expense: allexpenses){
            System.out.println(expense);
        }
    }
    public static Expense acceptExpense(){
        Scanner hr=new Scanner(System.in);
        System.out.println("Enter the expense title");
        String expenseTitle=hr.nextLine();

        System.out.println("Enter the expense note");
        String expenseNotes= hr.nextLine();

        System.out.println("Enter the expense amount");
        int expenseAmount= hr.nextInt();

       /* System.out.println("Enter the expense date");
        Date expenseDate=Date.valueOf(hr.nextLine());*/

        Expense expense=new Expense();
        expense.setExpenseTitle(expenseTitle);
        expense.setExpenseAmount(expenseAmount);
        expense.setNotes(expenseNotes);
        // expense.setExpenseDate(expenseDate);

        return expense;
    }
}
