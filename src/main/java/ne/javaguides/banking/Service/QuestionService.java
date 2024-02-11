package ne.javaguides.banking.Service;

import ne.javaguides.banking.DAO.Question;
import ne.javaguides.banking.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getAllQuestion() {
         return questionRepo.findAll();
    }
}