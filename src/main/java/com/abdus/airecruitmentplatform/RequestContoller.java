package com.abdus.airecruitmentplatform;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RequestContoller {

    private final service servie1;

    public RequestContoller(service servie1) {
        this.servie1 = servie1;
    }

@PostMapping("/Candidate")
    public String Candidateobj(
            @Valid @RequestBody candidate candidateObje
    ) {

        String result = servie1.message(candidateObje);

        return result;
    }
}