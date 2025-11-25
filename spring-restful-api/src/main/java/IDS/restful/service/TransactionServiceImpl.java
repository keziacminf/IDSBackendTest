package IDS.restful.service;

import IDS.restful.dto.ViewDataResponse;
import IDS.restful.model.StatusItem;
import IDS.restful.model.Transaction;
import IDS.restful.repository.StatusRepository;
import IDS.restful.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final StatusRepository statusRepository;

    @Override
    public ViewDataResponse getViewData() {
        ViewDataResponse response = new ViewDataResponse();

        List<StatusItem> statuses = statusRepository.findAll();
        List<Transaction> transactions = transactionRepository.findAll();

        response.setStatus(statuses);
        response.setData(transactions);

        return response;
    }
}