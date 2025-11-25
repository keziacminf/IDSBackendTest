package IDS.restful.dto;

import IDS.restful.model.Transaction;
import IDS.restful.model.StatusItem;
import lombok.Data;

import java.util.List;

@Data
public class ViewDataResponse {
    private List<StatusItem> status;
    private List<Transaction> data;
}