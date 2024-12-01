package crud.nominas;

import crud.nominas.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByDni(String dni);

    @Query ("SELECT e FROM Employee e WHERE " +
            "(:name IS NULL OR e.name LIKE %:name%) AND " +
            "(:dni IS NULL OR e.dni = :dni) AND " +
            "(:gender IS NULL OR e.gender = :gender) AND " +
            "(:category IS NULL OR e.category = :category) AND " +
            "(:work_years IS NULL OR e.work_years = :work_years)")
    List<Employee> findByFilters(@Param ("name") String name,
                                 @Param ("dni") String dni,
                                 @Param ("gender") String gender,
                                 @Param ("category") Integer category,
                                 @Param ("work_years") Integer work_years);


    boolean existsByDni(String dni);
}