package com.abdus.airecruitmentplatform;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class service {

    private final JavaMailSender sender;
    private final EmailService emailService;
    private final CandidateRepository candidateRepository;

    public service(
            JavaMailSender sender,
            EmailService emailService,
            CandidateRepository candidateRepository
    ) {
        this.sender = sender;
        this.emailService = emailService;
        this.candidateRepository = candidateRepository;
    }

    public String message(candidate candidateObje) {

        String resulth = emailService.leetsplit(candidateObje);

        if (resulth.equals("Email does not supported")) {
            return resulth;
        }


if(candidateRepository.existsByEmail(candidateObje.getEmail())){
return "Candidate already exists";



}
candidateRepository.save(candidateObje);


        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(candidateObje.getEmail());
        message.setSubject("Candidate Information");
        message.setText(
                "Password: " + candidateObje.getPassword()
        );

        sender.send(message);

        return "Email send ";
    }
}