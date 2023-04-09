package cashbook;
import java.sql.Date;

public class Expense {
    private int expenseId;
    private String expenseTitle;
    private int expenseAmount;
    private Date expenseDate;
    private String notes;

    public Expense() {
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public int getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(int expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", expenseTitle='" + expenseTitle + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", expenseDate=" + expenseDate +
                ", notes='" + notes + '\'' +
                '}';
    }
}
