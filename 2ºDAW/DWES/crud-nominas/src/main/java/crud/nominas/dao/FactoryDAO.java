package crud.nominas.dao;

public class FactoryDAO {

    public static <T> T getDao(Class<T> daoClass) {
        if (daoClass == EmployeeDao.class) {
            return daoClass.cast(EmployeeDaoImpl.getInstance());
        } else if (daoClass == EmployeeDaoImpl.class) {
            return daoClass.cast(EmployeeDaoImpl.getInstance());
        }
        throw new IllegalArgumentException("Unknown DAO class: " + daoClass);
    }
}