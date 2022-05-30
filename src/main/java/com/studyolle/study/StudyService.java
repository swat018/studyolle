package com.studyolle.study;

import com.studyolle.domain.Account;
import com.studyolle.domain.Study;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class StudyService {

    private final StudyRepository repositiry;

    public Study createNewStudy(Study study, Account account) {
        Study newStudy = repositiry.save(study);
        newStudy.addManager(account);

        return newStudy;
    }
}
