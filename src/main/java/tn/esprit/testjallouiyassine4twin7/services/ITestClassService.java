package tn.esprit.testjallouiyassine4twin7.services;

import tn.esprit.testjallouiyassine4twin7.models.TestClass;

public interface ITestClassService {
    public void add(TestClass testClass);

    public TestClass get(int id);

    public void delete(int id);

    public void update(TestClass testClass);

    public void deleteAll();

}
