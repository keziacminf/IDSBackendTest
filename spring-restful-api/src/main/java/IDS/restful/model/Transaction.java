package IDS.restful.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "transaction_data")
public class Transaction {

    @Id
    private Long id;

    private String productID;
    private String productName;
    private String amount;
    private String customerName;

    private Long status;
    private Date transactionDate;

    private String createBy;
    private Date createOn;
}