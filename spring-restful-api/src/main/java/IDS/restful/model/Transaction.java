package IDS.restful.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

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
    private LocalDateTime transactionDate;
    private String createBy;
    private LocalDateTime createOn;
}