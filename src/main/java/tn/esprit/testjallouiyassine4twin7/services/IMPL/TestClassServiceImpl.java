package tn.esprit.testjallouiyassine4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.testjallouiyassine4twin7.models.TestClass;
import tn.esprit.testjallouiyassine4twin7.services.ITestClassService;

@Primary
@AllArgsConstructor
@Service
public class TestClassServiceImpl implements ITestClassService {
    @Override
    public void add(TestClass testClass) {

    }

    @Override
    public TestClass get(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(TestClass testClass) {

    }

    @Override
    public void deleteAll() {

    }
}
