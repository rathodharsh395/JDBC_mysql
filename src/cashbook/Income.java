package cashbook;
import java.sql.Date;

public class Income {
    private int incomeId;
    private String incomeTitle;
    private int incomeAmount;
    private Date incomeDate;

    public Income() {
    }

    public Income(int incomeId,String incomeTitle,int incomeAmount,Date incomeDate){
        this.incomeId = incomeId;
        this.incomeTitle=incomeTitle;
        this.incomeAmount=incomeAmount;
        this.incomeDate=incomeDate;
    }
    @Override
    public String toString() {
        return "Income{" +
                "incomeId=" + incomeId +
                ", incomeTitle='" + incomeTitle + '\'' +
                ", incomeAmount=" + incomeAmount +
                ", incomeDate=" + incomeDate +
                '}';
    }
}
