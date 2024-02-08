package com.rocketseat.certification_nlw.modules.students.entities;
import java.util.List;
import java.util.UUID;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CertificationStudentEntity {
    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntities;
}
