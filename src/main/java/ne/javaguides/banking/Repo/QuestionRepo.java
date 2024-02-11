package ne.javaguides.banking.Repo;

import ne.javaguides.banking.DAO.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
