package IDS.restful.controller;

import IDS.restful.dto.ViewDataResponse;
import IDS.restful.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/viewData")
    public ResponseEntity<ViewDataResponse> getViewData() {
        return ResponseEntity.ok(transactionService.getViewData());
    }
}